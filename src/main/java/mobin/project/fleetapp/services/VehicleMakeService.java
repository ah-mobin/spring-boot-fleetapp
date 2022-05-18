package mobin.project.fleetapp.services;

import mobin.project.fleetapp.models.VehicleMake;
import mobin.project.fleetapp.repositories.VehicleMakeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class VehicleMakeService {
    @Autowired
    VehicleMakeRepository vehicleMakeRepository;

    public List<VehicleMake> vehicleMakes(){
        return vehicleMakeRepository.findAll();
    }

    public void storeOrUpdateVehicleMakes(VehicleMake vehicleMake){
        vehicleMakeRepository.save(vehicleMake);
    }

    public Optional<VehicleMake> showVehicleMakeById(int id){
        return vehicleMakeRepository.findById(id);
    }

    public void deleteVehicleMakeItem(int id){
        vehicleMakeRepository.deleteById(id);
    }
}
