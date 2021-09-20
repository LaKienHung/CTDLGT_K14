package vn.edu.giadinh.tuan03;

public class CowTestDirve {
    public static void main(String[] args) {
        Cow cow;
        //cow = new Cow();
        cow = new Cow(15);
        System.out.println("weight: " + cow.weight);

        //cow.weight = 15;

        cow = new Cow(25.5, "Châu Á", "Vàng nâu");

        System.out.println("weight: " + cow.weight + " Bread " + cow.bread + " Color " + cow.color);

    }
}
