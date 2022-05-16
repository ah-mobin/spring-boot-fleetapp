package mobin.project.fleetapp.controllers;

import mobin.project.fleetapp.models.Country;
import mobin.project.fleetapp.models.State;
import mobin.project.fleetapp.services.CountryService;
import mobin.project.fleetapp.services.StateService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;
import java.util.Optional;

@Controller
public class StateController {

    @Autowired
    StateService stateService;
    @Autowired
    CountryService countryService;

    @GetMapping("/states")
    public String getStates(Model model){
        model.addAttribute("page","states");
        List<State> states = stateService.getStates();
        List<Country> countries = countryService.getCountries();
        model.addAttribute("stateList",states);
        model.addAttribute("countries",countries);
        return "states";
    }

    @PostMapping( "states")
    public String storeState(State state){
        stateService.storeOrUpdate(state);
        return "redirect:/states";
    }


    @RequestMapping("states/show")
    @ResponseBody
    public Optional<State> getSingleState(int id){
        return stateService.findById(id);
    }
}