package ma.emsi.stud_app5.repository;

import ma.emsi.stud_app5.entities.Consultation;
import ma.emsi.stud_app5.entities.Patient;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ConsultationRepository extends JpaRepository<Consultation,Long> {
}
