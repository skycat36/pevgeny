package test.java.ru.job4j.Tracker;

import main.java.ru.job4j.Tracker.Item;
import main.java.ru.job4j.Tracker.Tracker;
import org.testng.Assert;
import org.testng.annotations.Test;

public class UpdateTest {
    @Test
    public void WhenUpdateElemThenTrue(){
        Item itemOne = new Item("First","Two",1,null);
        Item itemTwo = new Item("Everybody","Three",3,null);
        itemTwo.setId(itemOne.getId());
        Tracker tracker = new Tracker();
        tracker.add(itemOne);
        tracker.update(itemTwo);
        boolean result = false;

        Item[] temp = tracker.getAll();
        for (int i = 0; i < temp.length; i++){
            if (temp[i].equals(itemTwo)){
                result = true;
            }
        }
        boolean expected = true;
        Assert.assertEquals(result, expected);
    }

}
