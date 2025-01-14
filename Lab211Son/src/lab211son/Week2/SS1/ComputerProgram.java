
package lab211son.Week2.SS1;

import lab211son.Week2.SS1.Calculator;
import lab211son.Week2.SS1.BMICalculator;
import java.util.Scanner;


public class ComputerProgram {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Calculator calculator = new Calculator();
        boolean running = true;

        while (running) {
            // Hiển thị menu
            System.out.println("========= Chương trình máy tính =========");
            System.out.println("1. Máy tính thông thường");
            System.out.println("2. Máy tính chỉ số BMI");
            System.out.println("3. Thoát");
            System.out.print("Vui lòng chọn một tùy chọn: ");

            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    normalCalculator(scanner, calculator);
                    break;
                case 2:
                    bmiCalculator(scanner);
                    break;
                case 3:
                    running = false;
                    System.out.println("Thoát chương trình. Tạm biệt!");
                    break;
                default:
                    System.out.println("Lựa chọn không hợp lệ. Vui lòng thử lại.");
            }
        }
        scanner.close();
    }

    private static void normalCalculator(Scanner scanner, Calculator calculator) {
        System.out.println("----- Máy tính thông thường -----");
        double memory = calculator.getMemory();
        System.out.println("Bộ nhớ: " + memory);

        while (true) {
            System.out.print("Nhập số: ");
            double number = scanner.nextDouble();

            System.out.print("Nhập Toán tử (+, -, *, /, ^, =): ");
            String operator = scanner.next();

            if (operator.equals("=")) {
                System.out.println("Kết quả: " + memory);
                calculator.setMemory(0.0); // Xóa bộ nhớ
                break;
            }

            System.out.print("Nhập số tiếp theo: ");
            double nextNumber = scanner.nextDouble();

            try {
                memory = calculator.calculate(memory == 0 ? number : memory, operator, nextNumber);
                System.out.println("Bộ nhớ: " + memory);
            } catch (ArithmeticException e) {
                System.out.println("Lỗi: " + e.getMessage());
            } catch (IllegalArgumentException e) {
                System.out.println("Lỗi: " + e.getMessage());
            }
        }

    }

    private static void bmiCalculator(Scanner scanner) {
        System.out.println("----- Máy tính chỉ số BMI -----");

        System.out.print("Nhập Cân nặng (kg): ");
        double weight = scanner.nextDouble();

        System.out.print("Nhập Chiều cao (m): ");
        double height = scanner.nextDouble();

        BMICalculator bmiCalculator = new BMICalculator(weight, height);
        double bmi = bmiCalculator.calculateBMI();
        String status = bmiCalculator.getBMIStatus();

        System.out.printf("Chỉ số BMI: %.2f%n", bmi);
        System.out.println("Trạng thái BMI: " + status);
    }

}
