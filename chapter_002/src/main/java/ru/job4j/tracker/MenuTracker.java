package ru.job4j.tracker;

class ShowItems extends BaseAction{
    public ShowItems(int key, String name) {
        super(key, name);
    }

    public void execute(Input input, Tracker tracker){
        for (Item item: tracker.getAll()) {
            System.out.println(String.format("%s. %s", item.getId(), item.getName()));
        }
    }
}

public class MenuTracker {

    private Input input;
    private Tracker tracker;
    private BaseAction[] actions = new BaseAction[7];
    private int position = 0;

    public  MenuTracker(){

    }

    public  MenuTracker(Input input, Tracker tracker){
        this.input = input;
        this.tracker = tracker;
        fillAction();
    }

    public void fillAction(){
        this.actions[position++] = new AddItem(0, "Add the new item.");
        this.actions[position++] = new ShowItems(1, "Show  items.");
        this.actions[position++] = new EditItem(2,"Edit  item.");
        this.actions[position++] = new DeleteItem(3,"Delete  item.");
        this.actions[position++] = new FindItemById(4, "Find item by Id. ");
        this.actions[position++] = new FindItemByName(5, "Find item by name. ");
    }

    public void addAction(BaseAction baseAction){
        this.actions[position++] = baseAction;
    }

    public int[] getRange(){
        int countActions = 0;
        for (int i=0; i < actions.length; i++){
            if (actions[i]!= null){
                countActions++;
            }
        }
        int[] range = new int[countActions];
        countActions = 0;
        for (int i=0; i < actions.length; i++){
            if (actions[i]!= null){
                range[countActions++] = actions[i].key();
            }
        }
        return range;
    }

    public void select(int key){
        this.actions[key].execute(this.input, this.tracker);
    }

    public void show(){
        for (int i = 0; i < actions.length; i++){
            if (actions[i] != null){
                System.out.println(actions[i].info());
            }
        }
    }

    //inner classes
    class AddItem extends BaseAction {

        public AddItem(int key, String name) {
            super(key, name);
        }

        @Override
        public void execute(Input input, Tracker tracker) {
            String name = input.ask("Enter name:");
            String desc = input.ask("Enter description:");
            tracker.add(new Item(name, desc));
        }
    }

    class EditItem extends BaseAction{
        public EditItem(int key, String name) {
            super(key, name);
        }

        @Override
        public void execute(Input input, Tracker tracker){
            String id = input.ask("Please, enter the task's id: ");
            String name = input.ask("Please, enter the task's name: ");
            String desc = input.ask("Please, enter the task's desk: ");
            Item item = new Item(name, desc);
            item.setId(id);
            tracker.update(item);
        }
    }

    class DeleteItem extends BaseAction{

        public DeleteItem(int key, String name){
            super(key, name);
        }

        public void execute(Input input, Tracker tracker){
            String id = input.ask("Please, enter the task's id: ");
            tracker.delete(id);
        }

    }

    class FindItemById extends BaseAction{
        public FindItemById(int key, String name) {
            super(key, name);
        }

        @Override
        public void execute(Input input, Tracker tracker){
            String id = input.ask("Please, enter the task's id: ");
            Item item = tracker.findByid(id);
            System.out.println(String.format("%s. %s", item.getId(), item.getName()));
        }
    }

    class FindItemByName extends BaseAction{
        public FindItemByName(int key, String name) {
            super(key, name);
        }

        @Override
        public void execute(Input input, Tracker tracker){
            String name = input.ask("Please, enter the task's name: ");
            Item item = tracker.findByName(name);
            System.out.println(String.format("%s. %s", item.getId(), item.getName()));
        }
    }
}

