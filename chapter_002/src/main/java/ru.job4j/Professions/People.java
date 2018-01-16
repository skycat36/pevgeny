package main.java.ru.job4j.Professions;

import java.util.Date;

public class People {
     char FIO;
     Date birthdate;
     boolean helth;

     public People(char FIO_, Date birthdate_, boolean helth_){
          FIO = FIO_;
          birthdate = birthdate_;
          helth = helth_;
     }

     public char getFIO(){
          return FIO;
     }

     public boolean getHelth(){
          return  helth;
     }

     public void changeHelth(){
          helth = true;
     }
}
