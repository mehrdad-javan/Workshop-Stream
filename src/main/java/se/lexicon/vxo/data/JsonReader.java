package se.lexicon.vxo.data;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.datatype.jsr310.JavaTimeModule;
import se.lexicon.vxo.model.Person;

import java.io.File;
import java.io.IOException;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

public class JsonReader {
    private static final JsonReader INSTANCE;

    static {
        INSTANCE = new JsonReader();
    }

    public static JsonReader getInstance() {
        return INSTANCE;
    }

    private JsonReader(){}

    public List<Person> read(){
        List<Person> people = new ArrayList<>();
        ObjectMapper objectMapper = new ObjectMapper();
        objectMapper.registerModule(new JavaTimeModule());
        File file = new File("resources/people.json");
        try{
            people = objectMapper.readValue(file, new TypeReference<List<Person>>() {});
        }catch (IOException ex){
            System.out.println(ex + " " + ex.getMessage());
        }
        return people;
    }
}
