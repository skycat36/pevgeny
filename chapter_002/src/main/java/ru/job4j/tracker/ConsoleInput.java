package ru.job4j.tracker;

import java.util.Scanner;

public class ConsoleInput implements Input {
    @Override
    public String ask(String question){
        System.out.println(question);
        Scanner in = new Scanner(System.in);
        return in.nextLine();
    }

    @Override
    public int ask(String question, int[] range) {
        int key = Integer.valueOf(this.ask(question));
        boolean exist = false;
        for (int value : range){
            if (value == key){
                exist = true;
                break;
            }
        }
        if (exist) {
            return key;
        }else {
            throw new MenuOutExeption("Out of menu range. ");
        }

    }

    public void print(Item data){
        System.out.println(data.getId());
        System.out.println("Name: " + data.getName());
        System.out.println("Desc: " + data.getDesc());
        System.out.println("Created: " + data.getCreated());
        System.out.println("Coments: " + data.getComents());
    }
}
