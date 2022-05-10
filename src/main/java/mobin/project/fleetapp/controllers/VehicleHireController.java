package mobin.project.fleetapp.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class VehicleHireController {

    @RequestMapping("vehicle-hires")
    public String index(){
        return "vehicle_hires";
    }
}
