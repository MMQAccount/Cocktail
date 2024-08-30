/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cocktailapp;


public class CocktailApp {
    public static void main(String[] args) {
        Blender b1 = new Blender(1000, new FileLogger("new.txt"));
        Fruit i1 = new Fruit("Banana", 20,100);
        Suger i2 = new Suger("Brown Suger", 8);
        Milk i3 = new Milk("bluish", 20, 91);
        
        Cocktail coc = null;
        try {
            b1.add(i1);
            b1.add(i2);
            b1.add(i3);
            b1.blend();
            coc = new Cocktail(b1.getCapacity(), b1.getColor());
            Cup c1 = new Cup(150, b1.getCaloriesInUnit());
            Cup c2 = new Cup(150, b1.getCaloriesInUnit());
            b1.pour(c1);
            //b1.pour(c2);
            
        }catch(OverFlowExeption ex){
            ex.getMessage();
        }
        catch(EmptyBlenderExeption ex){
            ex.getMessage();
        }
        catch(Exception ex){
            ex.getMessage();
        }
       
        System.out.println(b1.getInfo());
        
        System.out.println(coc.getInfo());
        
    }
}
