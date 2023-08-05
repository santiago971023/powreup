package com.pragma.powerup.domain.api;

import com.pragma.powerup.domain.model.Person;

import java.util.List;

public interface IPersonServicePort {

    void savePerson(Person person);

    List<Person> getAllPersons();

    Person getPerson(String personDocument);

    void updatePerson(Person person);

    void deletePerson(String personDocument);

}
