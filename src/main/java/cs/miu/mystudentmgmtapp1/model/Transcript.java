package cs.miu.mystudentmgmtapp1.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name="Transcript")
public class Transcript {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long transcriptId;

    @Column(name="degreeTitle", unique = true, nullable = false)
    private String degreeTitle;

    @OneToOne(mappedBy = "transcript" ,
            cascade = CascadeType.ALL)
    private Student student;

@Override
public String toString(){
    return "Transcript{" +
            "transcriptId=" + transcriptId +
            ", degreeTitle='" + degreeTitle +
            '}';

}
}