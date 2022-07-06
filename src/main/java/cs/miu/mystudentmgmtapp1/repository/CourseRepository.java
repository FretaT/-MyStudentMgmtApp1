package cs.miu.mystudentmgmtapp1.repository;
import cs.miu.mystudentmgmtapp1.model.Course;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CourseRepository extends JpaRepository <Course,Long> {
}
