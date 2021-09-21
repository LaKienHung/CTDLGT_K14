package com.hunglk2008110018.tuan03;

public class XeTestDrive {
    public static void main(String[] args){
        Xe xe;
        xe = new Xe("Kiến Hưng", "Mercedes-Benz", "Sport", "Đã đủ điều kiện", 87.06);

        System.out.println("Tên chủ xe : " + xe.tenCX);
        System.out.println("Hảng sản xuất : " + xe.hangxe);
        System.out.println("Dòng xe : " + xe.dongxe);
        System.out.println("Giáy phép lái : " + xe.giayphep);
        System.out.println("Dung tích xăng (lít) : " + xe.dungTX);
        


    }
}
