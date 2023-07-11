package ir.schoolservice.controller;

import ir.schoolservice.model.Dars;
import ir.schoolservice.service.DarsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class DarsController {

    @Autowired
    private DarsService darsService; // it has =  DarsServiceImpl
    @GetMapping("/fariba")
    public Dars homePage() {
        return new Dars(1, "ali");
    }

    @PostMapping("/fariba")
    public String newpost() {
        return "post request";
    }

    @GetMapping("/dars")
    public List<Dars> read() {
        return darsService.read();
    }



}
