package org.example;


import org.example.exercises.challenges.Challenges;
import org.example.exercises.list.ListExercises;
import org.example.exercises.map.MapExercises;
import org.example.exercises.set.SetExercises;

public class App
{
    public static void main( String[] args )
    {

        Challenges challenges = new Challenges();
        challenges.run();


        SetExercises setExercises = new SetExercises();
        setExercises.run();

        MapExercises mapExercises = new MapExercises();
        mapExercises.run();


        ListExercises listExercises = new ListExercises();
        listExercises.run();
    }

}
