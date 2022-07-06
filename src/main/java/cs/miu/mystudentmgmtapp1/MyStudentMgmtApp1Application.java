package cs.miu.mystudentmgmtapp1;

import cs.miu.mystudentmgmtapp1.model.Classroom;
import cs.miu.mystudentmgmtapp1.model.Course;
import cs.miu.mystudentmgmtapp1.model.Student;
import cs.miu.mystudentmgmtapp1.model.Transcript;
import cs.miu.mystudentmgmtapp1.service.ClassroomService;
import cs.miu.mystudentmgmtapp1.service.CourseService;
import cs.miu.mystudentmgmtapp1.service.StudentService;
import cs.miu.mystudentmgmtapp1.service.TranscriptService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@SpringBootApplication
public class MyStudentMgmtApp1Application implements CommandLineRunner {
    @Autowired
    private ClassroomService classroomService;
    @Autowired
    private CourseService courseService;
    @Autowired
    private StudentService studentService;
    @Autowired
    private TranscriptService transcriptService;

    private MyStudentMgmtApp1Application (ClassroomService classroomService,CourseService courseService,
                                          StudentService studentService,TranscriptService transcriptService){
         this.classroomService = classroomService;
         this.courseService =courseService;
         this.studentService = studentService;
         this.transcriptService = transcriptService;

    }

    @Override
    public void run(String... args) throws Exception {

        // Transcript
        Transcript transcript = new Transcript(1L, "BS Computer Science");

        //Classroom
        Classroom  c1= new Classroom(1L, "McLaughlin building", "M105");
     	Classroom  c2= new Classroom(2L, "Drier building", "C30");

        //Student
        Student s1 = new Student(1L, "000-61-0001", "Anna", "Lynn", "Smith", 3.45, LocalDate.of(2019, 5, 24), transcript);
        Student s2 = new Student(1L,"000-61-0001","Frehiwet","Kiros","Tsegay",3.81,LocalDate.of(2022,06,23),transcript);
                List<Student> students = new ArrayList<>();

        //Course
        Course Co1 =new Course(1L,"SWE");
        Course Co2 =new Course(2L,"EA");
        List<Course> course = new ArrayList<>();
    }
    public static void main(String[] args) {
        SpringApplication.run(MyStudentMgmtApp1Application.class, args);
        private List<Student> saveStudent(List<Student> Student) {
            return (List<Student>) StudentRepository.saveAll(Student);
        }

        private Course saveCourse(Course course){
            return Course CourseRepository.save(course)
        }

        private Classroom saveClassroom(Classroom classroom) {
            return (Classroom) ClassroomRepository.saveAll(classroom);
        }

        private Transcript saveTranscript(Transcript transcript) {
            return TranscriptRepository.save(transcript);
        }

    }


}
