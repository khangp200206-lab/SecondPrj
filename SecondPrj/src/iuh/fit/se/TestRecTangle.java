package iuh.fit.se;
import java.util.Scanner;

public class TestRecTangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            System.out.print("Enter length: ");
            double length = sc.nextDouble();
            System.out.print("Enter width: ");
            double width = sc.nextDouble();

            RecTangle rect = new RecTangle(length, width); // ✅ gọi đúng class RecTangle
            System.out.println(rect.toString());
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
        sc.close();
    }
}

/**
 * @description:  This class represents a bank with many bank accounts
 * @author:  Huynh Huy Khang
 * @version: 1.0
 * @created: Sep 4, 2025 5:33:57 PM
 */
