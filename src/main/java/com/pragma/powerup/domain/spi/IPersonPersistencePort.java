package com.pragma.powerup.domain.spi;

import com.pragma.powerup.domain.model.Person;

import java.util.List;

public interface IPersonPersistencePort {

    void savePerson(Person person);

    List<Person> getAllPersons();

    Person getPerson(String personDocument);

    void updatePerson(Person person);

    void deletePerson(String personDocument);

}
