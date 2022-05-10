package mobin.project.fleetapp.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class InvoiceController {

    @RequestMapping("invoices")
    public String index(){
        return "invoices";
    }
}
