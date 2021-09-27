package vn.edu.giadinh.tuan03;

import java.util.Scanner;

public class Lab3bai5 {
    public static void main(String[] args){
        SinhVien[] dsSinhVien = new SinhVien[2];
        //Nhap danh sach sv tu ban phim
        Scanner bienNhap = new Scanner(System.in);
        System.out.println("Nhập danh sách sinh Viên ");

        for(int i = 0; i < dsSinhVien.length; i++){
            System.out.println("Nhập sv thứ " + (i+1));
            System.out.print("MSSV : " );
            int mssv = bienNhap.nextInt();
            System.out.print("Tên Sv : " );
            String hoTen = bienNhap.nextLine();
            System.out.print("Tuổi : " );
            int tuoi = bienNhap.nextInt();
            System.out.print("quê quán : " );
            String quequan = bienNhap.nextLine();
            bienNhap.nextLine();
            dsSinhVien[i] = new SinhVien(mssv, hoTen, tuoi, quequan);
            
        }
        System.out.println("=============InDs============");
        for(SinhVien sinhvien : dsSinhVien){
            sinhvien.inThongtin();
        }
        




    }
}
