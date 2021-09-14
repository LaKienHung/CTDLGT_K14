package vn.edu.giadinh.tuan01;

import java.util.Scanner;

public class Lab2Bai1 {
    
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập hệ số a,b : ");
        Double a = scanner.nextDouble();
        Double b = scanner.nextDouble();
        if(a==0){
            if(b==0){
                System.out.println("Vô Số Nghiệm");
            }
            else{
                System.out.println("Vô nghiệm");
            }
        }
        else{
            Double x = -b/a;
            System.out.println("Xuất nghiệm x = : " + x);
        }

    }

}
