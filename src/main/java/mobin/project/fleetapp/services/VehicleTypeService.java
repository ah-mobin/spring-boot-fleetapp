package mobin.project.fleetapp.services;

import mobin.project.fleetapp.models.VehicleType;
import mobin.project.fleetapp.repositories.VehicleTypeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class VehicleTypeService {
    @Autowired
    VehicleTypeRepository vehicleTypeRepository;

    public List<VehicleType> vehicleTypes(){
        return vehicleTypeRepository.findAll();
    }

    public void storeOrUpdateVehicleType(VehicleType vehicleType){
        vehicleTypeRepository.save(vehicleType);
    }

    public Optional<VehicleType> showVehicleTypeById(int id){
        return vehicleTypeRepository.findById(id);
    }

    public void deleteVehicleTypeItem(int id){
        vehicleTypeRepository.deleteById(id);
    }
}
