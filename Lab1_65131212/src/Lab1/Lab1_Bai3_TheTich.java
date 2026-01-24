package Lab1;

import java.util.Scanner;

public class Lab1_Bai3_TheTich {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhập cạnh khối lập phương: ");
        double a = sc.nextDouble();

        double theTich = a * a * a;

        System.out.println("Thể tích khối lập phương = " + theTich);

        sc.close();
    }
}
