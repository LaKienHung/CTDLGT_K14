package vn.edu.giadinh.tuan02;

import java.util.Date;
import java.util.Scanner;

public class SinhVien {
    
    //1. thuộc tính

    String mssv;
    String tenSinhVien;
    int tuoi;

    String queQuan;

    Date ngaysinh;
    //2. Phương thức
    //<Kiểu trả về> <Tên Hàm><(danh sách tham số)>{.....}
    void inThongTinSV(){
        System.out.println("Mã số sinh viên : " + mssv);
        System.out.println("Tên sinh viên : " + tenSinhVien);
        System.out.println("Tuổi : " + tuoi);
        System.out.println("Quê Quán : " + queQuan);

    }



}