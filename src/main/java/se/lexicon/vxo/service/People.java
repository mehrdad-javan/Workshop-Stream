package se.lexicon.vxo.service;

import se.lexicon.vxo.model.Person;

import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Stream;

public interface People {

    People INSTANCE = PeopleImpl.getInstance();

    List<Person> getPeople();
}
