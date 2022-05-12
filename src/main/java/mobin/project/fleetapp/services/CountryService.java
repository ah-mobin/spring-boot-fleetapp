package mobin.project.fleetapp.services;

import mobin.project.fleetapp.models.Country;
import mobin.project.fleetapp.repositories.CountryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CountryService {

    @Autowired
    CountryRepository countryRepository;

    //list of countries
    public List<Country> getCountries(){
        return countryRepository.findAll();
    }

    //store new country
    public void storeOrUpdate(Country country){
        countryRepository.save(country);
    }

    //get country by id
    public Optional<Country> findById(int id){
        return countryRepository.findById(id);
    }

    //delete country by id
    public void destroy(int id){
        countryRepository.deleteById(id);
    }
}
