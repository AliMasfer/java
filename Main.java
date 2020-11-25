package com.company;
import java.util.Scanner;
public class Main {


    public static void main(String[] args) {
       Toyota toyota=new Toyota();//Here's the creation object from class Toyota
       toyota.model=2020;//inheritance all element , method , attribute in found super class car
       toyota.name="Toyota super,Toyota Coralla ,Toyota RAV ";
       toyota.Color="Red,Black,White";
       toyota.year=2020;
       toyota.t=1000;
       toyota.f=10000000;
       System.out.println( "name is:"+toyota.name+ "    modle type is:"+toyota.model+"   " +//print the code
               " Color has is:"+toyota.Color+"    Year is:"+toyota.year+" " +
               "   Be Speed is:"+toyota.clcaspeed());
        Jeep jeep=new Jeep();//Here's the creation object from class Toyota
        jeep.model=2020;//inheritance all element , method , attribute in found super class car
        jeep.name="JEEP XZ , SW , WWW ";
        jeep.Color="Red,Black,White";
        jeep.year=2020;
        jeep.t=1000;
        jeep.f=899000000;
        System.out.println( "name is:"+jeep.name+ "    modle type is:"+jeep.model+"   " +//print the code
                " Color has is:"+jeep.Color+"    Year is:"+jeep.year+" " +
                "   Be Speed is:"+jeep.clcaspeed());
    }
}

