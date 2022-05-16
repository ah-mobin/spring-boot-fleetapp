package mobin.project.fleetapp.services;

import mobin.project.fleetapp.models.State;
import mobin.project.fleetapp.repositories.StateRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class StateService {
    @Autowired
    StateRepository stateRepository;

    public List<State> getStates(){
        return stateRepository.findAll();
    }

    public void storeOrUpdate(State state){
        stateRepository.save(state);
    }

    public Optional<State> findById(int id){
        return stateRepository.findById(id);
    }
}
