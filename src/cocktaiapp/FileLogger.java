/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cocktailapp;

/**
 *
 * @author iman
 */
import java.io.FileWriter;
import java.io.IOException;

public class FileLogger implements InterfaceLogger {
    private String filePath;

    public FileLogger(String filePath) {
        this.filePath = filePath;
    }

    @Override
    public void log(String message) {
        try (FileWriter writer = new FileWriter(filePath, true)) {
            writer.write(message + "\n");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
