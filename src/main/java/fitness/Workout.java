/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fitness;

/**
 *
 * @author alexk
 */

// "inherit" variables and methods from Activity
public class Workout extends Activity {

    // variables
    protected int workoutId;
    protected String workoutType;
    protected String intensity;
    
    // Constructor 1
    public Workout() {
    }

    // Constructor 2
    public Workout(String date, int duration, int workoutId, String workoutType, String intensity) {

        // ---------------------------------
        this.date = date;
        this.duration = duration;

        // ---------------------------------
        this.workoutId = workoutId;
        this.workoutType = workoutType;
        this.intensity = intensity;
    }

    // Getters
    public int getWorkoutId() { // get id
        return workoutId;
    }

    public String getWorkoutType() { // get type
        return workoutType;
    }

    
    public String getIntensity() { // get intensity
        return intensity;
    }
}
