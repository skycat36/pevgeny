package test.ru.job4j.tracker;

import ru.job4j.tracker.Item;
import ru.job4j.tracker.Tracker;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TrackerTest {
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

    @Test
    public void whenFindElemThenTrue(){
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

    @Test
    public void WhenAllElemThenThreeElem(){
        Item itemOne = new Item("First","One",1,null);
        Item itemTwo = new Item("Second","Two",2,null);
        Item itemThree = new Item("Therd","Three",3,null);
        Tracker tracker = new Tracker();
        tracker.add(itemOne);
        tracker.add(itemTwo);
        tracker.add(itemThree);
        Item[] allElem = tracker.getAll();
        boolean result;

            result = itemOne.equals(allElem[0]) && itemTwo.equals(allElem[1]) &&
                    itemThree.equals(allElem[2]);     //Если количество и сами элементы совпадают

        boolean expected = true;
        Assert.assertEquals(result, expected);
    }

}
