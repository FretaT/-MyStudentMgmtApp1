package cs.miu.mystudentmgmtapp1.repository;

import cs.miu.mystudentmgmtapp1.model.Transcript;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TranscriptRepository extends JpaRepository<Transcript,Long> {

}
