package main.java.ru.job4j.Professions;

public class Student {
    char FIO;
    int knowelage;

    public Student(char FIO_, int knowelage_){
        FIO = FIO_;
        knowelage = knowelage_;
    }

    public int getKnowelage() {
        return knowelage;
    }

    public void setKnowelage(int knowelage) {
        this.knowelage = knowelage;
    }
}
