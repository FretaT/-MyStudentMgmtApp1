package cs.miu.mystudentmgmtapp1.repository;

import cs.miu.mystudentmgmtapp1.model.Classroom;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ClassroomRepository extends JpaRepository <Classroom,Long>{
}
