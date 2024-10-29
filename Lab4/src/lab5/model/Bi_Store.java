/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab5.model;


import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author thais
 */
public class Bi_Store {
    private List<Bicycle> bicycles;

    public Bi_Store(String bicyclestxt) {
        bicycles = new ArrayList<>();
        // Initialize with 5 bicycles
        bicycles.add(new Bicycle("B001", 25, 150, true, "15/03/2022"));
        bicycles.add(new Bicycle("B002", 30, 20, false, "20/06/2021"));
        bicycles.add(new Bicycle("B003", 22, 100, false, "05/05/2023"));
        bicycles.add(new Bicycle("B004", 28, 80, true, "10/01/2020"));
        bicycles.add(new Bicycle("B005", 24, 120, false, "17/11/2022"));
    }

    public void addBicycle(Bicycle bicycle) {
        bicycles.add(bicycle);
    }

    public void deleteBicycle(String bicycleId) {
        bicycles.removeIf(b -> b.getBicycleId().equals(bicycleId));
    }

    public Bicycle searchLeastTimeToMove() {
        return bicycles.stream()
                .min((b1, b2) -> Double.compare(b1.getDistance() / b1.getSpeed(), b2.getDistance() / b2.getSpeed()))
                .orElse(null);
    }

    public List<Bicycle> getBicycles() {
        return bicycles;
    }

    public void printBicycles() {
        for (Bicycle bicycle : bicycles) {
            System.out.println(bicycle);
        }
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

    // Method to load bicycles from a text file
    public void loadFromFile(String filename) {
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
                    bicycles.add(bicycle);
                }
            }
        } catch (IOException e) {
            System.err.println("Error reading from file: " + e.getMessage());
        } catch (NumberFormatException e) {
            System.err.println("Error parsing number: " + e.getMessage());
        }
    }

    public void printBicyclesByProductionYear() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
