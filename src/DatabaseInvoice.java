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

    public static Invoice getInvoiceById(int id){
        for (int i=0; i < INVOICE_DATABASE.size(); i++) {
            if(INVOICE_DATABASE.get(i).getId()== id){
                return INVOICE_DATABASE.get(i);
            }
        }
        return null;
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

    public static boolean addInvoice(Invoice invoice){
        //Loop for Checking the input
        for (Invoice listInvoice : INVOICE_DATABASE) {
            if (invoice.getJobseeker().equals(listInvoice.getJobseeker()) && invoice.getInvoiceStatus() == InvoiceStatus.OnGoing) {
                return false;
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

    public static boolean removeInvoice(int id){
        for (int i=0; i < INVOICE_DATABASE.size(); i++) {
            if(INVOICE_DATABASE.get(i).getId() == id) {
                INVOICE_DATABASE.remove(i);
                return true;
            }
        }
        return false;
    }

}
