package mobin.project.fleetapp.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class VehicleTypeController {

    @RequestMapping("vehicle-types")
    public String index(){
        return "vehicle_types";
    }
}
