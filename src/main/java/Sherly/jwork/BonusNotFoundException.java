/**
 *
 * @author Sherly
 * @version (10-04-2021)
 */
package Sherly.jwork;
public class BonusNotFoundException extends Exception {
    private int bonus_error;

    /**
     * constructor
     * @param bonus_input passing error
     */
    public BonusNotFoundException(int bonus_input){
        super("Bonus ID : ");
        this.bonus_error = bonus_input;
    }

    /**
     * method getter pesan error
     * @return pesan error
     */
    public String getMessage() {
        return super.getMessage() + bonus_error + "not found";
    }
}