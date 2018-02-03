package test.java.ru.job4j.Tracker;

import main.java.ru.job4j.Tracker.Item;
import main.java.ru.job4j.Tracker.Tracker;
import org.testng.Assert;
import org.testng.annotations.Test;

public class AddTest {
    @Test
    public void whenAddElemThenTrue(){
        Item item = new Item("First","Two",1,null);
        Tracker tracker = new Tracker();
        tracker.add(item);
        boolean result = false;

        Item[] temp = tracker.getAll();
        for (int i = 0; i < temp.length; i++){
            if (temp[i].equals(item)){
                result = true;
            }
        }
        boolean expected = true;
        Assert.assertEquals(result, expected);
    }
}
