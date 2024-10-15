package View;

import java.util.Scanner;

public class Utils {
    public static String getValue(String msg) {
        System.out.println(msg);
        Scanner sc = new Scanner(System.in);
        return sc.nextLine();
    }

    public static int getIntValue(String msg) { 
        Scanner sc = new Scanner(System.in);
        System.out.println(msg); 
        int value = 0;
        boolean valid = false;
        while (!valid) {
            try {
                value = Integer.parseInt(sc.nextLine());
                valid = true;
            } catch (Exception e) {
                System.out.println("Invalid input, please enter a valid integer.");
            }
        }
        return value;
    }
}