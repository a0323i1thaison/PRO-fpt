/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package project.Model;

/**
 *
 * @author thais
 */
public class Room extends Facility{
     private String freeService;

    public Room() {
    }

    public Room(String freeService) {
        this.freeService = freeService;
    }

    public Room(String idService, String nameService, float usingArea, double price, int maxPeople, String rentalType, String freeService) {
        super(idService, nameService, usingArea, price, maxPeople, rentalType);
        this.freeService = freeService;
    }

    public String getFreeService() {
        return freeService;
    }

    public void setFreeService(String freeService) {
        this.freeService = freeService;
    }

    @Override
    public String toString() {
        return super.toString() + "," + this.freeService;
    }

    public String getInfoToCSV() {
        return super.getInfoToCSV() + "," + this.freeService;
    }
    
}
