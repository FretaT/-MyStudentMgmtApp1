package cs.miu.mystudentmgmtapp1.repository;

import cs.miu.mystudentmgmtapp1.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<Student, Long> {
}
