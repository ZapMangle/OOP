package Lab3;

public class TESTBALL {
    public static void main(String[] args) {
        Ball b1 = new Ball(567, 875);
        Ball b2 = new Ball(345, 865);
        Ball b3 = new Ball(876, 235);
        Ball b4 = new Ball(875, 976);
        System.out.println(b1);
        System.out.println(b2);
        System.out.println(b3);
        System.out.println(b4);
        b1.move(65,35);
        b2.move(87,98);
        b3.move(23,54);
        b4.move(65,87);
        System.out.println(b1);
        System.out.println(b2);
        System.out.println(b3);
        System.out.println(b4);
    }
}
