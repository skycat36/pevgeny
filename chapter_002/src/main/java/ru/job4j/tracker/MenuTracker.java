package ru.job4j.tracker;

public class MenuTracker  {

    private Input input;
    private Tracker tracker;
    private UserAction[] actions = new UserAction[6];

    public  MenuTracker(Input input, Tracker tracker){
        this.input = input;
        this.tracker = tracker;
        fillAction();
    }

    public void fillAction(){
        this.actions[0] = new AddItem();
        this.actions[1] = new ShowItem();
        this.actions[2] = new EditItem();
        this.actions[3] = new DeleteItem();
        this.actions[4] = new FindItemById();
        this.actions[5] = new FindItemByName();
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

    private class AddItem implements UserAction{
        public int key(){
            return 0;
        }

        public void execute(Input input, Tracker tracker){
            String name = input.ask("Please, enter the task's name: ");
            String desc = input.ask("Please, enter the task's desk: ");
            tracker.add(new Item(name,desc));
        }

        public String info(){
            return String.format("%s. %s", this.key(), "Add the new item. ");
        }
    }

    private static class ShowItem implements UserAction{
        public int key(){
            return 1;
        }

        public void execute(Input input, Tracker tracker){
            for (Item item: tracker.getAll()) {
                System.out.println(String.format("%s. %s", item.getId(), item.getName()));
            }
        }


        public String info(){
            return String.format("%s. %s", this.key(), "Show  items. ");
        }
    }

    class EditItem implements UserAction{
        public int key(){
            return 2;
        }

        public void execute(Input input, Tracker tracker){
            String id = input.ask("Please, enter the task's id: ");
            String name = input.ask("Please, enter the task's name: ");
            String desc = input.ask("Please, enter the task's desk: ");
            Item item = new Item(name, desc);
            item.setId(id);
            tracker.update(item);
        }


        public String info(){
            return String.format("%s. %s", this.key(), "Edit  items. ");
        }
    }

    class DeleteItem implements UserAction{
        public int key(){
            return 3;
        }

        public void execute(Input input, Tracker tracker){
            String id = input.ask("Please, enter the task's id: ");
            tracker.delete(id);
        }


        public String info(){
            return String.format("%s. %s", this.key(), "Delete  items. ");
        }
    }

    class FindItemById implements UserAction{
        public int key(){
            return 4;
        }

        public void execute(Input input, Tracker tracker){
            String id = input.ask("Please, enter the task's id: ");
            Item item = tracker.findByid(id);
            System.out.println(String.format("%s. %s", item.getId(), item.getName()));
        }

        public String info(){
            return String.format("%s. %s", this.key(), "Find item by Id. ");
        }
    }

    class FindItemByName implements UserAction{
        public int key(){
            return 5;
        }

        public void execute(Input input, Tracker tracker){
            String name = input.ask("Please, enter the task's name: ");
            Item item = tracker.findByName(name);
            System.out.println(String.format("%s. %s", item.getId(), item.getName()));
        }

        public String info(){
            return String.format("%s. %s", this.key(), "Find item by name. ");
        }
    }
}

