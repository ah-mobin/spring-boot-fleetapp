package mobin.project.fleetapp.controllers;

import mobin.project.fleetapp.models.Country;
import mobin.project.fleetapp.services.CountryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@Controller
public class CountryController {

    @Autowired
    CountryService countryService;

    @GetMapping("/countries")
    public String index(Model model){
        model.addAttribute("page","country");

        List<Country> countryList = countryService.getCountries();
        model.addAttribute("countries",countryList);
        return "country";
    }

    @PostMapping("/countries")
    public String store(Country country) {
        countryService.storeOrUpdate(country);
        return "redirect:/countries";
    }

    @RequestMapping("/countries/show")
    @ResponseBody
    public Optional<Country> show(int id){
        return countryService.findById(id);
    }

    @RequestMapping(value = "/countries/update", method = {RequestMethod.PUT, RequestMethod.GET})
    public String update(Country country){
        countryService.storeOrUpdate(country);
        return "redirect:/countries";
    }

    @RequestMapping(value = "/countries/delete", method = {RequestMethod.DELETE, RequestMethod.GET})
    public String destroy(int id){
        countryService.destroy(id);
        return "redirect:/countries";
    }
}
