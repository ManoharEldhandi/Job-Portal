package com.jobportal.controller;

import com.jobportal.model.Job;
import com.jobportal.service.JobService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/jobs")
public class JobController {

    private final JobService jobService;

    public JobController(JobService jobService) {
        this.jobService = jobService;
    }

    @PostMapping("/add")
    public ResponseEntity<?> addJob(@RequestBody Job job) {
        return jobService.addJob(job);
    }

    @GetMapping("/all")
    public ResponseEntity<List<Job>> getAllJobs() {
        return jobService.getAllJobs();
    }

    @GetMapping("/{id}")
    public ResponseEntity<?> getJobById(@PathVariable Long id) {
        return jobService.getJobById(id);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<?> deleteJob(@PathVariable Long id) {
        return jobService.deleteJob(id);
    }
}