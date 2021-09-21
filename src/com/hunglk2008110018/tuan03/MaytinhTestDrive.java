package com.hunglk2008110018.tuan03;

public class MaytinhTestDrive {
    public static void main(String[] args){
        Maytinh maytinh;
        maytinh = new Maytinh("DELL", 2019 , "Windows", "8G Ram", "Core i3 TH10U", 13000000 ,2022);

        System.out.println("Nhà sản xuất : " + maytinh.nhaSanXuat);
        System.out.println("Năm Sản Xuất : " + maytinh.namSanXuat);
        System.out.println("Hệ điều hành : " + maytinh.heDieuHanh);
        System.out.println("Ram : " + maytinh.ram);
        System.out.println("CPU : " + maytinh.cpu);
        System.out.println("Giá : " + maytinh.gia);
        System.out.println("Năm bảo hành : " + maytinh.namBaoHanh);
        


    }
}
