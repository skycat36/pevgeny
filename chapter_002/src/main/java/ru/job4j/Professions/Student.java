package main.java.ru.job4j.Professions;

public class Student {
    String FIO;
    int knowelage;

    public Student(String FIO, int knowelage){
        this.FIO = FIO;
        this.knowelage = knowelage;
    }

    public int getKnowelage() {
        return knowelage;
    }

    public void setKnowelage(int knowelage) {
        this.knowelage = knowelage;
    }
}
