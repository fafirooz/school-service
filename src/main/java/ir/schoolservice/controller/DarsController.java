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

    @GetMapping("/dars")
    public List<Dars> read() {
        return darsService.read();
    }



}
