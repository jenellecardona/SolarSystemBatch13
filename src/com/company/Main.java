package com.company;

public class Main {
    public static void main(String[] args) {
        SolarSystem solar=new SolarSystem();
        solar.Sun=1;
        solar.Moon=4;
        solar.Planet=2;

        System.out.println("The basic structure is ready");

        //developing the feature sun
        Sun sun=new Sun();
        sun.temperature="12345";
        sun.name="Ontero";
        sun.radius="765432312";
        sun.color="Orange";

    }
}
