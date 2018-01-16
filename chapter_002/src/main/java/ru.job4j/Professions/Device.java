package main.java.ru.job4j.Professions;

public class Device {
    char name;
    boolean defect;

    public Device(char name_, boolean defect_){
        name = name_;
        defect = defect_;
    }

    public void changeDefect(){
        defect = true;
    }

    public boolean getDefect(){
        return defect;
    }
}
