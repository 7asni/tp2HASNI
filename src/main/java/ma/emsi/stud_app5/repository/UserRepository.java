package ma.emsi.stud_app5.repository;

import ma.emsi.stud_app5.entities.Patient;
import ma.emsi.stud_app5.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User,String> {
    User findByUserName(String userName);
}
