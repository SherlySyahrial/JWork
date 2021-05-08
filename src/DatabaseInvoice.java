import java.util.ArrayList;

/**
 *
 * @author Sherly
 * @version (10-04-2021)
 */

public class DatabaseInvoice {
    private static ArrayList<Invoice> INVOICE_DATABASE = new ArrayList<Invoice>();
    private static int lastId;

    public static ArrayList<Invoice> getInvoiceDatabase(){
        return INVOICE_DATABASE;
    }

    public static int getLastId(){
        return lastId;
    }

    public static Invoice getInvoiceById(int id)throws InvoiceNotFoundException {
        Invoice temp = null;
        try
        {
            for (Invoice invoice : INVOICE_DATABASE)
            {
                if (id == invoice.getId())
                {
                    temp = invoice;
                }
            }
        }
        catch (Exception e)
        {
            throw new InvoiceNotFoundException(id);
        }
        return temp;
    }

    public static ArrayList<Invoice> getInvoiceByJobseeker(int jobseekerId){
        ArrayList<Invoice> temp = new ArrayList<>();
        for (int i=0; i < INVOICE_DATABASE.size(); i++) {
            if(INVOICE_DATABASE.get(i).getJobseeker().getId() == jobseekerId){
                temp.add(INVOICE_DATABASE.get(i));
                return temp;
            }
        }
        return null;
    }

    public static boolean addInvoice(Invoice invoice) throws OngoingInvoiceAlreadyExistsException {
        for(Invoice invoice : INVOICE_DATABASE) {
            if(invoice.getOngoingInvoice() == invoice.getOngoingInvoice()) {
                throw new OngoingInvoiceAlreadyExistsException (invoice);
            }
        }

        INVOICE_DATABASE.add(invoice);
        lastId = invoice.getId();
        return true;
    }


    public static boolean changeInvoiceStatus(int id, InvoiceStatus invoiceStatus){
        //Looping for Checking the input
        for (Invoice invoice : INVOICE_DATABASE) {
            if (invoice.getId() == id && invoice.getInvoiceStatus().equals(InvoiceStatus.OnGoing)) {
                invoice.setInvoiceStatus(invoiceStatus);
                return true;
            }
        }
        return false;
    }

    public static boolean removeInvoice(int id) throws InvoiceNotFoundException
    {
        for (Invoice invoice : INVOICE_DATABASE)
        {
            if (invoice.getId() == id)
            {
                INVOICE_DATABASE.remove(invoice);
                return true;
            }
        }
        throw new InvoiceNotFoundException(id);
    }

}
