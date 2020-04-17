package org.example.exercises.list;

import org.example.model.SuperHero;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ListExercises {


    public void run(){
        System.out.println("\n-----LIST-EXERCISES-----\n");
        exerciseOne();
        exerciseTwo();
        exerciseThree();
        exerciseFour();

    }


    /* Create a new String arrayList and populate it with the days of the week. Lastly, print the out the list.
     */
    public void exerciseOne(){
        List<String> stringList = new ArrayList<>();
        stringList.add("monday");
        stringList.add("tuesday");
        stringList.add("wednesday");
        stringList.add("thursday");
        stringList.add("friday");
        stringList.add("saturday");
        stringList.add("sunday");
        System.out.println(stringList);
    }


    /* Create a new String arrayList and populate it with the days of the week. Lastly, iterate through the list and print out each element
     * separately.
     */
    public void exerciseTwo(){
        List<String> stringList = new ArrayList<>();
        stringList.add("monday");
        stringList.add("tuesday");
        stringList.add("wednesday");
        stringList.add("thursday");
        stringList.add("friday");
        stringList.add("saturday");
        stringList.add("sunday");
        for (String dayOfWeek:stringList) {
            System.out.println(dayOfWeek);
        }
    }

    /* Create a new String arrayList and populate it with the days of the week excluding THURSDAY. Then insert the weekday THURSDAY
     * into the right position in the list.
     */
    public void exerciseThree(){
        List<String> stringList = new ArrayList<>();
        stringList.add("monday");
        stringList.add("tuesday");
        stringList.add("wednesday");
        stringList.add("friday");
        stringList.add("saturday");
        stringList.add("sunday");

        stringList.add(4,"thursday");
    }

    /* Create a new String arrayList and populate it with the days of the week. Then create a new list out of the first three elements of the
     * list using a subList.
     */
    public void exerciseFour(){
        List<String> stringList = new ArrayList<>();
        stringList.add("monday");
        stringList.add("tuesday");
        stringList.add("wednesday");
        stringList.add("thursday");
        stringList.add("friday");
        stringList.add("saturday");
        stringList.add("sunday");
        List<String> subList = stringList.subList(0,3);
        System.out.println(subList);
    }



}
