package mobin.project.fleetapp.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class JobTitleController {

    @RequestMapping("job-titles")
    public String index(){
        return "job_title";
    }
}
