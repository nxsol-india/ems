package net.nxsol.ems.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import net.nxsol.ems.entity.Student;

@Repository
public interface StudentRepository extends JpaRepository<Student, Long> {
}
