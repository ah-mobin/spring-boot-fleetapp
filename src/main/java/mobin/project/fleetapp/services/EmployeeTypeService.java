package mobin.project.fleetapp.services;

import mobin.project.fleetapp.models.EmployeeType;
import mobin.project.fleetapp.repositories.EmployeeTypeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EmployeeTypeService {
    @Autowired
    EmployeeTypeRepository employeeTypeRepository;

    public List<EmployeeType> employeeTypes(){
        return employeeTypeRepository.findAll();
    }

    public void storeOrUpdateEmployeeTypes(EmployeeType employeeType){
        employeeTypeRepository.save(employeeType);
    }

    public Optional<EmployeeType> showEmployeeTypeById(int id){
        return employeeTypeRepository.findById(id);
    }

    public void deleteEmployeeTypeItem(int id){
        employeeTypeRepository.deleteById(id);
    }
}
