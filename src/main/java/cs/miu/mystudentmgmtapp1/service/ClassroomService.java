package cs.miu.mystudentmgmtapp1.service;

import cs.miu.mystudentmgmtapp1.model.Classroom;
import org.springframework.stereotype.Service;

import javax.persistence.Entity;


public interface ClassroomService {
    public abstract Classroom addClassroom(Classroom classroom);
}
