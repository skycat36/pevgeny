package main.java.ru.job4j.Tracker;

public class Tracker {
    private Item[] items = new Item[100];
    private int position = 0;

    public void add(Item item) {
        this.items[position] = item;
        position++;
    }

    public void update(Item item) {
        for (int index = 0; index < position; index++) {
            if (this.items[index].getId().equals(item.getId())) {
                this.items[index] = item;
                break;
            }
        }
    }

    public Item findByid(String id) {
        for (Item item : items) {
            if (item.getId().equals(id)) {
                return item;
            }
        }
        return null;
    }

    public void delete(String id) {
        for (int i=0; i < position; i++){
            if (items[i].getId().equals(id)){
                items[i] = new Item();

                Item temp = items[i+1];                     // смещение удаленных элементов в конец
                for (int j = i; j < position; j++){
                    items[j] = temp;
                    temp = items[j+1];
                }
                position--;
            }
        }
    }

    public Item[] getAll() {
        Item[] temp;
        int countNotes = 0;

        for (Item item : items) {
            if (item != null) {
                countNotes++;
            }
        }

        temp = new Item[countNotes];
        for (int i = 0, j = 0; i < this.items.length; i++) {
            if (this.items[i] != null) {
                temp[j] = this.items[i];
                j++;
            }
        }

        return temp;
    }

}
