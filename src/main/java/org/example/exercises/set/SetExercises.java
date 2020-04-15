package org.example.exercises.set;

import java.util.*;

public class SetExercises {



    public void run(){
        System.out.println("\n-----SET-EXERCISES-----\n");
        exerciseOne();
        exerciseTwo();
        exerciseThree();
        exerciseFour();
    }


    /* Create a new hashSet and populate it with the days of the week. Lastly, print the list out and pay attention to the order of the elements
     */
    public void exerciseOne(){
        Set<String> stringSet = new HashSet<>();
        stringSet.add("monday");
        stringSet.add("tuesday");
        stringSet.add("wednesday");
        stringSet.add("thursday");
        stringSet.add("friday");
        stringSet.add("saturday");
        stringSet.add("sunday");
        System.out.println(stringSet);
    }

    /* Create a new hashSet and populate it with the days of the week. Then convert the hashSet to an arrayList.
     */
    public void exerciseTwo(){
        Set<String> stringSet = new HashSet<>();
        stringSet.add("monday");
        stringSet.add("tuesday");
        stringSet.add("wednesday");
        stringSet.add("thursday");
        stringSet.add("friday");
        stringSet.add("saturday");
        stringSet.add("sunday");

        List<String> stringList = new ArrayList<>(stringSet);
        System.out.println(stringList);
    }


    /* Create a new hashSet and populate it with random names. Then convert the hashSet to an arrayList.
     * Lastly, manually sort the list in alphabetical order and print it out.
     */
    public void exerciseThree(){
        Set<String> stringSet = new HashSet<>();
        stringSet.add("Benjamin");
        stringSet.add("Erik");
        stringSet.add("Ulf");
        stringSet.add("Simon");
        stringSet.add("Fredrik");
        List<String> stringList = new ArrayList<>(stringSet);
        for (int i = 0; i < stringList.size(); i++) {
            for (int j = i; j > 0 ; j--) {
                if (stringList.get(j).charAt(0) < stringList.get(j-1).charAt(0)){
                    String temp = stringList.get(j);
                    stringList.set(j,stringList.get(j-1));
                    stringList.set(j-1,temp);
                }
            }
        }
        System.out.println(stringList);
    }

    /* Create a new hashSet and populate it with random names. Then convert the hashSet to an arrayList.
     * Lastly, sort the list in alphabetical order using the Collections class and print it out.
     */
    public void exerciseFour(){
        Set<String> stringSet = new HashSet<>();
        stringSet.add("Benjamin");
        stringSet.add("Erik");
        stringSet.add("Ulf");
        stringSet.add("Simon");
        stringSet.add("Fredrik");
        TreeSet<String> stringList = new TreeSet<>(stringSet);
        System.out.println(stringList);
    }



}
