/**
 *
 * @author Sherly
 * @version (10-04-2021)
 */

public class ReferralCodeAlreadyExistsException extends Exception {
    private int referral_error;
    public ReferralCodeAlreadyExistsException(Bonus referral_input) {
        super ("ReferralCode ID: ");
        referral_error = referral_input;
    }
    public String getMassage() {
        return super.getMessage() + referral_error + "already exists.";
    }
}