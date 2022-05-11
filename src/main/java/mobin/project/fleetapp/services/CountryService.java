package mobin.project.fleetapp.services;

import mobin.project.fleetapp.models.Country;
import mobin.project.fleetapp.repositories.CountryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CountryService {

    @Autowired
    CountryRepository countryRepository;

    //list of countries
    public List<Country> getCountries(){
        return countryRepository.findAll();
    }

    //store new country
    public void store(Country country){
        countryRepository.save(country);
    }
}
