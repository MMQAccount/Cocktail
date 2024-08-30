/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cocktailapp;


public class Suger extends Ingredient{
    private ColorEx color;
    
    public Suger(String name, int numberOfCalories) {
        super(name, numberOfCalories, 0);
        if(name.equals("Brown Suger")){
            this.color = new ColorEx(201, 160, 98);
        }
        else{
            this.color = new ColorEx(255, 255, 255);
        }
        super.setColor(color);
    }

    public String getInfo() {
        return "Suger{" + super.getInfo() +  "color=" + color.getInfo() + '}';
    }


    
    
}
