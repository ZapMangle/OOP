package Lab1;

public class TESTDOG {
    public static void main(String[] args) {
        Dog d1 = new Dog("Бобик", 4);
        Dog d2 = new Dog("Лёлик", 3);
        Dog d3 = new Dog("Болик");
        d3.setAge(1);
        System.out.println(d1);
        d1.intoHumanAge();
        d2.intoHumanAge();
        d3.intoHumanAge();
    }
}
