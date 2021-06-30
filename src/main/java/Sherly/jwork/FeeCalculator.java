package Sherly.jwork;
import java.util.ArrayList;
/**
 *
 * @author Sherly
 * @version (10-04-2021)
 */
public class FeeCalculator implements Runnable{

    public void run(){
        ArrayList<Invoice> list = DatabaseInvoice.getInvoiceDatabase();
        for (Invoice i : list){
            System.out.println("calculating invoice id: "+ i.getId());
            i.setTotalFee();
            System.out.println("finished calculating invoice id: "+ i.getId());

        }

    }
}
