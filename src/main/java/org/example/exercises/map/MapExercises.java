package org.example.exercises.map;

import org.example.model.Car;

import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MapExercises {


    public void run(){
        System.out.println("\n-----MAP-EXERCISES-----\n");
        exerciseOne();
        exerciseTwo();
        exerciseThree();
        exerciseFour();
    }


    /* Create a new hashMap of type <Integer,String> and populate it with elements containing an id(Integer) and a car brand(String).
     * Lastly, print out the entire hashMap.
     *
     */

    public void exerciseOne(){
        HashMap map = new HashMap();
        map.put(1,"BMW");
        map.put(2,"Saab");
        map.put(3,"Audi");
        map.put(4,"Mercedes");
        map.put(5,"Volvo");
        System.out.println(map);
    }


    /* Create a new hashMap of type <Integer,String> and populate it with elements containing an id(Integer) and a car brand(String).
     * Lastly, print out only the keys.
     *
     */

    public void exerciseTwo(){
        HashMap map = new HashMap();
        map.put(1,"BMW");
        map.put(2,"Saab");
        map.put(3,"Audi");
        map.put(4,"Mercedes");
        map.put(5,"Volvo");
        System.out.println(map.keySet());
    }

    /* Create a new hashMap of type <Integer,String> and populate it with elements containing an id(Integer) and a car brand(String).
     * Lastly, print out only the values.
     *
     */

    public void exerciseThree(){
        HashMap map = new HashMap();
        map.put(1,"BMW");
        map.put(2,"Saab");
        map.put(3,"Audi");
        map.put(4,"Mercedes");
        map.put(5,"Volvo");
        System.out.println(map.values());
    }

    /* Create a new class and call it Car. Add fields for Id,Brand and Model + getters and setters
     * Create a new hashMap of type <Integer,Car> and populate it with elements containing an id(Integer) and a car object(Car).
     * Lastly, print out only the car's brand.
     */

    public void exerciseFour(){
        Map<Integer,Car> map = new HashMap<>();
        map.put(1,new Car(1,"Volvo","v70"));
        map.put(2,new Car(2,"Saab","9-5"));
        map.put(3,new Car(3,"BMW","m3"));
        map.put(4,new Car(4,"Audi","a4"));
        Collection<Car> carList = map.values();
        for (Car car:carList) {
            System.out.println(car.getBrand());
        }
    }



}
