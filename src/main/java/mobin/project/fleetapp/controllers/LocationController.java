package mobin.project.fleetapp.controllers;

import mobin.project.fleetapp.models.Country;
import mobin.project.fleetapp.models.Location;
import mobin.project.fleetapp.models.State;
import mobin.project.fleetapp.services.CountryService;
import mobin.project.fleetapp.services.LocationService;
import mobin.project.fleetapp.services.StateService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

@Controller
public class LocationController {

    @Autowired LocationService locationService;
    @Autowired CountryService countryService;
    @Autowired StateService stateService;

    @GetMapping("/locations")
    public String getCountries(Model model){
        model.addAttribute("page","locations");
        List<Location> locationList = locationService.locationList();
        List<Country> countryList = countryService.getCountries();
        List<State> stateList = stateService.getStates();
        model.addAttribute("locations",locationList);
        model.addAttribute("countries",countryList);
        model.addAttribute("states",stateList);
        return "locations";
    }

    @PostMapping("/locations")
    public String storeLocation(Location location){
        locationService.storeOrUpdateLocation(location);
        return "redirect:/locations";
    }
}
