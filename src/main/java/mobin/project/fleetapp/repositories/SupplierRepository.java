package mobin.project.fleetapp.repositories;

import mobin.project.fleetapp.models.Client;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SupplierRepository extends JpaRepository<Client, Integer> {

}
