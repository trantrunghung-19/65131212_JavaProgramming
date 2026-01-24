package Lab1;

import java.util.Scanner;

public class Lab1_Bai4_Delta {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhập hệ số a: ");
        double a = sc.nextDouble();

        System.out.print("Nhập hệ số b: ");
        double b = sc.nextDouble();

        System.out.print("Nhập hệ số c: ");
        double c = sc.nextDouble();

        double delta = b * b - 4 * a * c;

        System.out.println("\nDelta = " + delta);

        if (delta >= 0) {
            double canDelta = Math.sqrt(delta);
            System.out.println("Căn delta = " + canDelta);
        } else {
            System.out.println("Delta âm, không có căn thực.");
        }

        sc.close();
    }
}
