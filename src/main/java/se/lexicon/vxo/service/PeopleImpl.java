package se.lexicon.vxo.service;

import se.lexicon.vxo.data.JsonReader;
import se.lexicon.vxo.model.Person;

import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class PeopleImpl implements People {

    private static final PeopleImpl INSTANCE;

    static {
        INSTANCE = new PeopleImpl();
    }

    static PeopleImpl getInstance(){
        return INSTANCE;
    }

    private List<Person> people;

    private PeopleImpl(){
        people = JsonReader.getInstance().read();
    }

    @Override
    public List<Person> getPeople(){
        return people;
    }
}
