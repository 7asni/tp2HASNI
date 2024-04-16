package ma.emsi.stud_app5.repository;

import ma.emsi.stud_app5.entities.Patient;
import ma.emsi.stud_app5.entities.RendezVous;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RendezVousRepository extends JpaRepository<RendezVous,String> {
}
