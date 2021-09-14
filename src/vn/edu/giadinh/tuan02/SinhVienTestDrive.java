package vn.edu.giadinh.tuan02;

public class SinhVienTestDrive {

    public static void main(String[] args){
        SinhVien sinhVien;//Khai báo biến tên sinhVien tham chiếu đối tượng kiểu SinhVien
        sinhVien = new SinhVien();//Tạo đối tượng sinh viên trong vùng nhớ Heap
        sinhVien.mssv = "2008110018";
        sinhVien.tenSinhVien = "La Kiến Hưng";
        sinhVien.queQuan = "TQ";
        sinhVien.tuoi = 20;

        sinhVien.inThongTinSV();



    }


    
}
