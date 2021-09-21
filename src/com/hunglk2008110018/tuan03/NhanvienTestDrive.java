package com.hunglk2008110018.tuan03;

public class NhanvienTestDrive {
    public static void main(String[] args){

        Nhanvien nhanvien;
        nhanvien = new Nhanvien("Kiến Hưng", 30000000, "TP Hồ Chí Minh", "Bộ phận kiểm tra", "17.05.2001");

        System.out.println("Tên NV : " + nhanvien.tenNV);
        System.out.println("Lương : " + nhanvien.luong);
        System.out.println("Địa chỉ : " + nhanvien.diachi);
        System.out.println("Bộ phận làm việc : " + nhanvien.boPhan);
        System.out.println("Ngày sinh : " + nhanvien.ngaySinh);
        


    }
}
