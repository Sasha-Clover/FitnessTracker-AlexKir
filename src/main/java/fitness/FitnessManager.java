/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fitness;
import java.util.*;

/**
 *
 * @author alexk
 */

public class FitnessManager {

    // List for storage all workouts
    private ArrayList<Workout> workouts;

    // Constructor
    public FitnessManager() {
        workouts = new ArrayList<Workout>();
    }
    
    // Add train in list
    public void addWorkout(Workout workout) {
        workouts.add(workout);
        
        
    }
    public String displayWorkouts() {

    String result = "";

    // Walking throught every training
    for (int index = 0; index < workouts.size(); index = index + 1) {

        Workout workout = workouts.get(index);

        result = result + "ID: " + workout.getWorkoutId() + "\n";
        result = result + "Type: " + workout.getWorkoutType() + "\n";
        result = result + "Date: " + workout.getDate() + "\n";
        result = result + "Duration: " + workout.getDuration() + " min\n";
        result = result + "Intensity: " + workout.getIntensity() + "\n";
        result = result + "--------------------\n";
    }

    return result;
    }
    
    
    // 
    public Workout searchWorkout(int workoutId) {

    
    for (int index = 0; index < workouts.size(); index = index + 1) {

        Workout workout = workouts.get(index);

        // if got equal - return
        if (workout.getWorkoutId() == workoutId) {
            return workout;
        }
     }

    // If didn't find:
    return null;
   }
    
    
  
    public boolean deleteWorkout(int workoutId) {

    // Find our training
    Workout workout = searchWorkout(workoutId);

    // Checking
    if (workout != null) {

        // Delete if not null
        workouts.remove(workout);

        return true;
    }

    // If not found: 
    return false;
   }
    
    // Generate ID for every new workout
    public int generateId() {

    int newId = 1;

    while (searchWorkout(newId) != null) { // checking if exist

        newId = newId + 1;
    }

    return newId;
}
    
    

 }
    
