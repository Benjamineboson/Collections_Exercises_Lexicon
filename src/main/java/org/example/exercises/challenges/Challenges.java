package org.example.exercises.challenges;

import org.example.model.SuperHero;

import java.util.*;

public class Challenges {


    public void run(){
        System.out.println("\n-----Challenges-----\n");
        challengeOne();
        challengeTwo();
        challengeThree();
        challengeFour();
    }



    /* Create an empty hashSets and populate it with the all the days of the week.
     * Next create a second set and populate it with only the weekend days (SATURDAY and SUNDAY).
     * Lastly, compare the two sets and retain in the first set only those days that exist in both sets.
     */

    public void challengeOne () {
        HashSet<String> h_set1 = new HashSet<>();
        h_set1.add("Monday");
        h_set1.add("Tuesday");
        h_set1.add("Wednesday");
        h_set1.add("Thursday");
        h_set1.add("Friday");
        h_set1.add("Saturday");
        h_set1.add("Sunday");
        HashSet<String>h_set2 = new HashSet<>();
        h_set2.add("Saturday");
        h_set2.add("Sunday");
        h_set1.retainAll(h_set2);
        System.out.println(h_set1);
    }


    /*
     *  Create a new hashMap of types <Integer,String> and populate it with elements containing an id(Integer) and a name (String).
     *  Next, create a new Set and populate it with the keys from the hashMap you created.
     *
     */

    public void challengeTwo (){
        HashMap<Integer,String > hashMap = new HashMap <> ();
        hashMap.put(1, "Red");
        hashMap.put(2, "Green");
        hashMap.put(3, "Black");
        hashMap.put(4, "White");
        hashMap.put(5, "Blue");
        Set<Integer> set = hashMap.keySet();
        System.out.println(set);
    }

    /* Create a new class and call it SuperHero. Add fields for Id,Name and Age + getters and setters. Have the class implement the Comparable interface.
     * Implement the override method and have it compare the Age of the superhero. Next, create a Collection of type SuperHero.
     * Sort the Collection by Age and print out each element.
     */

    public void challengeThree(){
        List<SuperHero> superHeroList = new ArrayList<>();
        superHeroList.add(new SuperHero(1,"Batman",38));
        superHeroList.add(new SuperHero(2,"Superman",500));
        superHeroList.add(new SuperHero(3,"Spiderman",21));
        superHeroList.add(new SuperHero(4,"Wonderwoman",120));
        Collections.sort(superHeroList);
        for (SuperHero hero:superHeroList) {
            System.out.println("Id: "+hero.getId()
                    +", Name: "+hero.getName()
                    +", Age: "+hero.getAge());
        }
    }

    /* Create an array of type int with numbers: {1,4,4,2,6,7,7}. Next, create an appropriate Collection and populate
     * it with the content of the int array. Lastly, print out each element in the Collection without duplicates.
     */
    public void challengeFour(){
        int[] intArray = {1,4,4,2,6,7,7};
        Set<Integer> integerSet = new HashSet<>();
        for (int i = 0; i < intArray.length ; i++) {
            integerSet.add(intArray[i]);
        }
        for (Integer number:integerSet) {
            System.out.println(number);
        }
    }
}
