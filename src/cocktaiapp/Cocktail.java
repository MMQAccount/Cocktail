/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cocktailapp;

import java.util.ArrayList;


public class Cocktail{
    private int calories;
    private ColorEx color;
    ArrayList <Ingredient> ingredient = new ArrayList();

    public Cocktail(int calories, ColorEx color) {
        this.calories = calories;
        this.color = color;
    }
    

    public int getCalories() {
        return calories;
    }

    public void setCalories(int calories) {
        this.calories = calories;
    }

    public ColorEx getColor() {
        return this.color;
    }

    public void setColor(ColorEx color) {
        this.color = color;
    }

    public ArrayList<Ingredient> getIngredient() {
        return ingredient;
    }

    public void setIngredient(ArrayList<Ingredient> ingredient) {
        this.ingredient = ingredient;
    }


    public String getInfo() {
        String info = null;
        int count = 1;
        for(Ingredient i : ingredient){
            info += (count + ". " + i.getInfo()+'\n');
            count++;
        }
        count = 0;
        return "Cocktail { " + "calories=" + calories + ", color = "+ getColor().getInfo() + ", ingredient = " + info + '}';
      
    }   
    
    
}
