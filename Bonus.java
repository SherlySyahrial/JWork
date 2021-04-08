/**
 *
 * @author Sherly
 * @version (01-04-2021)
 */
public class Bonus
{
    /**
     deklarasi variabel
    */
    private int id;
    private String referralCode;
    private int extraFee;
    private int minTotalFee;
    private boolean active;
    
    /**
     * constructor dari Bonus
     * @param id: assign dari Bonus
     * @param referralCode: kode referal dari Bonus
     * @param extraFee: tambahan fee dari Bonus
     * @param minTotalFee: minimal jumlah fee dari Bonus
     * @param active: aktif dari Bonus
     */
    
    public Bonus(int id, String referralCode, int extraFee, int minTotalFee, boolean active){
        this.id = id;
        this.referralCode = referralCode;
        this.extraFee = extraFee;
        this.minTotalFee = minTotalFee;
        this.active = active; 
    }
    
    public int getId(){
        return id;
    }
    
    public String getReferralCode(){
        return referralCode;
    }
    
    public int getExtraFee(){
        return extraFee;
    }
    
    public int getMinTotalFee(){
        return minTotalFee;
    }
    
    public boolean getActive(){
        return active;
    }   
    
    public void setId(int id){
        this.id = id;
    }
    public void setReferralCode(String referralCode){     
        this.referralCode = referralCode;
    }
    public void setExtraFee(int extraFee){
        this.extraFee = extraFee;
    }
    public void setMinTotalFee(int minTotalFee){
        this.minTotalFee = minTotalFee;
    }
    public void setActive(boolean active){
        this.active = active;
    }

     public String toString(){ 
        return "====Bonus===="+
               "\nId = " + id +
                "\nReferralCode = " + referralCode +
                "\nExtraFee = " + extraFee +
                "\nMinTotalFee = " + minTotalFee +
                "\nActive Status = " + active;
    }
}