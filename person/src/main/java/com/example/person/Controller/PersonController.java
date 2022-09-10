package com.example.person.Controller;

import com.example.person.Entity.Person;
import com.example.person.Service.PersonService;
import com.example.person.VO.RestTemplateVO;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/person")
@Slf4j
public class PersonController {

    @Autowired
    PersonService personService;

    @PostMapping("/")
    public void savePerson(Person person){
        log.info("inside savePerson() method of PersonController");
        personService.savePerson(person);
    }

    @GetMapping("/{id}")
    public RestTemplateVO findUserWithDepartment(@PathVariable("id") Long personId){
        log.info("inside findUserWithDepartment() method of PersonController");
        return personService.findUserWithDepartment(personId);
    }
}
