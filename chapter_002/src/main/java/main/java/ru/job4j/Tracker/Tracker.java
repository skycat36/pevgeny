package main.java.ru.job4j.Tracker;

public class Tracker {
    private main.java.ru.job4j.Tracker.Item[] items = new main.java.ru.job4j.Tracker.Item[100];   //Массив обьектов
    private int position = 0;               //Позиция последнего элемента

    /**  Добавляем элемент в массив
    *   @param item - добавляемый обьект
    */
    public void add(main.java.ru.job4j.Tracker.Item item) {
        this.items[position] = item;
        position++;
    }


    /**  Обновляем элемент в массиве
    *   @param item - Обновляемый обьект
    */
    public void update(main.java.ru.job4j.Tracker.Item item) {
        for (int index = 0; index < position; index++) {
            if (this.items[index].getId().equals(item.getId())) {
                this.items[index] = item;
                break;
            }
        }
    }

    /**  Ищем элемент в массиве по id
    *   @param  id - id обьекта
    */
    public Item findByid(String id) {
        for (Item item : items) {
            if (item.getId().equals(id)) {
                return item;
            }
        }
        return null;
    }

    /**  Удаляем элемент в массиве по id
    *   @param  id - id обьекта
    */
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

    //Вывод всех непустых элементов из массив
    public Item[] getAll() {
        Item[] temp;
        int countNotes = 0;
        //Подсчет непустых элементов
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
