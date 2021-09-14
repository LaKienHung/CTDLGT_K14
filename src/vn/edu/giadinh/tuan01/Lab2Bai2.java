package vn.edu.giadinh.tuan01;

import java.util.Scanner;

public class Lab2Bai2 {
    
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập hệ số a,b và c : ");
        Double a = scanner.nextDouble();
        Double b = scanner.nextDouble();
        Double c = scanner.nextDouble();
        Double x , x1 , x2, delta;
        if(a==0){
            if(b==0){
                if(c==0){
                    System.out.println("Vô Số Nghiệm");
                }
                else{
                    System.out.println("Vô nghiệm");
                }
            }
            else{
            x = -b/a;
            System.out.println("Xuất nghiệm x = : " + x);
            }}
        else{
            delta = Math.pow(b, 2) - 4*a*c;
            if(delta<0){
                System.out.println("Vô Nghiệm");
            }else if(delta == 0){
                x = -b/(2*a);
                System.out.println("Nghiệm kép x = " + x);
            }else{
                    x1 = (-b+Math.sqrt(delta))/(2*a);
                    x2 = (-b-Math.sqrt(delta))/(2*a);
                    System.out.println("Xuất nghiệm x1 = " + x1);
                    System.out.println("Xuất nghiệm x2 = " + x2);
                }
        }


    }
}
