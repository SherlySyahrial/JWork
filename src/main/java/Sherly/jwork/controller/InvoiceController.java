package Sherly.jwork.controller;

import Sherly.jwork.*;
import org.springframework.web.bind.annotation.*;
import java.util.ArrayList;

/**
 *
 * @author Sherly
 * @version (10-04-2021)
 */

@RequestMapping("/invoice")
@RestController
public class InvoiceController {

    /**
     * method getter semua invoice yang ada
     * @return invoice yang ada
     */
    @RequestMapping("")
    public ArrayList<Invoice> getAllInvoice() {
        return DatabaseInvoice.getInvoiceDatabase();
    }

    /**
     * method getter invoice menggunakan id
     * @param id
     * @return invoice dengan id terkait
     */
    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public Invoice getInvoiceById(@PathVariable int id) throws InvoiceNotFoundException {
        Invoice invoice = DatabaseInvoice.getInvoiceById(id);
        return invoice;
    }

    /**
     * method getter invoice menggunakan jobseekerId
     * @param JobseekerId
     * @return invoice dengan jobseeker id terkait
     */
    @RequestMapping(value = "/Jobseeker/{JobseekerId}", method = RequestMethod.GET)
    public ArrayList<Invoice> getInvoiceByJobseeker(@PathVariable int JobseekerId) {
        return DatabaseInvoice.getInvoiceByJobseeker(JobseekerId);
    }

    /**
     * method pengganti status invoice
     * @param id id dari invoice
     * @param invoiceStatus status invoice selanjutnya antara finsihed atau cancelled
     * @return invoice yang baru diganti
     */
    @RequestMapping(value = "/invoiceStatus/", method = RequestMethod.PUT)
    public Invoice changeInvoiceStatus(@RequestParam(value="id") int id,
                                       @RequestParam(value="invoiceStatus") InvoiceStatus invoiceStatus) throws InvoiceNotFoundException {
        DatabaseInvoice.changeInvoiceStatus(id, invoiceStatus);
        Invoice invoice = DatabaseInvoice.getInvoiceById(id);
        return invoice;
    }

    /**
     * method menghapus invoice dengan id
     * @param id
     * @return true jika berhasil dihapus
     */
    @RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
    public Boolean removeInvoice(@RequestParam(value="id") int id) throws InvoiceNotFoundException {
        Boolean invoice = DatabaseInvoice.removeInvoice(id);
        return invoice;
    }

    /**
     * method membuat invoice baru dengan metode pembayaran bank
     * @param jobIdList job yang diapply
     * @param jobseekerId yang melamar
     * @param adminFee biaya admin
     * @return invoice yang baru dibuat
     */
    @RequestMapping(value = "/createBankPayment", method = RequestMethod.POST)
    public Invoice addBankPayment(@RequestParam(value="jobIdList") ArrayList<Integer> jobIdList,
                                  @RequestParam(value="jobseekerId") int jobseekerId,
                                  @RequestParam(value="adminFee") int adminFee)
    {
        ArrayList<Job> foods = new ArrayList<>();
        for (int job : jobIdList) {
            try {
                foods.add(DatabaseJob.getJobById(job));
            } catch (JobNotFoundException e) {
                System.out.println(e.getMessage());
            }
        }
        try {
            Invoice invoice = new BankPayment(DatabaseInvoice.getLastId()+1, foods,
                    DatabaseJobseeker.getJobseekerById(jobseekerId), adminFee);
            DatabaseInvoice.addInvoice(invoice);
            invoice.setTotalFee();
            return invoice;
        } catch (JobSeekerNotFoundException | OngoingInvoiceAlreadyExistsException e) {
            System.out.println(e.getMessage());
            return null;
        }
    }

    /**
     * method membuat invoice baru menggunakan ewallet
     * @param jobIdList pekerjaan yang di apply
     * @param jobseekerId pelamar
     * @param referralCode kode bonus yang digunakan
     * @return invoice yang baru dibuat
     */
    @RequestMapping(value = "/createEWalletPayment", method = RequestMethod.POST)
    public Invoice addEWalletPayment(@RequestParam(value="jobIdList") ArrayList<Integer> jobIdList,
                                     @RequestParam(value="jobseekerId") int jobseekerId,
                                     @RequestParam(value="referralCode") String referralCode)
    {
        ArrayList<Job> jobs = new ArrayList<>();
        for (int job : jobIdList) {
            try {
                jobs.add(DatabaseJob.getJobById(job));
            } catch (JobNotFoundException e) {
                System.out.println(e.getMessage());
            }
        }
        try {
            Invoice invoice = new EwalletPayment(DatabaseInvoice.getLastId()+1, jobs,
                    DatabaseJobseeker.getJobseekerById(jobseekerId), DatabaseBonus.getBonusByReferralCode(referralCode));
            DatabaseInvoice.addInvoice(invoice);
            invoice.setTotalFee();
            return invoice;
        } catch (JobSeekerNotFoundException | OngoingInvoiceAlreadyExistsException e) {
            System.out.println(e.getMessage());
            return null;
        }
    }
}
