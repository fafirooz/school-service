package ir.schoolservice.service;

import ir.schoolservice.model.Dars;
import ir.schoolservice.model.Teacher;
import ir.schoolservice.repository.TeacherRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class TeacherServiceImpl implements TeacherService{

    @Autowired
    private TeacherRepository teacherRepository;
    @Override
    public List<Teacher> read() {
        Iterable<Teacher> teacherIterable= teacherRepository.findAll();
        List<Teacher> teachersList= new ArrayList<>();
        for (Teacher teacher: teacherIterable) {
            teachersList.add(teacher);
        }


        return teachersList;
    }

    @Override
    public Teacher save(Teacher teacher) {
        return teacherRepository.save(teacher);
    }
}
