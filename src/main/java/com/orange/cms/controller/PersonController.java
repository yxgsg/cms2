package com.orange.cms.controller;

import com.orange.cms.domain.Person;
import com.orange.cms.repository.PersonRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

/**
 * Created on 1/9/21.
 *
 * @author Xiaogang Yu
 */
@RestController
@RequestMapping("/orangeCms")
@Slf4j
public class PersonController
{
    private final PersonRepository personRepository;

    public PersonController(PersonRepository personRepository){
        this.personRepository = personRepository;
    }

    @PostMapping("/add")
    @ResponseBody
    public String addNewPerson(@RequestBody Person person){
        log.info(person.toString());
        personRepository.save(person);
        return "Success Saved!";
    }

    @GetMapping("/getPerson")
    @ResponseBody
    public Iterable<Person> getPerson(){
        return personRepository.findAll();
    }

    @PostMapping("/findByName")
    @ResponseBody
    public Person getPersonByName(@RequestBody Person person){
        log.info(person.toString());
        return personRepository.findPersonByName(person.getName());
    }
}
