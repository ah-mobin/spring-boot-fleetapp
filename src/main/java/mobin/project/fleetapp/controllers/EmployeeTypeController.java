package mobin.project.fleetapp.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class EmployeeTypeController {

    @RequestMapping("employee-types")
    public String index(){
        return "employee_types";
    }
}
