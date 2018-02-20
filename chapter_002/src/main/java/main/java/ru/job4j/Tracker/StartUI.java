package main.java.ru.job4j.Tracker;

/**
 * @author Popov Evgeny
 * @version $Id$
 * @since 0.1
 */
public class StartUI {
    private static final String ADD = "0";
    private static final String Show_all = "1";
    private static final String Edit_item = "2";
    private static final String Delete_item = "3";
    private static final String Find_item_by_Id = "4";
    private static final String Find_items_by_name = "5";

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

    public void init() {
        boolean exit = false;
        while (!exit) {
            this.showMenu();
            String answer = this.consoleInput.ask("Введите пункт меню : ");
            switch (answer){
                case ADD: this.createItem(); break;
                case Show_all:  this.showAllItems(); break;
                case Edit_item: this.editItem(); break;
                case Delete_item: this.deleteItem(); break;
                case Find_item_by_Id: this.findItemById(); break;
                case Find_items_by_name: this.findItemByName(); break;
                default: exit = true; break;
            }
        }
    }

    private void createItem() {
        System.out.println("------------ Добавление новой заявки --------------");
        String name = this.consoleInput.ask("Введите имя заявки :");
        String desc = this.consoleInput.ask("Введите строку :");
        Item item = new Item(name, desc,0,null);
        this.tracker.add(item);
        System.out.println("------------ Новая заявка с getId : " + item.getId() + "-----------");
    }

    private void showAllItems(){
        Item[] items = tracker.getAll();
        for (int i = 0; i < items.length; i++){
            this.consoleInput.print(items[i]);
        }
        System.console();
    }

    private void editItem(){
        System.out.println("------------ Обновление заявки --------------");
        String id = this.consoleInput.ask("Введите ID :");
        Item item = tracker.findByid(id);
        String name = this.consoleInput.ask("Введите имя заявки :");
        String desc = this.consoleInput.ask("Введите строку :");
        item.setName(name);
        item.setDesc(desc);
        this.tracker.update(item);
    }

    private void deleteItem(){
        System.out.println("------------ Удаление заявки --------------");
        String id = this.consoleInput.ask("Введите ID :");
        tracker.delete(id);
    }

    private void findItemById(){
        System.out.println("------------ Поиск записи по заявки --------------");
        String id = this.consoleInput.ask("Введите ID :");
        this.consoleInput.print(tracker.findByid(id));
    }


    private void findItemByName(){
        System.out.println("------------ Поиск записи по имени --------------");
        String name = this.consoleInput.ask("Введите имя заявки :");
        Item item[] = tracker.getAll();
        for (int i = 0; i < item.length; i++){
            if (item[i].getName().equals(name)){
                this.consoleInput.print(item[i]); break;
            }
        }
    }


    private void showMenu() {
        System.out.println("Меню.\n");
        System.out.println("0. Add new Item\n" +
                "1. Show all items\n" +
                "2. Edit item\n" +
                "3. Delete item\n" +
                "4. Find item by Id\n" +
                "5. Find items by name\n" +
                "6. Exit Program\n" +
                "Select:");
    }

    /**
     * Запускт программы.
     * @param args
     */
    public static void main(String[] args) {
        new StartUI(new Input(), new Tracker()).init();
    }
}
