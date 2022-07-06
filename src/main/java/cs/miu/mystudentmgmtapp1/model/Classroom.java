package cs.miu.mystudentmgmtapp1.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Classroom {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long classroomId;

    @Column(name="buildingName ", unique=true, nullable=false)
    private String buildingName;

    @Column(name="roomNumber ", unique=true, nullable=false)
    private Integer roomNumber;

    @OneToMany(mappedBy = "classroom" )
    private List<Student> student= new ArrayList<>();
}
