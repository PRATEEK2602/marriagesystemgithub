package com.prateekcode.marriageSystem.controller;

import com.prateekcode.marriageSystem.model.Person;
import com.prateekcode.marriageSystem.service.personServiceImpl;
import com.prateekcode.marriageSystem.service.persnonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/person")
public class PersonController {
    @Autowired
    public persnonService personService;

    @PostMapping("/add")
    public String add(@RequestBody Person person){
        personService.savePerson(person);
        return "New person arrived on platform";
    }

    @GetMapping("/getAll")
    public List<Person> getAll(){
        return personService.getAllPerson();
    }
}
