/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cocktailapp;


public class ColorEx {
    private int r;
    private int g;
    private int b;

    public ColorEx(int r, int g, int b) {
        this.r = r;
        this.g = g;
        this.b = b;
    }

    public ColorEx() {
    }

    public int getR() {
        return r;
    }

    public void setR(int r) {
        this.r = r;
    }

    public int getG() {
        return g;
    }

    public void setG(int g) {
        this.g = g;
    }

    public int getB() {
        return b;
    }

    public void setB(int b) {
        this.b = b;
    }


    public String getInfo() {
        return '(' + "r=" + r + ", g=" + g + ", b=" + b + ')';
    }
    
}