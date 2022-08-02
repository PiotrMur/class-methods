package com.piotrmurawski.classes;

import com.piotrmurawski.classes.auxiliary.Building;
import com.piotrmurawski.classes.auxiliary.Car;
import com.piotrmurawski.classes.auxiliary.Construction;
import com.piotrmurawski.classes.auxiliary.House;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        Math.exp(10);

        Car car1 = new Car("BMW", "X5", 5, "V8");
        Car car2 = new Car("BMW", "X5", 5, "V12");
        Car car3 = car1;

        System.out.println(car1 == car3);
        System.out.println(car1.equals(car2));
        System.out.println(car3.equals(car1));

        /*System.out.println(car1.hashCode());
        System.out.println(car1.getManufacturer().hashCode());
        System.out.println(car1.getBrand().hashCode());
        System.out.println(car1.getTypeOfEngine().hashCode());

        for(Field field : car1.getClass().getDeclaredFields()){
            field.setAccessible(true);
            try{
                System.out.println(field.getName() + " = " + field.get(car1));
            } catch(IllegalAccessException e){
                e.printStackTrace();
            }
        }*/


        /*Building con1 = new Building("Brick", 5, "Square");
        Construction con2 = new Construction("Timber");
        Construction con3 = new Construction("Concrete");

        List<Construction> constructionList = new ArrayList<>();
        constructionList.add(con1);
        constructionList.add(con2);
        constructionList.add(con3);

        System.out.println("Construction1: " + con1.isPainted());
        System.out.println("Construction2: " + con2.isPainted());
        System.out.println("Construction3: " + con3.isPainted());


        paintAllBuildings(constructionList);

        System.out.println("Construction1: " + con1.isPainted());
        System.out.println("Construction2: " + con2.isPainted());
        System.out.println("Construction3: " + con3.isPainted());*/

    }

    /*public static void paintAllBuildings(List<? extends Construction> constructions) {
        constructions.forEach(Construction::paint);
    }*/
}
