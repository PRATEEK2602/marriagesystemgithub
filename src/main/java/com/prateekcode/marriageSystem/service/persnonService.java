package com.prateekcode.marriageSystem.service;

import com.prateekcode.marriageSystem.model.Person;

import java.util.List;

public interface persnonService {
    public Person savePerson(Person person);
    public List<Person> getAllPerson();

}
