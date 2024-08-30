/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cocktailapp;


public class Fruit extends Ingredient{
    private ColorEx color;
  
    public Fruit(String name, int numberOfCalories, int volume) {
        
        super(name, numberOfCalories, volume);
        if(name.equals("Orange")){
            this.color = new ColorEx(255,128,0);
        }
        else if(name.equals("Strawberry")){
            this.color = new ColorEx(255,17,37);
        }
        else if(name.equals("Banana")){
            this.color = new ColorEx(243,232,127);
        }
        else if(name.equals("Mango")){
            this.color = new ColorEx(255,187,97);
        }
        else if(name.equals("Blueberry")){
            this.color = new ColorEx(165,38,127);
        }
        else if(name.equals("Kiwi")){
            this.color = new ColorEx(94,198,94);
        }
        else {
            this.color = new ColorEx(255,255,255);
        }
        super.setColor(color);
    }
    
    /**
     *
     * @return
     */
    
    @Override
    public String getInfo() {
        return "Fruit{" + super.getInfo() +  "color = " + color.getInfo() + ", volume=" + volume + '}';
    }
}
