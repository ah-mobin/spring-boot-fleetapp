package mobin.project.fleetapp.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class InvoiceStatusController {

    @RequestMapping("invoice-statuses")
    public String index(){
        return "invoice_statuses";
    }
}
