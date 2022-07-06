package cs.miu.mystudentmgmtapp1.service.Impl;

import cs.miu.mystudentmgmtapp1.model.Course;
import cs.miu.mystudentmgmtapp1.repository.CourseRepository;
import cs.miu.mystudentmgmtapp1.service.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CourseServiceImpl implements CourseService {
    @Autowired
    private CourseRepository courseRepository;
    @Override
    public Course addCourse(Course course) {
        var newCourse = courseRepository.save(course);
        return newCourse;
    }
}
