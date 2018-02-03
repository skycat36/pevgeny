package main.java.ru.job4j.Professions;

import java.util.Date;

public class People {
     String FIO;
     Date birthdate;
     boolean helth;

     public People(String FIO, Date birthdate, boolean helth){
          this.FIO = FIO;
          this.birthdate = birthdate;
          this.helth = helth;
     }

     public String getFIO(){
          return FIO;
     }

     public boolean getHelth(){
          return  helth;
     }

     public void changeHelth(){
          helth = true;
     }
}
