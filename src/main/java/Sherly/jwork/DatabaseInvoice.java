package Sherly.jwork;
import java.util.ArrayList;

/**
 *
 * @author Sherly
 * @version (10-04-2021)
 */

public class DatabaseInvoice {
    private static ArrayList<Invoice> INVOICE_DATABASE = new ArrayList<Invoice>();
    private static int lastId;

    /**
     * method getter invoice database
     * @return seluruh database invoice
     */
    public static ArrayList<Invoice> getInvoiceDatabase(){
        return INVOICE_DATABASE;
    }

    /**
     * method getter id invoice terakhir
     * @return id invoice terakhir
     */
    public static int getLastId(){
        return lastId;
    }

    /**
     * method getter invoice menggunakan id
     * @param id
     * @return invoice dengan id tersebut
     * @throws InvoiceNotFoundException jika tidak ditemukan
     */
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

    /**
     * method getter invoice menggunakan jobseeker
     * @param id
     * @return invoice dengan jobseeker tersebut
     */
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

    /**
     * method untuk menambahkan invoice baru
     * @param invoice
     * @return true jika berhasil ditambah
     * @throws OngoingInvoiceAlreadyExistsException jika sudah ada invoice yang berstatus ongoing
     */
    public static boolean addInvoice(Invoice invoice) throws OngoingInvoiceAlreadyExistsException {
        for(Invoice invoices : INVOICE_DATABASE) {
            if (invoices.getInvoiceStatus().equals(InvoiceStatus.OnGoing))
                throw new OngoingInvoiceAlreadyExistsException (invoice);
        }

        INVOICE_DATABASE.add(invoice);
        lastId = invoice.getId();
        return true;
    }

    /**
     * method untuk mengganti status invoice
     * @param id
     * @param invoiceStatus status antara finsihed atau cancelled
     * @return true jika berhasil diganti
     */
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

    /**
     * method untuk menghapus invoice
     * @param id untuk mencari invoice
     * @return true jika berhasil dihapus
     * @throws InvoiceNotFoundException jika invoice tidak ditemukan
     */
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
