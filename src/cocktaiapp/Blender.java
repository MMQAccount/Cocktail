/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cocktailapp;

import java.util.ArrayList;


   public class Blender {
    private int numberOfCalories =0;
    private int capacity; 
    private ColorEx color ;
    private int volume = 0;
    public ArrayList <Ingredient> ingredientList = new ArrayList();
    private InterfaceLogger logger;
    private int r=0,g=0,b=0;
        
    public Blender( int capacity,  InterfaceLogger logger ) {
        
        this.capacity = capacity;
        this.logger = logger;

    }
    public void updateColor(){
        r = g = b = 0;
        for(Ingredient i2 : ingredientList){
            r += i2.getColor().getR();
            g += i2.getColor().getG();
            b += i2.getColor().getB();
        }
    }
    public void add(Ingredient i) throws OverFlowExeption{
       
        volume += i.getVolume();
        numberOfCalories += i.getNumberOfCalories();
        if (volume < capacity) {                                      
            ingredientList.add(i);                             
            updateColor();
            logger.log("Added ingredient: " + i.getInfo());   
        } 

    }
   

    ColorEx color1 = new ColorEx(r,b,g);
    public int getNumberOfCalories() {
        return numberOfCalories;
    }

    public void setNumberOfCalories(int numberOfCalories) {
        this.numberOfCalories = numberOfCalories;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    
    public ColorEx getColor() {
        
        if(!ingredientList.isEmpty()){
            this.color = new ColorEx(r/ingredientList.size(), g/ingredientList.size(), b/ingredientList.size());
            
        } 
        else {
            this.color = new ColorEx(0,0,0);
        }
        return color;
    }

    public void setColor(ColorEx color) {
        this.color = color;
    }

    public int getVolume() {
        
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    
    
    public ArrayList<Ingredient> getIngredientList() {
        return ingredientList;
    }

    public void print() {
        int count = 1;
        System.out.println("\n");
        for(Ingredient i : ingredientList){
            System.out.println(count + ". " + i.getInfo() + '\n');
            count++;
        }
        count = 0;      
    }

    public void setIngredientList(ArrayList<Ingredient> ingredientList) {
        this.ingredientList = ingredientList;
    }
   
    public void blend() throws EmptyBlenderExeption {
        if (ingredientList.size() == 0) {
            logger.log("Blender is empty. Cannot blend.");
            throw new EmptyBlenderExeption();
        }

        int totalCalories = 0;
        for (Ingredient i : ingredientList) {
            totalCalories += i.getNumberOfCalories();
        }
        logger.log("Blending ingredients");
    }
    
    public double getCaloriesInUnit(){
        return numberOfCalories/(double)volume;
    }
 
    public void pour(Cup cup) throws EmptyBlenderExeption {

        if (volume <= 0) {
            logger.log("Blender is empty. ");
            throw new EmptyBlenderExeption();
        }
        if(volume > 0){
            setVolume(volume -= cup.getCapacity());
        }
        numberOfCalories -= cup.getCalories();
        
        logger.log("Pouring into cup: " + cup.getInfo());
    }


    public String getInfo() {
        System.out.print("Blender { " + "numberOfCalories = " + numberOfCalories + ", capacity = " + capacity + ", color = " + getColor().getInfo() + ", volume = " + getVolume() + "\n ingredientList = ");
        print();
        System.out.print(", logger = ");
        logger.log("File }");
        return " ";
    }
}


