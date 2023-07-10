package ir.schoolservice.controller;

import ir.schoolservice.model.Dars;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DarsController {

    @GetMapping("/fariba")
    public Dars homePage() {
        return new Dars(1, "ali");
    }

    @PostMapping("/fariba")
    public String newpost() {
        return "post request";
    }


}
