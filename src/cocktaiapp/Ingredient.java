/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cocktailapp;


public abstract class Ingredient {

    String name;
    int numberOfCalories;
    protected int volume;
    private ColorEx color;


    public Ingredient(String name, int numberOfCalories, int volume) {
        this.name = name;
        this.numberOfCalories = numberOfCalories;
        this.volume = volume;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getNumberOfCalories() {
        return numberOfCalories;
    }

    public void setNumberOfCalories(int numberOfCalories) {
        this.numberOfCalories = numberOfCalories;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public ColorEx getColor() {
        return color;
    }

    public void setColor(ColorEx color) {
        this.color = color;
    }

    
    public String getInfo() {
        return "name = " + name + ", Number Of Calories = " + numberOfCalories + ", ";
    }
    
        
}
