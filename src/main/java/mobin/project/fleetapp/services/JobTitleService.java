package mobin.project.fleetapp.services;

import mobin.project.fleetapp.models.JobTitle;
import mobin.project.fleetapp.repositories.JobTitleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class JobTitleService {
    @Autowired
    JobTitleRepository jobTitleRepository;

    public List<JobTitle> jobTitles(){
        return jobTitleRepository.findAll();
    }

    public void storeOrUpdateJobTitle(JobTitle jobTitle){
        jobTitleRepository.save(jobTitle);
    }

    public Optional<JobTitle> showJobTitleById(int id){
        return jobTitleRepository.findById(id);
    }

    public void deleteJobTitleItem(int id){
        jobTitleRepository.deleteById(id);
    }
}
