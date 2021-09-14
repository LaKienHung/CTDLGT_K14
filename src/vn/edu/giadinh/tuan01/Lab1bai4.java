package vn.edu.giadinh.tuan01;

import java.util.Scanner;

public class Lab1bai4 {

    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập a,b,c : ");
        Double a = scanner.nextDouble();
        Double b = scanner.nextDouble();
        Double c = scanner.nextDouble();
        Double delta = Math.pow(b, 2) - 4*a*c;
        Math.sqrt(delta);
        System.out.println("Delta : " + delta);
        


    }
}
