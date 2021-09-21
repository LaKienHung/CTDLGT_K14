package com.hunglk2008110018.tuan03;

public class SachTestDrive {
    public static void main(String[] args){
        Sach sach;
        sach = new Sach(10000, "Hưng", 2021, 22500, 100, "Hiện đại");
        
        System.out.println("Giá dao động : " + sach.gia);
        System.out.println("Nhà Xuất Bản : " + sach.nhaXuatBan);
        System.out.println("Năm xuất bản : " + sach.namSanXuat);
        System.out.println("Giá bán hiện tại : " + sach.giaBan);
        System.out.println("Số lượng : " + sach.soLuong);
        System.out.println("Loại : " + sach.loai);



    }
}
