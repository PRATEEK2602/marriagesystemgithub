package com.prateekcode.marriageSystem.service;

import com.prateekcode.marriageSystem.model.Person;
import com.prateekcode.marriageSystem.repository.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class personServiceImpl implements persnonService {

    @Autowired
    public PersonRepository personRepository;
    @Override
    public Person savePerson(Person person) {
        return personRepository.save(person);
    }

    @Override
    public List<Person> getAllPerson() {
        return personRepository.findAll();
    }
}
