package cs.miu.mystudentmgmtapp1.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.engine.internal.Cascade;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Data
@NoArgsConstructor
@Entity
@Table(name="Student")
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long  studentId;

    @Column (name="studentNumber ", unique=true, nullable=false)
    private String studentNumber;

    @Column(name="firstName", unique=true, nullable=false)
    private String firstName;

    @Column(name="middleName", unique=true, nullable=false)
    private String middleName;

    @Column(name="lastName", unique = true, nullable = false)
    private String lastName;

    @Column(name="cgpa", unique=true, nullable= false)
     private Double cgpa;

    @DateTimeFormat(pattern ="YYYY-MM-dd")
    private LocalDate dateOfEnrollment;

@OneToOne(cascade =CascadeType.ALL)
@JoinColumn(name = "transcriptId",
    nullable = false)
private Transcript transcript;

@ManyToOne
@JoinColumn(name="classroom")
private Classroom classroom;

@ManyToMany
@JoinTable(name = "Student_Courses",
        joinColumns = {@JoinColumn(name="student_Id", referencedColumnName = "studentId")},
        inverseJoinColumns = {@JoinColumn(name = "course_id", referencedColumnName = "courseId")}
)
private List<Course> course;

    public Student(Long studentId, String studentNumber, String firstName, String middleName, String lastName, Double cgpa, LocalDate dateOfEnrollment, Transcript transcript, Classroom classroom, List<Course> course) {
        studentId = studentId;
        this.studentNumber = studentNumber;
        this.firstName = firstName;
        this.middleName = middleName;
        this.lastName = lastName;
        this.cgpa = cgpa;
        this.dateOfEnrollment = dateOfEnrollment;
        this.transcript = transcript;
        this.classroom = classroom;
        this.course=course;
    }
    public Student(Long studentId, String studentNumber, String firstName, String middleName, String lastName, Double cgpa, LocalDate dateOfEnrollment) {
        this.studentId = studentId;
        this.studentNumber = studentNumber;
        this.firstName = firstName;
        this.middleName = middleName;
        this.lastName = lastName;
        this.cgpa = cgpa;
        this.dateOfEnrollment = dateOfEnrollment;
    }


    @Override
    public String toString() {
        return "Student{" +
                "StudentId=" + studentId +
                ", studentNumber='" + studentNumber + '\'' +
                ", firstName='" + firstName + '\'' +
                ", middleName='" + middleName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", cgpa=" + cgpa +
                ", dateOfEnrollment=" + dateOfEnrollment +
                ", transcript=" + transcript +
                ", Classroom=" + classroom+
                ", Course=" + course +
                '}';
    }







}
