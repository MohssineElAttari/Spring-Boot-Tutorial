package com.youcode.spring_boot_tutorial.dao;

import com.youcode.spring_boot_tutorial.model.Person;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class FakePersonDataAccesseService implements  PersonDao{
    private static List<Person> DB = new ArrayList<>();
    @Override
    public int inserPerson(UUID id, Person person) {
        DB.add(new Person(id, person.getName()));
        return 1;
    }
}
