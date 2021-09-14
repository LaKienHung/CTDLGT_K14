package vn.edu.giadinh.tuan01;

import java.util.Scanner;

public class Lab1Bai3 {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập cạnh : ");
        Double a = scanner.nextDouble();
        Double theTichLapPhuong = Math.pow(a, 3);
        System.out.println("Xuất thể tích của khối chữ nhật : " + theTichLapPhuong);



    }
}
