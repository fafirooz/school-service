package ir.schoolservice.controller;

import ir.schoolservice.model.Teacher;
import ir.schoolservice.service.TeacherService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.function.EntityResponse;

import java.util.List;

@RestController

public class TeacherController {
    @Autowired
    private TeacherService teacherService;

    @GetMapping("/teacher")
    public List<Teacher> read() {
        return teacherService.read();
    }

    @PostMapping("/teacher")
    public ResponseEntity<Teacher> save(@RequestBody @Valid Teacher teacher) { // DTO (data transaction Object)
        teacher.getTeacherDarsSet().stream().forEach(teacherDars -> teacherDars.setTeacher(teacher));
        return new ResponseEntity(teacherService.save(teacher), HttpStatus.CREATED);
    }

}
