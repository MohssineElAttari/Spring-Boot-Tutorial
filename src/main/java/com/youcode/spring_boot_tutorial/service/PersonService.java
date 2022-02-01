package com.youcode.spring_boot_tutorial.service;

import com.youcode.spring_boot_tutorial.dao.PersonDao;
import com.youcode.spring_boot_tutorial.model.Person;

public class PersonService {
    private final PersonDao personDao;

    public PersonService(PersonDao personDao) {
        this.personDao = personDao;
    }

    public int addPerson(Person person){
    return personDao.inserPerson(person);
    }
}
