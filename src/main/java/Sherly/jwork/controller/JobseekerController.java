package Sherly.jwork.controller;

import Sherly.jwork.*;
import org.springframework.web.bind.annotation.*;

/**
 *
 * @author Sherly
 * @version (10-04-2021)
 */

@RequestMapping("/jobseeker")
@RestController
public class JobseekerController {

    /**
     * method getter seluruh jobseeker
     * @return seluruh database jobseeker
     */
    @RequestMapping("")
    public String indexPage(@RequestParam(value="name", defaultValue="world") String name) {
        return "Hello " + name;
    }

    /**
     * method getter jobseeker menggunakan id
     * @param id
     * @return jobseeker dengan id tersebut
     */
    @RequestMapping("/{id}")
    public Jobseeker getJobseekerById(@PathVariable int id) {
        Jobseeker jobseeker = null;
        try {
            jobseeker = DatabaseJobseeker.getJobseekerById(id);
        } catch (JobSeekerNotFoundException e) {
            e.getMessage();
            return null;
        }
        return jobseeker;
    }

    /**
     * method untuk registrasi jobseeker baru
     * @param name
     * @param email
     * @param password
     * @return jobseeker yang baru registrasi
     */
    @RequestMapping(value = "/{Register}", method = RequestMethod.POST)
    public Jobseeker registerJobseeker(@RequestParam(value="name") String name,
                                       @RequestParam(value="email") String email,
                                       @RequestParam(value="password") String password)
    {
        Jobseeker jobseeker = new Jobseeker(DatabaseJobseeker.getLastId()+1, name, email, password);
        try {
            if (jobseeker.getEmail().isEmpty() || jobseeker.getPassword().isEmpty()) return null;
            DatabaseJobseeker.addJobseeker(jobseeker);

        } catch (EmailAlreadyExistsException e) {
            e.getMessage();
            return null;
        }
        return jobseeker;
    }

    /**
     * method untuk login akun jobseeker
     * @param email
     * @param password
     * @return jobseeker yang baru login
     */
    @RequestMapping(value = "/login", method = RequestMethod.POST)
    public Jobseeker loginJobseeker(@RequestParam(value="email") String email,
                                    @RequestParam(value="password") String password){
        return(DatabaseJobseeker.jobseekerLogin(email, password));
    }


}