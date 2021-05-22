package Sherly.jwork.controller;

import Sherly.jwork.*;
import org.springframework.web.bind.annotation.*;
import java.util.ArrayList;

@RequestMapping("/Invoice")
@RestController
public class InvoiceController {

    @RequestMapping(value = "", method = RequestMethod.GET)
    public ArrayList<Invoice> getAllInvoice() {
        return DatabaseInvoice.getInvoiceDatabase();
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public Invoice getInvoiceById(@PathVariable int id) throws InvoiceNotFoundException {
        Invoice Invoice = DatabaseInvoice.getInvoiceById(id);
        return Invoice;
    }

    @RequestMapping(value = "/jobseeker/{jobseekerId}", method = RequestMethod.GET)
    public ArrayList<Invoice> getInvoiceByJobseeker (@PathVariable int JobseekerId) throws InvoiceNotFoundException {
        return DatabaseInvoice.getInvoiceByJobseeker(JobseekerId);
    }

    @RequestMapping(value = "/invoiceStatus/{id}", method = RequestMethod.PUT)
    public Invoice changeInvoiceStatus(@RequestParam(value="id") int id,
                                       @RequestParam(value="invoiceStatus") InvoiceStatus invoiceStatus) throws InvoiceNotFoundException {
        DatabaseInvoice.changeInvoiceStatus(id, invoiceStatus);
        Invoice invoice = DatabaseInvoice.getInvoiceById(id);
        return invoice;
    }

    @RequestMapping(value = "/invoice/{id}", method = RequestMethod.DELETE)
    public Boolean removeInvoice(@RequestParam(value = "id") int id){
        try{
            DatabaseInvoice.removeInvoice(id);
        } catch (InvoiceNotFoundException e){
            e.getMessage();
            return false;
        }
        return true;
    }

    @RequestMapping(value = "/createCashlessInvoice", method = RequestMethod.POST)
    public Invoice BankPayment ( @RequestParam(value="JobIdList") ArrayList<Integer> JobIdList,
                                      @RequestParam(value="jobseekerId") int jobseekerId,
                                      @RequestParam(value="adminFee") int adminFee)
    {
        ArrayList<Job> Jobs = new ArrayList<>();
        for (int Job : JobIdList) {
            try {
                Jobs.add(DatabaseJob.getJobById(Job));
            } catch (JobNotFoundException e) {
                System.out.println(e.getMessage());
            }
        }
        try {
            Invoice invoice = new BankPayment (DatabaseInvoice.getLastId()+1, Jobs,
                    DatabaseJobseeker.getJobseekerById(jobseekerId), adminFee.getAdminFee(adminFee));
            DatabaseInvoice.addInvoice(invoice);
            invoice.setTotalFee();
            return invoice;
        } catch (JobSeekerNotFoundException | OngoingInvoiceAlreadyExistsException e) {
            System.out.println(e.getMessage());
            return null;
        }
    }
}
