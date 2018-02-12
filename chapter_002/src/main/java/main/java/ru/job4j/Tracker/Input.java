package main.java.ru.job4j.Tracker;

import java.util.Scanner;

public class Input {

    public String ask(String question){
        System.out.println(question);
        Scanner in = new Scanner(System.in);
        return in.nextLine();
    }

    public void print(Item data){
        System.out.println(data.getId());
        System.out.println("Name: " + data.getName());
        System.out.println("Desc: " + data.getDesc());
        System.out.println("Created: " + data.getCreated());
        System.out.println("Coments: " + data.getComents());
    }
}
