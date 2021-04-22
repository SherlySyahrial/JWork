/**
 *
 * @author Sherly
 * @version (25-03-2021)
 */
public class DatabaseInvoice
{
    private static ArrayList<Invoice> listInvoice;
    
    public static boolean addInvoice(Invoice Invoice){
        return false;
    }
    
    public static boolean removeInvoice(int id){
        return false;
    }
    
    public static boolean changeInvoiceStatus(int id, InvoiceStatus invoiceStatus){
        return false;
    }
    
    public static Invoice getInvoice(){
        return null;
    }
    
    public static ArrayList<Invoice> getListInvoice(){
        return listInvoice;
    }
}

