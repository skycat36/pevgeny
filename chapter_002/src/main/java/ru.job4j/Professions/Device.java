package main.java.ru.job4j.Professions;

public class Device {
    String name;
    boolean defect;

    public Device(String name, boolean defect){
        this.name = name;
        this.defect = defect;
    }

    public void changeDefect(){
        defect = true;
    }

    public boolean getDefect(){
        return defect;
    }
}
