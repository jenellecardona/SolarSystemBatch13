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
        sun.radius=7654321;
        sun.color="Orange";

        //Planet 2
        Planet2 planet2=new Planet2();
        planet2.color="Green";
        planet2.size="766558585km";
        planet2.name="Pliea";

        //developing planet 1
        Planet1 planet=new Planet1();
        planet.color="magenta";
        planet.name="Hash";
        planet.size="545488km";


    }
}
