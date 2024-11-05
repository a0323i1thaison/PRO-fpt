/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package project.Service;

import java.util.List;
import java.util.Scanner;
import project.Model.Facility;
import project.Model.House;
import project.Model.Room;
import project.Model.Villa;
import project.Reponsitory.FacilityRepository;
import project.Service.impl.IFacilityService;
import project.Reponsitory.impl.IFacilityRepo;
import project.Util.CheckInputData;
import project.Util.Validation;

/**
 *
 * @author thais
 */
public class FacilityService implements IFacilityService{
    Scanner scanner = new Scanner(System.in);
    private static IFacilityRepo facilityRepository = new FacilityRepository();
    private static final String ID_VILLA_VALID = "^(SVVL)(-)\\d{4}$";
    private static final String ID_HOUSE_VALID = "^(SVHO)(-)\\d{4}$";
    private static final String ID_ROOM_VALID = "^(SVRO)(-)\\d{4}$";
    private static final String NAME_VALID = "^[A-Z][a-z ]*$";
    @Override
    public void add() {
        boolean flag = true;
        do {
            System.out.println("Select the add type function in Facility:");
            System.out.println("1.Add new Villa.");
            System.out.println("2.Add new House.");
            System.out.println("3.Add new Room.");
            System.out.println("4.Back to menu.");
            int choice = CheckInputData.CheckInputOption("Please enter additional functions:", 1, 4);
            switch (choice) {
                case 1: {
                    addVilla();
                    break;
                }
                case 2: {
                    addHouse();
                    break;
                }
                case 3: {
                    addRoom();
                    break;
                }
                default:{
                    flag = false;

                }
            }
        } while (flag);

    }

    @Override
    public void display() {
        List<Facility> facilityList = facilityRepository.getList();
        for (Facility f : facilityList) {
            System.out.println(f.getInfoToCSV());
        }

    }

    @Override
    public void edit(String idEdit) {

    }

    @Override
    public void delete(String idDel) {

    }

    public static void addVilla() {
        while (true) {
          String idService = CheckInputData.checkInput("Please enter Villa service code:", ID_VILLA_VALID, "Invalid service code.Please re-enter.");
          String nameService = CheckInputData.checkInput("Please enter the service name:", NAME_VALID, "Invalid service name.Please re-enter.");
          float usingArea = CheckInputData.checkInputArea("Please enter the usable area:", 30.0f);
          double price = CheckInputData.checkInputMoney("Please enter rental cost:", 0);
          int maxPeople = CheckInputData.checkInputPeople("Please enter number of people:", 0, 20);
          String rentalType = CheckInputData.checkInput("Please enter rental type:", NAME_VALID, "Invalid rental type.Please re-enter." );
          String roomStandard = CheckInputData.checkInput("Please enter room standard:", NAME_VALID,"Room standard is invalid.Please re-enter." );
          float poolArea = CheckInputData.checkInputArea("Please enter pool area:", 30.0f);
          int quantityFloor = CheckInputData.checkInputFloor("Please enter floor number:", 0);
          Villa villa = new Villa(idService, nameService, usingArea, price, maxPeople, rentalType, roomStandard, poolArea, quantityFloor);
          facilityRepository.add(villa);
            System.out.println("Added successfully.");

            String mess = "Do you want to enter more?(Y/N)";
            if (Validation.confirm(mess)) {
                continue;
            } else {
                return;
            }
        }

    }

    public static void addHouse() {
        while (true) {
            String idService = CheckInputData.checkInput("Please enter House service code:", ID_HOUSE_VALID, "Invalid service code.Please re-enter.");
            String nameService = CheckInputData.checkInput("Please enter the service name:", NAME_VALID, "Invalid service name.Please re-enter.");
            float usingArea = CheckInputData.checkInputArea("Please enter the usable area:", 30.0f);
            double price = CheckInputData.checkInputMoney("Please enter rental cost:", 0);
            int maxPeople = CheckInputData.checkInputPeople("Please enter number of people:", 0, 20);
            String rentalType = CheckInputData.checkInput("Please enter rental type:", NAME_VALID, "Invalid rental type.Please re-enter.");
            String roomStandard = CheckInputData.checkInput("Please enter room standard:Please enter room standard:", NAME_VALID, "Room standard is invalid.Please re-enter.");
            int quantityFloor = CheckInputData.checkInputFloor("Please enter floor number:", 0);
            House house = new House(idService, nameService, usingArea, price, maxPeople, rentalType, roomStandard, quantityFloor);
            facilityRepository.add(house);
            System.out.println("Added successfully.");
            String mess = "Do you want to enter more?(Y/N)";
            if (Validation.confirm(mess)) {
                continue;
            } else {
                return;
            }
        }
    }

    public static void addRoom() {
        while (true) {
            String idService = CheckInputData.checkInput("Please enter Room service code:", ID_ROOM_VALID, "Invalid service code.Please re-enter.");
            String nameService = CheckInputData.checkInput("Please enter the service name:", NAME_VALID, "Invalid service name.Please re-enter.");
            float usingArea = CheckInputData.checkInputArea("Please enter the usable area:", 30.0f);
            double price = CheckInputData.checkInputMoney("Please enter rental cost:", 0);
            int maxPeople = CheckInputData.checkInputPeople("Please enter number of people:", 0, 20);
            String rentalType = CheckInputData.checkInput("Please enter rental type:", NAME_VALID, "Invalid rental type.Please re-enter.");
            String freeService = CheckInputData.checkInputNull("Please enter service fee:", "freeService");
            Room room = new Room(idService, nameService, usingArea, price, maxPeople, rentalType, freeService );
            facilityRepository.add(room);
            System.out.println("Added successfully.");
            String mess = "Do you want to enter more?(Y/N)";
            if (Validation.confirm(mess)) {
                continue;
            } else {
                return;
            }
        }
    }
}
