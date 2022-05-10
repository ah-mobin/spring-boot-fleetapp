package mobin.project.fleetapp.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class SupplierController {

    @RequestMapping("suppliers")
    public String index(){
        return "suppliers";
    }
}
