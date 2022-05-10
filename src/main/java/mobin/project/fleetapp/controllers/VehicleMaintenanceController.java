package mobin.project.fleetapp.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class VehicleMaintenanceController {

    @RequestMapping("vehicle-maintenances")
    public String index(){
        return "vehicle_maintenances";
    }
}
