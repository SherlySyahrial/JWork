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
    private static ArrayList<Bonus> BONUS_DATABASE;
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
    public static Bonus getBonusById(int id){
        for (int i=0; i < BONUS_DATABASE.size(); i++) {
            if(BONUS_DATABASE.get(i).getId()== id){
                return BONUS_DATABASE.get(i);
            }
        }
        return null;
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
    public static Bonus removeBonus(int id) throws BonusNotFoundException {
        Bonus temp = null;
        try
        {
            for (Bonus bonus : BONUS_DATABASE)
            {
                if (id == bonus.getId())
                {
                    temp = bonus;
                }
            }
        }
        catch (Exception e)
        {
            throw new BonusNotFoundException(id);
        }
        return temp;
    }
}
