/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cocktailapp;


public class Cup {

    static void resetNumberOfCups() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
    private double capacity;
    private double calories;
    private static int numberOfCups=0;

    public Cup(double capacity, double calories) {
        this.capacity = capacity;
        this.calories = calories*capacity;
        numberOfCups++;
        
    }

    public double getCapacity() {
        return capacity;
    }
    
    public void setCapacity(double capacity) {
        this.capacity = capacity;
    }

    public double getCalories() {
        return calories;
    }
    
    public void setCalories(double calories) {
        this.calories = calories;
    }

    public static int getNumberOfCups() {
        return numberOfCups;
    }
    public void setNumberOfCups(int numberOfCups) {
        this.numberOfCups = numberOfCups;
    }
    public String getInfo(){
        return "Cup { " + "capacity=" + capacity + ", numberOfCalories=" + calories + ", numberOfCups=" + numberOfCups + '}';
    }
}
