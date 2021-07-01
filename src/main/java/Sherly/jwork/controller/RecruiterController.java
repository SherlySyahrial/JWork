package Sherly.jwork.controller;

import Sherly.jwork.*;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

/**
 *
 * @author Sherly
 * @version (10-04-2021)
 */

@RequestMapping("/recruiter")
@RestController
public class RecruiterController {

    /**
     * method getter semua recruiter
     * @return seluruh recruiter
     */
    @RequestMapping("")
    public ArrayList<Recruiter> getAllRecruiter(){
        ArrayList<Recruiter> rctr = null;
        rctr = DatabaseRecruiter.getRecruiterDatabase();
        return rctr;
    }

    /**
     * method getter recruiter menggunakan id
     * @param id
     * @return recruiter dengan id tersebut
     * @throws RecruiterNotFoundException
     */
    @RequestMapping("/{id}")
    public Recruiter getRecruiterById(@PathVariable int id) {
        Recruiter rctr = null;
        try {
            rctr = DatabaseRecruiter.getRecruiterById(id);
        } catch (RecruiterNotFoundException e) {
            e.getMessage();
            return null;
        }
        return rctr;
    }

    /**
     * method untuk menambahkan recruiter baru
     * @param name
     * @param email
     * @param phoneNumber
     * @param province
     * @param city
     * @param description
     * @return recruiter yang baru dibuat
     */
    @RequestMapping(value = "", method = RequestMethod.POST)
    public Recruiter addRecruiter(@RequestParam(value ="name") String name,
                                  @RequestParam(value ="email") String email,
                                  @RequestParam(value ="phoneNumber") String phoneNumber,
                                  @RequestParam(value ="province") String province,
                                  @RequestParam(value ="city") String city,
                                  @RequestParam(value ="description") String description){
        Location location = new Location(province, city, description);
        Recruiter rctr = new Recruiter(DatabaseRecruiter.getLastId()+1, name, email, phoneNumber, location);

        if (DatabaseRecruiter.addRecruiter(rctr)){
            return rctr;
        }
        else{
            return null;
        }
    }
}