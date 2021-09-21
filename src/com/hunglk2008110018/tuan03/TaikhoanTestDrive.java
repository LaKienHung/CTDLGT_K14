package com.hunglk2008110018.tuan03;

public class TaikhoanTestDrive {
    public static void main(String[] args){
        Taikhoan taikhoan;
        taikhoan = new Taikhoan("Kiến Hưng", 2008110018, 1000000);

        System.out.println("Tên chủ tài khoản : " + taikhoan.tenchutaikhoan);
        System.out.println("Số tài khoản : " + taikhoan.sotaikhoan);
        System.out.println("Số dư tài khoản : " + taikhoan.sodutrongtaikhoan);




    }
}
