package mobin.project.fleetapp.services;

import mobin.project.fleetapp.models.VehicleStatus;
import mobin.project.fleetapp.repositories.VehicleStatusRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class VehicleStatusService {
    @Autowired
    VehicleStatusRepository vehicleStatusRepository;

    public List<VehicleStatus> vehicleStatusValues(){
        return vehicleStatusRepository.findAll();
    }

    public void storeOrUpdateVehicleStatus(VehicleStatus vehicleStatus){
        vehicleStatusRepository.save(vehicleStatus);
    }

    public Optional<VehicleStatus> showValueById(int id){
        return vehicleStatusRepository.findById(id);
    }

    public void deleteStatusValueItem(int id){
        vehicleStatusRepository.deleteById(id);
    }
}
