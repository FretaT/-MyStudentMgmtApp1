package cs.miu.mystudentmgmtapp1.service.Impl;

import cs.miu.mystudentmgmtapp1.model.Student;
import cs.miu.mystudentmgmtapp1.repository.StudentRepository;
import cs.miu.mystudentmgmtapp1.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StudentServiceImpl implements StudentService {
    @Autowired
    private StudentRepository studentRepository;

    @Override
    public Student addStudent(Student student) {
       var newStudent = studentRepository.save(student);
       return newStudent;
    }
}
