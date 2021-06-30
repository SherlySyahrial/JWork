
/**
 *
 * @author Sherly
 * @version (10-04-2021)
 */

package Sherly.jwork;
public class Bonus
{
    /**
     deklarasi variabel
     */
    private int id; //deklarasi variabel int
    private String referralCode; //deklarasi variabel String
    private int extraFee; //deklarasi variabel String
    private int minTotalFee; //deklarasi variabel String
    private boolean active;

    /**
     * constructor dari Bonus
     * @param id dari Bonus
     * @param referralCode dari Bonus
     * @param extraFee dari Bonus
     * @param minTotalFee dari Bonus
     * @param active dari Bonus
     */
    public Bonus(int id, String referralCode, int extraFee, int minTotalFee, boolean active)
    {
        this.id = id;
        this.referralCode = referralCode;
        this.extraFee = extraFee;
        this.minTotalFee = minTotalFee;
        this.active = active;
    }

    /**
     * getter id dari Bonus
     * @return id dari Bonus
     */
    public int getId()
    {
        return id;
    }

    /**
     * getter email dari Bonus
     * @return email dari Bonus
     */
    public String getReferralCode()
    {
        return referralCode;
    }

    /**
     * getter nama dari Bonus
     * @return name dari Bonus
     */
    public int getExtraFee()
    {
        return extraFee;
    }

    /**
     * getter nomor telepon dari recruiter
     * @return phonenumber dari recruiter
     */
    public int getMinTotalFee()
    {
        return minTotalFee;
    }

    /**
     * getter lokasi dari recruiter
     * @return location dari recruiter
     */
    public boolean getActive()
    {
        return active;
    }

    /**
     * setter id recruiter
     * @param id recruiter
     */
    public void setId(int id)
    {
        this.id = id;
    }

    /**
     * setter email recruiter
     * @param referralCode recruiter
     */
    public void setReferralCode(String referralCode)
    {
        this.referralCode = referralCode;
    }

    /**
     * setter nama recruiter
     * @param extraFee recruiter
     */
    public void setExtraFee(int extraFee)
    {
        this.extraFee = extraFee;
    }

    /**
     * setter nomor telepon recruiter
     * @param minTotalFee recruiter
     */
    public void setMinTotalFee(int minTotalFee)
    {
        this.minTotalFee = minTotalFee;
    }

    /**
     * setter lokasi recruiter
     * @param active recruiter
     */
    public void setActive(boolean active)
    {
        this.active = active;
    }

    /**
     * menampilkan hasil
     */
    public String toString()
    {
        return "\n====Bonus====" +
                "\nID: " + id +
                "\nReferral Code: " + referralCode +
                "\nExtra Fee: " + extraFee +
                "\nMin Total Fee: " + minTotalFee +
                "\nActive: " + active;
    }
}
