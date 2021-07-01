package Sherly.jwork.controller;

import Sherly.jwork.*;
import org.springframework.web.bind.annotation.*;
import java.util.ArrayList;

/**
 *
 * @author Sherly
 * @version (10-04-2021)
 */

@RequestMapping("/job")
@RestController
public class JobController {

    /**
     * method getter semua job
     * @return seluruh job yang ada
     */
    @RequestMapping(value = "", method = RequestMethod.GET)
    public ArrayList<Job> getAllJob() {
        return DatabaseJob.getJobDatabase();
    }

    /**
     * method getter job menggunakan id
     * @param id
     * @return job ber id tersebut
     */
    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public Job getJobById(@PathVariable int id) throws JobNotFoundException {
        Job job = DatabaseJob.getJobById(id);
        return job;
    }

    /**
     * getter job berdasarkan id recruiter
     * @param recruiterId
     * @return job dengan id recruiter tersebut
     */
    @RequestMapping(value = "/recruiter/{recruiterId}", method = RequestMethod.GET)
    public ArrayList<Job> getJobByRecruiter (@PathVariable int recruiterId) throws JobNotFoundException {
        return DatabaseJob.getJobByRecruiter(recruiterId);
    }

    /**
     * getter job berdasarkan kategori
     * @param category
     * @return job dengan kategori tersebut
     */
    @RequestMapping(value = "/category/{category}", method = RequestMethod.GET)
    public ArrayList<Job> getJobByCategory (@PathVariable JobCategory category) throws JobNotFoundException {
        return DatabaseJob.getJobByCategory(category);
    }

    /**
     * method menambahkan job baru
     * @param name nama pekerjaan
     * @param recruiterId
     * @param fee gaji
     * @param category kategori pekerjaan
     * @return job yang baru dibuat
     * @throws RecruiterNotFoundException
     */
    @RequestMapping(value = "", method = RequestMethod.POST)
    public Job addJob(@RequestParam(value="name") String name,
                      @RequestParam(value="recruiterID") int recruiterId,
                      @RequestParam(value="fee") int fee,
                      @RequestParam(value="category") JobCategory category) throws RecruiterNotFoundException {
        Job job = new Job(DatabaseJob.getLastId()+1, fee, name,  category, DatabaseRecruiter.getRecruiterById(recruiterId));
        DatabaseJob.addJob(job);
        return job;
    }
}
