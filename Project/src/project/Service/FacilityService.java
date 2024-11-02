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
            System.out.println("Chọn chức năng thêm loại trong Facilty:");
            System.out.println("1.Add new Villa.");
            System.out.println("2.Add new House.");
            System.out.println("3.Add new Room.");
            System.out.println("4.Back to menu.");
            int choice = CheckInputData.CheckInputOption("Mời bạn nhập chức năng thêm:", 1, 4);
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
          String idService = CheckInputData.checkInput("Mời bạn nhập mã dịch vụ của Villa:", ID_VILLA_VALID, "Mã dịch vụ không hợp lệ.Vui lòng nhập lại.");
          String nameService = CheckInputData.checkInput("Mời bạn nhập tên dịch vu:", NAME_VALID, "Tên dịch vụ không hợp lệ.Vui lòng nhập lại.");
          float usingArea = CheckInputData.checkInputArea("Mời bạn nhập diện tích sử dụng:", 30.0f);
          double price = CheckInputData.checkInputMoney("Mời bạn nhập chi phí thuê:", 0);
          int maxPeople = CheckInputData.checkInputPeople("Mời bạn nhập số người:", 0, 20);
          String rentalType = CheckInputData.checkInput("Mời bạn nhập kiểu thuê:", NAME_VALID, "Kiểu thuê không hợp lệ.Vui lòng nhập lại." );
          String roomStandard = CheckInputData.checkInput("Mời bạn nhập tiêu chuẩn phòng:", NAME_VALID,"Tiêu chuẩn phòng không hợp lệ.Vui lòng nhập lại." );
          float poolArea = CheckInputData.checkInputArea("Mời bạn nhập diện tích hồ bơi:", 30.0f);
          int quantityFloor = CheckInputData.checkInputFloor("Mời bạn nhập số tầng:", 0);
          Villa villa = new Villa(idService, nameService, usingArea, price, maxPeople, rentalType, roomStandard, poolArea, quantityFloor);
          facilityRepository.add(villa);
            System.out.println("Đã thêm thành công.");

            String mess = "Bạn có mốn nhập nữa không?(Y/N)";
            if (Validation.confirm(mess)) {
                continue;
            } else {
                return;
            }
        }

    }

    public static void addHouse() {
        while (true) {
            String idService = CheckInputData.checkInput("Mời bạn nhập mã dịch vụ của House:", ID_HOUSE_VALID, "Mã dịch vụ không hợp lệ.Vui lòng nhập lại.");
            String nameService = CheckInputData.checkInput("Mời bạn nhập tên dịch vu:", NAME_VALID, "Tên dịch vụ không hợp lệ.Vui lòng nhập lại.");
            float usingArea = CheckInputData.checkInputArea("Mời bạn nhập diện tích sử dụng:", 30.0f);
            double price = CheckInputData.checkInputMoney("Mời bạn nhập chi phí thuê:", 0);
            int maxPeople = CheckInputData.checkInputPeople("Mời bạn nhập số người:", 0, 20);
            String rentalType = CheckInputData.checkInput("Mời bạn nhập kiểu thuê:", NAME_VALID, "Kiểu thuê không hợp lệ.Vui lòng nhập lại.");
            String roomStandard = CheckInputData.checkInput("Mời bạn nhập tiêu chuẩn phòng:", NAME_VALID, "Tiêu chuẩn phòng không hợp lệ.Vui lòng nhập lại.");
            int quantityFloor = CheckInputData.checkInputFloor("Mời bạn nhập số tầng:", 0);
            House house = new House(idService, nameService, usingArea, price, maxPeople, rentalType, roomStandard, quantityFloor);
            facilityRepository.add(house);
            System.out.println("Đã thêm thành công.");
            String mess = "Bạn có mốn nhập nữa không?(Y/N)";
            if (Validation.confirm(mess)) {
                continue;
            } else {
                return;
            }
        }
    }

    public static void addRoom() {
        while (true) {
            String idService = CheckInputData.checkInput("Mời bạn nhập mã dịch vụ của Room:", ID_ROOM_VALID, "Mã dịch vụ không hợp lệ.Vui lòng nhập lại.");
            String nameService = CheckInputData.checkInput("Mời bạn nhập tên dịch vu:", NAME_VALID, "Tên dịch vụ không hợp lệ.Vui lòng nhập lại.");
            float usingArea = CheckInputData.checkInputArea("Mời bạn nhập diện tích sử dụng:", 30.0f);
            double price = CheckInputData.checkInputMoney("Mời bạn nhập chi phí thuê:", 0);
            int maxPeople = CheckInputData.checkInputPeople("Mời bạn nhập số người:", 0, 20);
            String rentalType = CheckInputData.checkInput("Mời bạn nhập kiểu thuê:", NAME_VALID, "Kiểu thuê không hợp lệ.Vui lòng nhập lại.");
            String freeService = CheckInputData.checkInputNull("Mời bạn nhập phí dịch vụ:", "freeService");
            Room room = new Room(idService, nameService, usingArea, price, maxPeople, rentalType, freeService );
            facilityRepository.add(room);
            System.out.println("Đã thêm thành công.");
            String mess = "Bạn có mốn nhập nữa không?(Y/N)";
            if (Validation.confirm(mess)) {
                continue;
            } else {
                return;
            }
        }
    }
}
