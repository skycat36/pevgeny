package test.ru.job4j.tracker;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import ru.job4j.tracker.*;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class StartUITest {
    // поле содержит дефолтный вывод в консоль.
    private final PrintStream stdout = System.out;
    // буфер для результата.
    private final ByteArrayOutputStream out = new ByteArrayOutputStream();

    @BeforeMethod
    public void loadOutput() {
        //System.out.println("execute before method");
        System.setOut(new PrintStream(this.out));
    }

    @AfterMethod
    public void backOutput() {
        System.setOut(this.stdout);
        //System.out.println("execute after method");
    }

    @Test
    public void whenUserAddItemThenTrackerHasNewItemWithSameName() {
        this.out.reset();
        Tracker tracker = new Tracker();     // создаём Tracker
        Input input = new StubInput(new String[]{"0", "test name", "desc", "y"});   //создаём StubInput с последовательностью действий
        new StartUI(input, tracker).init();     //   создаём StartUI и вызываем метод init()
        Assert.assertEquals(tracker.getAll()[0].getName(), "test name"); // проверяем, что нулевой элемент массива в трекере содержит имя, введённое при эмуляции.
        this.out.reset();
    }

    @Test
    public void whenUpdateThenTrackerHasUpdatedValue() {
        this.out.reset();
        // создаём Tracker
        Tracker tracker = new Tracker();
        //Напрямую добавляем заявку
        Item item = tracker.add(new Item());
        //создаём StubInput с последовательностью действий
        Input input = new StubInput(new String[]{"2", item.getId(), "test name", "desc", "y"});
        // создаём StartUI и вызываем метод init()
        new StartUI(input, tracker).init();
        // проверяем, что нулевой элемент массива в трекере содержит имя, введённое при эмуляции.
        Assert.assertEquals(tracker.findByid(item.getId()).getName(), "test name");
        this.out.reset();
    }



    @Test
    public void whenUserAddItemThenTrackerHasNewItemWithSameNameWithPrintBefore() {
        this.out.reset();
        Tracker tracker = new Tracker();     // создаём Tracker
        Input input = new StubInput(new String[]{"0", "test name", "desc","y"});   //создаём StubInput с последовательностью действий
        new StartUI(input, tracker).init();     //   создаём StartUI и вызываем метод init()
        Assert.assertEquals(
                this.out.toString(),
                new StringBuilder()
                        .append("0. Add the new item.")
                        .append(System.lineSeparator())
                        .append("1. Show  items.")
                        .append(System.lineSeparator())
                        .append("2. Edit  item.")
                        .append(System.lineSeparator())
                        .append("3. Delete  item.")
                        .append(System.lineSeparator())
                        .append("4. Find item by Id.")
                        .append(System.lineSeparator())
                        .append("5. Find item by name.")
                        .append(System.lineSeparator())
                        .toString()
                        );
                         // проверяем, что нулевой элемент массива в трекере содержит имя, введённое при эмуляции.
        this.out.reset();
    }

    @Test
    public void whenFindItemsByNameThenTrackerHasItem() {
        this.out.reset();
        // создаём Tracker
        Tracker tracker = new Tracker();
        //Напрямую добавляем заявку
        Item item = new Item("test name","desk", 0, null);
        tracker.add(item);
        //создаём StubInput с последовательностью действий
        Input input = new StubInput(new String[]{"5", "test name", "y"});
        // создаём StartUI и вызываем метод init()
        new StartUI(input, tracker).init();
        // проверяем, что нулевой элемент массива в трекере содержит имя, введённое при эмуляции.
        Assert.assertEquals(
                this.out.toString() ,
                new StringBuilder()
                        .append("0. Add the new item.")
                        .append(System.lineSeparator())
                        .append("1. Show  items.")
                        .append(System.lineSeparator())
                        .append("2. Edit  item.")
                        .append(System.lineSeparator())
                        .append("3. Delete  item.")
                        .append(System.lineSeparator())
                        .append("4. Find item by Id.")
                        .append(System.lineSeparator())
                        .append("5. Find item by name.")
                        .append(System.lineSeparator())
                        .append(String.format("%s. %s", item.getId(), item.getName()))
                        .append(System.lineSeparator())
                        .toString()
        );
    }



}
