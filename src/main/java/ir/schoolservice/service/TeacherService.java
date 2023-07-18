package ir.schoolservice.service;

import ir.schoolservice.model.Teacher;

import java.util.List;

public interface TeacherService{
    public List<Teacher> read();

    public Teacher save(Teacher teacher);
}
