package com.pragma.powerup.domain.usecase;

import com.pragma.powerup.domain.api.IPersonServicePort;
import com.pragma.powerup.domain.model.Person;
import com.pragma.powerup.domain.spi.IPersonPersistencePort;

import java.util.List;

public class PersonUseCase implements IPersonServicePort {

    private final IPersonPersistencePort personPersistencePort;

    public PersonUseCase(IPersonPersistencePort personPersistencePort) {
        this.personPersistencePort = personPersistencePort;
    }

    @Override
    public void savePerson(Person person) {
        personPersistencePort.savePerson(person);
    }

    @Override
    public List<Person> getAllPersons() {
        return personPersistencePort.getAllPersons();
    }

    @Override
    public Person getPerson(String personDocument) {
        return personPersistencePort.getPerson(personDocument);
    }

    @Override
    public void updatePerson(Person person) {
        personPersistencePort.updatePerson(person);
    }

    @Override
    public void deletePerson(String personDocument) {
        personPersistencePort.deletePerson(personDocument);
    }
}
