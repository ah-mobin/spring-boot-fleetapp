package mobin.project.fleetapp.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class VehicleMovementController {

    @RequestMapping("vehicle-movements")
    public String index(){
        return "vehicle_movements";
    }
}
