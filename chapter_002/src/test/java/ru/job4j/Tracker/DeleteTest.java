package test.java.ru.job4j.Tracker;

import main.java.ru.job4j.Tracker.Item;
import main.java.ru.job4j.Tracker.Tracker;
import org.testng.Assert;
import org.testng.annotations.Test;

public class DeleteTest {
    @Test
    public void WhenDeleteElemThenTrue(){
        Item item = new Item("First","Two",1,null);
        Tracker tracker = new Tracker();
        tracker.add(item);
        String id = item.getId();
        tracker.delete(id);
        boolean result = true;

        Item[] temp = tracker.getAll();
            for (int i = 0; i < temp.length; i++) {
                if (temp[i].equals(item)) {
                    result = false;
                }
            }

        boolean expected = true;
        Assert.assertEquals(result, expected);
    }
}
