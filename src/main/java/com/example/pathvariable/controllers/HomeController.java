package com.example.pathvariable.controllers;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {
    @RequestMapping("/travel/{city}")
    public String travel(@PathVariable("city") String city){
        return String.format("Congratulations! You will soon travel to %s",city);
    }

    @RequestMapping("/lotto/{id}")
    public String test(@PathVariable("id") String id){
        if(Integer.parseInt(id) % 2 == 0){
            return("You will take a grand journey in the near future, but be weary of tempting offers!");
        } else {
            return("You have enjoyed the fruits of your labor but now is a great time to spend time with family and friends.");
        }
    }

}
