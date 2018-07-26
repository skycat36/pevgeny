package search;

import org.testng.annotations.Test;
import java.util.List;

import static org.testng.Assert.assertEquals;

public class PhoneDictionaryTest {
    @Test
    public void whenFindByName() {
        PhoneDictionary phones = new PhoneDictionary();
        phones.add(
                new Person("Petr", "Arsentev", "534872", "Bryansk")
        );
        List<Person> persons = phones.find("Petr");
        assertEquals(persons.iterator().next().getSurname(), "Arsentev");
    }
}
