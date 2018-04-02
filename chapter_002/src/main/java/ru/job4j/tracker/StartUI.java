package ru.job4j.tracker;

/**
 * @author Popov Evgeny
 * @version $Id$
 * @since 0.1
 */
public class StartUI {

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
        do {
            menu.show();
            int key = Integer.parseInt(consoleInput.ask("Select: "));
            menu.select(key);

        } while (!"y".equals(this.consoleInput.ask("Exit? y")));
    }


    /**
     * Запускт программы.
     * @param args
     */
    public static void main(String[] args) {
        new StartUI(new ConsoleInput(), new Tracker()).init();
    }
}
