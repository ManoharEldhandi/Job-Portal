package com.jobportal.service;

import com.jobportal.model.Job;
import com.jobportal.repository.JobRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class JobService {

    private final JobRepository jobRepository;

    public JobService(JobRepository jobRepository) {
        this.jobRepository = jobRepository;
    }

    // Add a new job
    public Job addJob(Job job) {
        return jobRepository.save(job);
    }

    // Retrieve all jobs
    public List<Job> getAllJobs() {
        return jobRepository.findAll();
    }

    // Get job by ID
    public Optional<Job> getJobById(Long id) {
        return jobRepository.findById(id);
    }

    // Get jobs by company name
    public List<Job> getJobsByCompany(String company) {
        return jobRepository.findByCompany(company);
    }

    // Get jobs by location
    public List<Job> getJobsByLocation(String location) {
        return jobRepository.findByLocation(location);
    }

    // Search jobs by title (case insensitive)
    public List<Job> searchJobsByTitle(String title) {
        return jobRepository.findByTitleContainingIgnoreCase(title);
    }

    // Delete a job by ID
    public void deleteJob(Long id) {
        jobRepository.deleteById(id);
    }
}