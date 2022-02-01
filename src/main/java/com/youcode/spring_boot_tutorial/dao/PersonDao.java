package com.youcode.spring_boot_tutorial.dao;

import com.youcode.spring_boot_tutorial.model.Person;

import java.util.UUID;

public interface PersonDao {
    int inserPerson(UUID id , Person person);
    default int inserPerson(Person person){
        UUID id =UUID.randomUUID();
        return  inserPerson(id,person);
    }
}
