package main.java.ru.job4j.Professions;

public class Teacher extends Professions {
    String discepline;

    public Teacher(String FIO, String adress, int work_experience, boolean diploma, int age, int salary, String discepline) {
        super(FIO, adress, work_experience, diploma, age, salary);
        this.discepline = discepline;
    }

    public Student Teach(Student student, int know){
        student.setKnowelage(know);
        return  student;
    }

    public int Ask(Student student){
        return student.getKnowelage();
    }
}