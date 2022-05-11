package mobin.project.fleetapp.controllers;

import mobin.project.fleetapp.models.Country;
import mobin.project.fleetapp.services.CountryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

@Controller
public class CountryController {

    @Autowired
    CountryService countryService;

    @GetMapping("/countries")
    public String index(Model model){
        List<Country> countryList = countryService.getCountries();
        model.addAttribute("countries",countryList);
        return "country";
    }

    @PostMapping("/countries")
    public String store(Country country) {
        countryService.store(country);
        return "redirect:/countries";
    }
}
