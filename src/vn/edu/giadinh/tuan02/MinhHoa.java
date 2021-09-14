package vn.edu.giadinh.tuan02;

import java.util.Scanner;//#include

public class MinhHoa {
    public static void main(String[] args){
        double diemMonCTDLGT;
        Scanner bienNhap;//Biến tham chiếu đối tượng
        diemMonCTDLGT = 4.0;//f
        //Sử dụng lớp
        //Toán tử new
        //Hàm tạo của lớp Scanner

        bienNhap = new Scanner(System.in);//Toán tử gán biến nhập vào new scanner biến tham chiếu

        System.out.println("Nhập điểm môn CTDL & GT: ");

        diemMonCTDLGT = bienNhap.nextDouble();

        System.out.println("Điểm vừa nhập vào là " + diemMonCTDLGT);

        String chuoi = new String("Hello Bạn");

    }
}