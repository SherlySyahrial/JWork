/**
 *
 * @author Sherly
 * @version (10-04-2021)
 */
package Sherly.jwork;
public class BonusNotFoundException extends Exception {
    private int bonus_error;
    public BonusNotFoundException (int bonus_input) {
        super ("Bonus ID: ");
    }
    public String getMassage() {
        return super.getMessage() + bonus_error + "not found";
    }
}