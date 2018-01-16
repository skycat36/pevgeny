package main.java.ru.job4j.Professions;

public class Teacher extends Professions {
    char discepline;

    public Teacher(char FIO_, char adress_, int work_experience_, boolean diploma_, int age_, int salary_, char discepline_) {
        super(FIO_, adress_, work_experience_, diploma_, age_, salary_);
        discepline = discepline_;
    }

    public Student Teach(Student student, int know){
        student.setKnowelage(know);
        return  student;
    }

    public int Ask(Student student){
        return student.getKnowelage();
    }
}
