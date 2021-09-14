package vn.edu.giadinh.tuan01;

import java.util.Scanner;

public class Lab1Bai2 {
    
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhập a,b lần lượt dài và rộng : ");
        Double a = scanner.nextDouble();
        Double b = scanner.nextDouble();
        Double chuVi = (a + b)*2;
        System.out.println("Xuat Chu vi: " + chuVi);
        Double dienTich = a * b;
        System.out.println("Xuat Dien tich: " + dienTich);
        Double canhNhoNhat = Math.min(a,b);
        System.out.println("Xuat Canh nho nhat: " + canhNhoNhat);
    }


}
