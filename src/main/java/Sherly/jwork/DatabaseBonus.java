package Sherly.jwork;
import java.util.ArrayList;

/**
 *
 * @author Sherly
 * @version (10-04-2021)
 */
public class DatabaseBonus
{
    // Mendefinisikan variabel
    private static ArrayList<Bonus> BONUS_DATABASE = new ArrayList<Bonus>();
    private static int lastId;


    /**
     * getter list object Database Job
     * @return nilai null
     */
    public static ArrayList<Bonus> getBonusDatabase(){
        return BONUS_DATABASE;
    }

    public static int getLastId(){
        return lastId;
    }

    /**
     * getter objek Database Job
     * @return nilai null
     */
    public static  Bonus getBonusById(int id) throws BonusNotFoundException{
        boolean checker = false;
        for(int i=0;i<BONUS_DATABASE.size();i++){
            if(BONUS_DATABASE.get(i).getId() == id){
                checker = true;
                return BONUS_DATABASE.get(i);
            }
        }
        //Throw disini
        throw new BonusNotFoundException(id);
    }

    public static Bonus getBonusByReferralCode(String referralCode){
        for (int i=0; i < BONUS_DATABASE.size(); i++) {
            if(BONUS_DATABASE.get(i).getReferralCode()== referralCode){
                return BONUS_DATABASE.get(i);
            }
        }
        return null;
    }

    /**
     * method untuk menambahkan objek database job
     * @return nilai false
     */
    public static boolean addBonus(Bonus bonus) throws ReferralCodeAlreadyExistsException {
        for(Bonus bonuses : BONUS_DATABASE) {
            if(bonuses.getReferralCode() == bonus.getReferralCode()) {
                throw new ReferralCodeAlreadyExistsException (bonus);
            }
        }

        BONUS_DATABASE.add(bonus);
        lastId = bonus.getId();
        return true;
    }

    public static boolean deactivateBonus(int id){
        for (int i = 0; i < BONUS_DATABASE.size(); i++) {
            if (BONUS_DATABASE.get(i).getId() == id) {
                BONUS_DATABASE.get(i).setActive(false);
                return true;
            }
        }
        return false;
    }

    /**
     * method untuk menghapus objek database job
     * @return nilai false
     */
    public boolean removeBonus (int id) throws BonusNotFoundException{
        Bonus bonus = BONUS_DATABASE.get(id);
        if (bonus != null) {
            BONUS_DATABASE.remove(bonus);
            return true;
        }
        //Throw disini
        throw new BonusNotFoundException(id);
    }
}
