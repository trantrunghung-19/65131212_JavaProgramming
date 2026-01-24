package Lab1;

import java.util.Scanner;

public class Lab1_bai2_CVDT {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhập cạnh a: ");
        double a = sc.nextDouble();

        System.out.print("Nhập cạnh b: ");
        double b = sc.nextDouble();

        double chuVi = 2 * (a + b);
        double dienTich = a * b;
        double canhNho = Math.min(a, b);

        System.out.println("\nChu vi = " + chuVi);
        System.out.println("Diện tích = " + dienTich);
        System.out.println("Cạnh nhỏ = " + canhNho);

        sc.close();
    }
}

