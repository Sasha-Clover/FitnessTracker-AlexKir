/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fitness;

import fitness.FitnessMenu;
import javax.swing.*;
import java.awt.event.*; // listener for buttons
import java.awt.Color; // settings for color
import java.awt.Font; // settings for font

/**
 *
 * @author alexk
 */
public class AddWorkout extends JFrame {
    
    private JPanel p; // panel
    private JLabel workoutTypeLabel;
    private JLabel selectedTypeLabel;
    
    private JButton runningButton;
    private JButton gymButton;
    private JButton cyclingButton;
    private JButton swimmingButton;
    
    private JLabel dateLabel;
    private JTextField dateField;

    private JLabel durationLabel;
    private JTextField durationField;
    
    private JLabel intensityLabel;
    private JComboBox<String> intensityBox;
    
    private JLabel distanceLabel;
    private JTextField distanceField;
    
    private JButton saveButton;
    
    private JButton returnButton; // back
    
    private String selectedType = "";
    
    public AddWorkout() {
        
        setSize(500, 550);
        setLocation(10, 10);

        p = new JPanel();
        p.setLayout(null);
        add(p);
        
 
        workoutTypeLabel = new JLabel("Workout Type:");
        workoutTypeLabel.setFont(new Font("Arial", Font.BOLD, 20));
        
        selectedTypeLabel = new JLabel("Selected: None");
        
        //---------------------------------------------
        runningButton = new JButton("Running");
        runningButton.setFocusPainted(false); // remove border near text
        runningButton.setBackground(new Color(48, 26, 34)); // color
        runningButton.setForeground(Color.WHITE);
        //---------------------------------------------
        gymButton = new JButton("Gym");
        gymButton.setFocusPainted(false); // remove border near text
        gymButton.setBackground(new Color(32, 30, 56)); // color
        gymButton.setForeground(Color.WHITE);
        //---------------------------------------------
        cyclingButton = new JButton("Cycling");
        cyclingButton.setFocusPainted(false); // remove border near text
        cyclingButton.setBackground(new Color(15, 51, 74)); // color
        cyclingButton.setForeground(Color.WHITE);
        //---------------------------------------------
        swimmingButton = new JButton("Swimming");
        swimmingButton.setFocusPainted(false); // remove border near text
        swimmingButton.setBackground(new Color(61, 59, 33)); // color
        swimmingButton.setForeground(Color.WHITE);
        //----------------------------------------------
        saveButton = new JButton("Save Workout");
        saveButton.setFocusPainted(false); // remove border near text
        saveButton.setBackground(new Color(9, 36, 150)); // color
        saveButton.setForeground(Color.WHITE);
        //----------------------------------------------
        returnButton = new JButton("Back");
        returnButton.setFocusPainted(false);
        returnButton.setBackground(new Color(255, 255, 255));
        returnButton.setForeground(Color.BLACK);
        
        dateLabel = new JLabel("Date:");
        dateField = new JTextField();

        durationLabel = new JLabel("Duration (min):");
        durationField = new JTextField();
        
        intensityLabel = new JLabel("Intensity:");
        String[] intensityOptions = {"Low", "Medium", "High"};
        intensityBox = new JComboBox<String>(intensityOptions);
        
        distanceLabel = new JLabel("Distance (km):");
        distanceField = new JTextField();
        distanceField.setEnabled(false);
        
        // configure our cordinates
        
        workoutTypeLabel.setBounds(175, 10, 200, 30);
        selectedTypeLabel.setBounds(50, 185, 400, 30);

        runningButton.setBounds(50, 94, 180, 40);
        gymButton.setBounds(250, 94, 180, 40);
        cyclingButton.setBounds(50, 144, 180, 40);
        swimmingButton.setBounds(250, 144, 180, 40);
        
        dateLabel.setBounds(50, 220, 120, 30);
        dateField.setBounds(180, 220, 220, 30);

        durationLabel.setBounds(50, 260, 120, 30);
        durationField.setBounds(180, 260, 220, 30);
        
        intensityLabel.setBounds(50, 300, 120, 30);
        intensityBox.setBounds(180, 300, 220, 30);
        
        distanceLabel.setBounds(50, 340, 120, 30);
        distanceField.setBounds(180, 340, 220, 30);
        
        saveButton.setBounds(150, 390, 200, 40);
        
        returnButton.setBounds(150, 450, 200, 40);
        
        
        p.add(workoutTypeLabel);
        p.add(selectedTypeLabel);
        
        p.add(runningButton);
        p.add(gymButton);
        p.add(cyclingButton);
        p.add(swimmingButton);
        
        p.add(dateLabel);
        p.add(dateField);

        p.add(durationLabel);
        p.add(durationField);
        
        p.add(intensityLabel);
        p.add(intensityBox);
        
        p.add(distanceLabel);
        p.add(distanceField);
        
        p.add(saveButton);
        
        p.add(returnButton);
        
        //-----------------------
        returnButton.addActionListener(new ActionListener() { // listener-event

          public void actionPerformed(ActionEvent event) {
             returnButtonActionPerformed(event);
        }

     });
        runningButton.addActionListener(new ActionListener() {

          public void actionPerformed(ActionEvent event) {
          selectedType = "Running";
          selectedTypeLabel.setText("Selected: " + selectedType);
          distanceField.setEnabled(true);
        }

     });
        
        gymButton.addActionListener(new ActionListener() {

          public void actionPerformed(ActionEvent event) {
          selectedType = "Gym";
          selectedTypeLabel.setText("Selected: " + selectedType);
          distanceField.setEnabled(false); // no need for GYM
          distanceField.setText(""); // clear if not empty
       }

     });

        cyclingButton.addActionListener(new ActionListener() {

          public void actionPerformed(ActionEvent event) {
          selectedType = "Cycling";
          selectedTypeLabel.setText("Selected: " + selectedType);
          distanceField.setEnabled(true);
       }

     });

        swimmingButton.addActionListener(new ActionListener() {

          public void actionPerformed(ActionEvent event) {
          selectedType = "Swimming";
          selectedTypeLabel.setText("Selected: " + selectedType);
          distanceField.setEnabled(true);
       }

     });

}
    
        //--------------------------------
        private void returnButtonActionPerformed(ActionEvent event) {

          FitnessMenu menu = new FitnessMenu();
          menu.setVisible(true); // "show" our new window
          setVisible(false); // "close" our current window

    }
    
}
