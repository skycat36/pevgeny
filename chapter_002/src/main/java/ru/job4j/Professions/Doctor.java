package main.java.ru.job4j.Professions;

public class Doctor extends Professions {

    String way_in_medcine;

    public Doctor(String FIO, String adress, int work_experience, boolean diploma, int age, int salary, String way_in_medcine) {
        super(FIO, adress, work_experience, diploma, age, salary);
        this.way_in_medcine = way_in_medcine;
    }

    public People Heal(People people){
        people.changeHelth();
        return people;
    }

    public String give_out_help(People people){
        return people.getFIO();
    }

    public boolean diagnostic(People people){
        return people.getHelth();
    }

}
