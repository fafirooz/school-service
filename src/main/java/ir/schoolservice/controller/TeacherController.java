package ir.schoolservice.controller;

import ir.schoolservice.model.Teacher;
import ir.schoolservice.service.TeacherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController

public class TeacherController {
    @Autowired
    private TeacherService teacherService;

    @GetMapping("/teacher")
    public List<Teacher> read() {
        return teacherService.read();
    }

}
