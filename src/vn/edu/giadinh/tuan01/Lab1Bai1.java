package vn.edu.giadinh.tuan01;

import java.util.Scanner;

public class Lab1Bai1 {
    
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        System.out.print("Họ Và Tên : ");
        
        String hoTen = scanner.nextLine();

        System.out.print("Điểm TB : ");

        Double diemTB = scanner.nextDouble();

        System.out.printf("%s %f điểm", hoTen, diemTB);

    }


}
