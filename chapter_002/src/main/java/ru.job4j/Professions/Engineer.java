package main.java.ru.job4j.Professions;

public class Engineer extends Professions {
    char way_in_work;

    public Engineer(char FIO_, char adress_, int work_experience_, boolean diploma_, int age_, int salary_, char way_in_work_) {
        super(FIO_, adress_, work_experience_, diploma_, age_, salary_);
        way_in_work = way_in_work_;
    }

    public Device Remote(Device device){
        device.changeDefect();
        return device;
    }

    public boolean Diagnostic(Device device) {
        return device.getDefect();
    }

}
