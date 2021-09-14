package vn.edu.giadinh.tuan01;

public class GiaiPTB1Menu {
    Double x, a, b;

    void giaiPTB1(){
        if(a==0){
            if(b==0){
                System.out.println("Vô Số Nghiệm");
            }
            else{
                System.out.println("Vô nghiệm");
            }
        }
        else{
            Double x = -b/a;
            System.out.println("Xuất nghiệm x = : " + x);
        }
    }
}
