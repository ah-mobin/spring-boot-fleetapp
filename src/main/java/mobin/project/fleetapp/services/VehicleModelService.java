package mobin.project.fleetapp.services;

import mobin.project.fleetapp.models.VehicleModel;
import mobin.project.fleetapp.repositories.VehicleModelRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class VehicleModelService {
    @Autowired
    VehicleModelRepository vehicleModelRepository;

    public List<VehicleModel> vehicleModels(){
        return vehicleModelRepository.findAll();
    }

    public void storeOrUpdateVehicleModels(VehicleModel vehicleModel){
        vehicleModelRepository.save(vehicleModel);
    }

    public Optional<VehicleModel> showValueById(int id){
        return vehicleModelRepository.findById(id);
    }

    public void deleteStatusValueItem(int id){
        vehicleModelRepository.deleteById(id);
    }
}
