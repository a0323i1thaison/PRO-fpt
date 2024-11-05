/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package project.Util;

import java.util.Scanner;

/**
 *
 * @author thais
 */
public class CheckInputData {
    private static Scanner scanner = new Scanner(System.in);
    public static int CheckInputOption(String message, int min, int max) {
        while (true) {
            try {
                System.out.println(message);
                int option = Integer.parseInt(scanner.nextLine());
                if (option < min || option > max) {
                    System.out.printf("Option must be from %d to %d", min, max);
                    continue;
                }
                return option;
            } catch (Exception e) {
                System.out.println("Option must be numeric.");
            }
        }
    }



    public static String checkInput(String message, String rerex, String warn) {
        while (true) {
            System.out.println(message);
            String result = scanner.nextLine();
            if(result.matches(rerex)) {
                return result;
            } else {
                System.out.println(warn);
            }
        }
    }
    public static String checkInputSex(String message) {
        while (true) {
            System.out.println(message);
            String sex = scanner.nextLine();
            if(sex.equalsIgnoreCase("Nam") || sex.equalsIgnoreCase("Nu")) {
                return sex;
            } else {
                System.out.println("Sex must be nam or nu.");
            }
        }
    }

    public static String checkInputLevel(String message) {
        while (true) {
            System.out.println(message);
            String level = scanner.nextLine();
            if(level.equalsIgnoreCase("Trung cap") || level.equalsIgnoreCase("Cao dang") || level.equalsIgnoreCase("Dai hoc") || level.equalsIgnoreCase("Sau dai hoc")) {
                return level;
            } else {
                System.out.println("The level must be Trung cap,Cao dang,Dai hoc, Sau dai hoc.Please re-enter");
            }
        }
    }

    public static String checkInputPosition(String message) {
        while (true) {
            System.out.println(message);
            String position = scanner.nextLine();
            if(position.equalsIgnoreCase("Le tan") || position.equalsIgnoreCase("Phuc vu") || position.equalsIgnoreCase("Chuyen vien") || position.equalsIgnoreCase("Giam sat") || position.equalsIgnoreCase("Quan li") || position.equalsIgnoreCase("Giam doc")) {
                return position;
            } else {
                System.out.println("The location must be Le tan, Phuc vu, Chuyen Vien, Giam Sat, Quan Ly, Giam Doc . Please re-enter.");
            }
        }
    }
    public static String checkInputNull(String message, String warn) {
        while (true) {
            System.out.println(message);
            String result = scanner.nextLine();
            if(result.length() == 0 || result == null) {
                System.out.println(warn + "Invalid.Please re-enter.");
            }
        }
    }




    public static double checkInputMoney(String message, double min) {
        while (true) {
            try {
                System.out.println(message);
                double money = Double.parseDouble(scanner.nextLine());
                if (money < min ) {
                    System.out.printf("Money must be an amount greater than %d", min);
                    continue;
                }
                return money;
            } catch (Exception e) {
//                System.out.println(e.getMessage());
                System.out.println("Money must be numbers.");
            }
        }
    }

    public static float checkInputArea(String message, float min ) {
        while (true) {
            try {
                System.out.println(message);
                float area = Float.parseFloat(scanner.nextLine());
                if (area < min) {
                    System.out.printf("Area must be greater than %d m2", min );
                    continue;
                }
                return area;
            } catch (Exception e) {
                System.out.println("Area must be a number.");
            }
        }
    }

    public static int checkInputPeople(String message, int min, int max) {
        while (true) {
            try {
                System.out.println(message);
                int people = Integer.parseInt(scanner.nextLine());
                if(people <= min || people >= max ) {
                    System.out.printf("Number of people must be between %d and %d people.", min, max);
                    continue;
                }
                return people;
            } catch (Exception e) {
                System.out.println("Number of people must be number.");
            }

        }
    }
    public static int checkInputFloor(String message, int min) {
        while (true) {
            try {
                System.out.println(message);
                int floor = Integer.parseInt(scanner.nextLine());
                if(floor <= min) {
                    System.out.printf("Number of floors must be greater than %d", min);
                    continue;
                }
                return floor;
            } catch (Exception e) {
                System.out.println("Floor number must be numeric.");
            }
        }
    }
}
