package mobin.project.fleetapp.services;

import mobin.project.fleetapp.models.Location;
import mobin.project.fleetapp.repositories.LocationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class LocationService {
    @Autowired
    LocationRepository locationRepository;

    public List<Location> locationList(){
        return locationRepository.findAll();
    }


    public Optional<Location> getLocationById(int id){
        return locationRepository.findById(id);
    }

    public Location getLocation(int id){
        return locationRepository.findById(id).get();
    }

    public void storeOrUpdateLocation(Location location){
        locationRepository.save(location);
    }

    public void destroyLocationById(int id){
        locationRepository.deleteById(id);
    }
}
