package ma.emsi.stud_app5.repository;

import ma.emsi.stud_app5.entities.Role;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface RoleRepository extends JpaRepository<Role,Long> {
    @Query("SELECT r FROM Role r WHERE r.roleName = :roleName")
    Role FindByRoleName(String roleName);
}
