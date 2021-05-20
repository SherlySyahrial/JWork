package Sherly.jwork.controller;

import Sherly.jwork.*;
import org.springframework.web.bind.annotation.*;
import java.util.ArrayList;

@RequestMapping("/job")
@RestController
public class JobController {

    @RequestMapping(value = "", method = RequestMethod.GET)
    public ArrayList<Job> getAllJob() {
        return DatabaseJob.getJobDatabase();
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public Job getJobById(@PathVariable int id) throws JobNotFoundException {
        Job job = DatabaseJob.getJobById(id);
        return job;
    }

    @RequestMapping(value = "/recruiter/{recruiterId}", method = RequestMethod.GET)
    public ArrayList<Job> getJobByRecruiter (@PathVariable int recruiterId) throws JobNotFoundException {
        return DatabaseJob.getJobByRecruiter(recruiterId);
    }

    @RequestMapping(value = "/category/{category}", method = RequestMethod.GET)
    public ArrayList<Job> getJobByCategory (@PathVariable JobCategory category) throws JobNotFoundException {
        return DatabaseJob.getJobByCategory(category);
    }

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
