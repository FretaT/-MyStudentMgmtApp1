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
@Table(name="Course")
public class Course {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long courseId;
    @Column(name="courseName",unique = true, nullable = false)
    private String courseName;

    @ManyToMany
    private List<Student> student= new ArrayList<>();


}
