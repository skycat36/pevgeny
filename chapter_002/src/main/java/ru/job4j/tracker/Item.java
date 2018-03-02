package ru.job4j.tracker;

import java.util.Date;

public class Item {
    private String id;
    private String name;
    private String desc;
    private long created;
    private String[] comments;

    public Item(){
    }

    /**
     *   Конструктор
    */
    public Item(String name, String desc, int created, String[] comments){
        Date date = new Date();
        this.id = date.toString();
        this.name = name;
        this.desc = desc;
        this.created = created;
        this.comments = comments;
    }

    public void setId(String id){
        this.id = id;
    }

    void setName(String name){
        this.name = name;
    }

    void setDesc(String desc){
        this.desc = desc;
    }

    void setCreated(int created){
        this.created = created;
    }

    void setComents(String[] comments){
        this.comments = comments;
    }

    public String getId(){
        return this.id;
    }

    public String getName(){
        return this.name;
    }

    String getDesc(){
        return this.desc;
    }

    long getCreated(){
        return this.created;
    }

    String[] getComents(){
        return this.comments;
    }
}
