/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab5.model;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author thais
 */
public class Bicycle {
     private String bicycleId;
    private int speed;
    private double distance;
    private boolean isElectric;
    private Date productionDate;

    public Bicycle(String bicycleId, int speed, double distance, boolean isElectric, String productionDate) {
        this.bicycleId = bicycleId;
        this.speed = speed;
        this.distance = distance;
        this.isElectric = isElectric;
        try {
            this.productionDate = new SimpleDateFormat("dd/MM/yyyy").parse(productionDate);
        } catch (Exception e) {
            this.productionDate = new Date(); // Default to current date if parsing fails
        }
    }

    // Getters and Setters
    public String getBicycleId() {
        return bicycleId;
    }

    public void setBicycleId(String bicycleId) {
        this.bicycleId = bicycleId;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public double getDistance() {
        return distance;
    }

    public void setDistance(double distance) {
        this.distance = distance;
    }

    public boolean isElectric() {
        return isElectric;
    }

    public void setElectric(boolean electric) {
        isElectric = electric;
    }

    public Date getProductionDate() {
        return productionDate;
    }

    public void setProductionDate(Date productionDate) {
        this.productionDate = productionDate;
    }

    public String needToRecharge() {
        if (isElectric && distance > 60) {
            return "Need to recharge batteries";
        } else {
            return "Don't need to recharge";
        }
    }

    @Override
    public String toString() {
        String typePrefix = isElectric ? "E-" : "";
        return typePrefix + "Bicycle |" + bicycleId + "|" + speed + "|" +
                distance + "|" + needToRecharge() + "|" +
                new SimpleDateFormat("dd/MM/yyyy").format(productionDate);
    }
    
}
