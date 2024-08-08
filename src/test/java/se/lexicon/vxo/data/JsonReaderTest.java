package se.lexicon.vxo.data;

import org.junit.jupiter.api.Test;
import se.lexicon.vxo.model.Person;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class JsonReaderTest {

    @Test
    public void given_nothing_read_successfully_return_list_of_size_10000(){
        int expectedSize = 10000;
        List<Person> result = JsonReader.getInstance().read();
        assertEquals(expectedSize, result.size());
    }

}
