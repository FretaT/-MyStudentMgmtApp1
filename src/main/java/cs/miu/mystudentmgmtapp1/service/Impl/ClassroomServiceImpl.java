package cs.miu.mystudentmgmtapp1.service.Impl;

import cs.miu.mystudentmgmtapp1.model.Classroom;
import cs.miu.mystudentmgmtapp1.repository.ClassroomRepository;
import cs.miu.mystudentmgmtapp1.service.ClassroomService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.processing.SupportedOptions;

@Service
public class ClassroomServiceImpl implements ClassroomService {
    @Autowired
    private ClassroomRepository classroomRepository;
    @Override
    public Classroom addClassroom(Classroom classroom) {
        var newClassroom = classroomRepository.save(classroom);
        return newClassroom;
    }
}

