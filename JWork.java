/**
 *
 * @author Sherly
 * @version (03-04-2021)
 */

import java.util.ArrayList;
import java.util.Calendar;
import java.util.GregorianCalendar;

public class Jwork{
    
    public static void main (String[] args){
        Calendar cal = new GregorianCalendar(2021, 4, 8);

        ArrayList<Jobseeker> arrJS = new ArrayList<Jobseeker>();
        arrJS.add(new Jobseeker(1, "Yogie", ".yogie.wisesa@ui.ac.id", "admin1234", cal));
        arrJS.add(new Jobseeker(1, "Sherly", "sherly@gmail.com", "mantapJiWa", 2021, 1, 1));
        arrJS.add(new Jobseeker(1, "Ailsa", "ailsa.sy@ui.ac.id", "aaaIIIIssHHAA"));

        arrJS.forEach((js) -> { System.out.println(js.toString()); });

        Jobseeker jsChange = arrJS.get(0);
        jsChange.setEmail("yogie.wisesa@gmail.com");
        jsChange.setPassword("123@#PaSs");
        System.out.println(jsChange.toString());

    }
}
        