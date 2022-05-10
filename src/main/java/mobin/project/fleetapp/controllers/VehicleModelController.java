package mobin.project.fleetapp.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class VehicleModelController {

    @RequestMapping("vehicle-models")
    public String index(){
        return "vehicle_models";
    }
}
