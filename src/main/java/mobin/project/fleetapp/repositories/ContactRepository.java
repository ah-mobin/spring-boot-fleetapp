package mobin.project.fleetapp.repositories;

import mobin.project.fleetapp.models.Contact;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ContactRepository extends JpaRepository<Contact, Integer> {

}
