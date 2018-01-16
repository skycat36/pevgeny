package main.java.ru.job4j.Professions;

public class Doctor extends Professions {

    char way_in_medcine;

    public Doctor(char FIO_, char adress_, int work_experience_, boolean diploma_, int age_, int salary_, char way_in_medcine_) {
        super(FIO_, adress_, work_experience_, diploma_, age_, salary_);
        way_in_medcine = way_in_medcine_;
    }

    public People Heal(People people){
        people.changeHelth();
        return people;
    }

    public char give_out_help(People people){
        return people.getFIO();
    }

    public boolean diagnostic(People people){
        return people.getHelth();
    }

}
