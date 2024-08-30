/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cocktailapp;


public class Milk extends Ingredient{

    private ColorEx color;
    public Milk(String name, int numberOfCalories, int volume) {
        super(name, numberOfCalories, volume);        
        if(name.equals("bluish")){
           this.color = new ColorEx(249,253,186); 
        }
        else if(name.equals("yellow")){
           this.color = new ColorEx(204, 255, 204); 
        }
        else {
          this.color = new ColorEx(255, 255, 255);
        }
        super.setColor(color);

    }

    @Override
    public String getInfo() {
        return "Milk{" + super.getInfo() + "volum=" + volume + ", color=" + color.getInfo() + '}';
    }
    
    
   


    
}
