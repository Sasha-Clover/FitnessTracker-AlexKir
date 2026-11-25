/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fitness;

/**
 *
 * @author alexk
 */
// inherti from Workout
public class CardioWorkout extends Workout {

    // Variables
    private double distance; // distance in km

    // Constructor
    public CardioWorkout(String date, int duration, int workoutId, String workoutType, String intensity, double distance) {

        // variables (Activity)
        this.date = date;
        this.duration = duration;
        
        //------------------------------

        // variables (Workout)
        this.workoutId = workoutId;
        this.workoutType = workoutType;
        this.intensity = intensity;

        // -------------------
        this.distance = distance;
    }

    // Getter
    public double getDistance() {
        return distance;
    }
}
