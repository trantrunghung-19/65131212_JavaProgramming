package Lab1;

import java.util.Scanner;

public class Lab1_bai1_DTB {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhập họ và tên sinh viên: ");
        String hoTen = sc.nextLine();

        System.out.print("Nhập điểm trung bình: ");
        double dtb = sc.nextDouble();

        System.out.println("\n--- Thông tin sinh viên ---");
        System.out.println("Họ tên: " + hoTen);
        System.out.println("Điểm trung bình: " + dtb);

        sc.close(); 
    }
}
