package ru.job4j.tracker;

/**
 * @author Popov Evgeny
 * @version $Id$
 * @since 0.1
 */
public class StartUI {

    private int[] range = new int[] {1, 2, 3, 4, 5};

    private final Input consoleInput;

    private final Tracker tracker;

    /**
     * Конструтор инициализирующий поля.
     * @param consoleInput ввод данных.
     * @param tracker хранилище заявок.
     */
    public StartUI(Input consoleInput, Tracker tracker) {
        this.consoleInput = consoleInput;
        this.tracker = tracker;
    }

    public StartUI(ConsoleInput consoleInput, Tracker tracker) {
        this.consoleInput = consoleInput;
        this.tracker = tracker;
    }

    public void init() {
        MenuTracker menu = new MenuTracker(this.consoleInput, this.tracker);
        this.range = menu.getRange();
        do {
            menu.show();
            menu.select(this.consoleInput.ask("Select: ", range));

        } while (!"y".equals(this.consoleInput.ask("Exit? y")));
    }


    /**
     * Запускт программы.
     * @param args
     */
    public static void main(String[] args) {
        new StartUI(new ValidateInput(new ConsoleInput()), new Tracker()).init();
    }
}
