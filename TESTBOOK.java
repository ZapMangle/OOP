package Lab2;

public class TESTBOOK {
    public static void main(String[] args) {
        Book d1 = new Book("Ревизор", "Н.В.Гоголь", 123, 321);
        Book d2 = new Book("Евгений Онегин", "А.С.Пушкин", 312, 432);
        Book d3 = new Book("Готовим Дома", "Д.Т.Оливер", 126, 543);
        System.out.println(d1);
        d1.getprice();
        d2.getprice();
        d3.getprice();
    }
}
