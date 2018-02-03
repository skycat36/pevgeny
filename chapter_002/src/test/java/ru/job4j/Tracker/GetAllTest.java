package test.java.ru.job4j.Tracker;

import main.java.ru.job4j.Tracker.Item;
import main.java.ru.job4j.Tracker.Tracker;
import org.testng.Assert;
import org.testng.annotations.Test;

public class GetAllTest {
    @Test
    public void WhenAllElemThenThreeElem(){
        Item itemOne = new Item("First","One",1,null);
        Item itemTwo = new Item("Second","Two",2,null);
        Item itemThree = new Item("Therd","Three",3,null);
        Tracker tracker = new Tracker();
        tracker.add(itemOne);
        tracker.add(itemTwo);
        tracker.add(itemThree);
        int CountElem = 3;
        Item[] allElem = tracker.getAll();
        boolean result = false;

        if (allElem.length == CountElem){
            result = true;
        }

        boolean expected = true;
        Assert.assertEquals(result, expected);
    }
}
