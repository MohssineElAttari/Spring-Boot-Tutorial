package com.youcode.spring_boot_tutorial.api;

import com.youcode.spring_boot_tutorial.model.Person;
import com.youcode.spring_boot_tutorial.service.PersonService;

public class PersonController {

    private final PersonService personService;

    public PersonController(PersonService personService) {
        this.personService = personService;
    }
    public void addPerson(Person person){
        personService.addPerson(person);
    }
}
