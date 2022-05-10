package mobin.project.fleetapp.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class VehicleController {

    @RequestMapping("vehicles-data")
    public String index(){
        return "vehicle_data";
    }
}
