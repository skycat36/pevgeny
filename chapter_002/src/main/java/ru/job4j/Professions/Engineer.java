package main.java.ru.job4j.Professions;

public class Engineer extends Professions {
    String way_in_work;

    public Engineer(String FIO, String adress, int work_experience, boolean diploma, int age, int salary, String way_in_work) {
        super(FIO, adress, work_experience, diploma, age, salary);
        this.way_in_work = way_in_work;
    }

    public Device Remote(Device device){
        device.changeDefect();
        return device;
    }

    public boolean Diagnostic(Device device) {
        return device.getDefect();
    }

}
