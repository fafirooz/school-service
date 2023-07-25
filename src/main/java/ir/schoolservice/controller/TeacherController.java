package ir.schoolservice.controller;

import ir.schoolservice.model.Teacher;
import ir.schoolservice.service.TeacherService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController

public class TeacherController {
    @Autowired
    private TeacherService teacherService;

    @GetMapping("/teacher") //////// comment!!!
    public List<Teacher> read() {
        return teacherService.read();
    }

    @PostMapping("/teacher")
    public Teacher save(@RequestBody @Valid Teacher teacher) { // DTO (data transaction Object)
        teacher.getTeacherDarsSet().stream().forEach(teacherDars -> teacherDars.setTeacher(teacher));
        return teacherService.save(teacher);
    }

}
