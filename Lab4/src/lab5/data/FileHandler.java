/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Lab5.data;

import java.awt.List;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.text.SimpleDateFormat;
import lab5.model.Bi_Store;
import lab5.model.Bicycle;


/**
 *
 * @author thais
 */
public class FileHandler {
    private String filename;
    private Iterable<Bicycle> bicycles;

    public FileHandler(String filename) {
        this.filename = filename;
    }
 public void saveToFile(String filename) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(filename))) {
            for (Bicycle bicycle : bicycles) {
                writer.write(bicycle.getBicycleId() + "," + bicycle.getSpeed() + "," 
                             + bicycle.getDistance() + "," + bicycle.isElectric() + "," 
                             + new SimpleDateFormat("dd/MM/yyyy").format(bicycle.getProductionDate()));
                writer.newLine();
            }
        } catch (IOException e) {
            System.err.println("Error writing to file: " + e.getMessage());
        }
    }
 
    public void loadFromFile(Bi_Store biStore) {
        try (BufferedReader reader = new BufferedReader(new FileReader(filename))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] parts = line.split(",");
                if (parts.length == 5) {
                    String bicycleId = parts[0];
                    int speed = Integer.parseInt(parts[1]);
                    double distance = Double.parseDouble(parts[2]);
                    boolean isElectric = Boolean.parseBoolean(parts[3]);
                    String productionDate = parts[4];
                    Bicycle bicycle = new Bicycle(bicycleId, speed, distance, isElectric, productionDate);
                    biStore.addBicycle(bicycle);
                }
            }
        } catch (IOException e) {
            System.err.println("Error reading from file: " + e.getMessage());
        } catch (NumberFormatException e) {
            System.err.println("Error parsing number: " + e.getMessage());
        }
    }
   
}
