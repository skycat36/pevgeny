package test.java.ru.job4j.Tracker;

import main.java.ru.job4j.Tracker.Item;
import main.java.ru.job4j.Tracker.Tracker;
import org.testng.Assert;
import org.testng.annotations.Test;

public class findByIdTest {
    @Test
    public void whenAddElemThenTrue(){
        Item itemOne = new Item("First","One",1,null);
        Item itemTwo = new Item("Second","Two",2,null);
        Item itemThree = new Item("Therd","Three",3,null);
        Tracker tracker = new Tracker();
        tracker.add(itemOne);
        tracker.add(itemTwo);
        tracker.add(itemThree);

        Item findItem = tracker.findByid(itemTwo.getId());

        boolean result = false;

        Item[] temp = tracker.getAll();
        for (int i = 0; i < temp.length; i++){
            if (temp[i].equals(findItem)){
                result = true;
            }
        }
        boolean expected = true;
        Assert.assertEquals(result, expected);
    }
}
