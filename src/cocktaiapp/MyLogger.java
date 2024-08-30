/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cocktailapp;

public class MyLogger implements InterfaceLogger {

    @Override
    public void log(String message) {
        System.out.println(message);
    }
}
