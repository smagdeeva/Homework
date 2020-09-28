package lesson2;

public class Main {
    public static void main(String[] args) {
        Phone iphone1 = new Phone();
        Phone iphone2 = new Phone();
        Phone iphone3 = new Phone();
        System.out.println(iphone1);
        iphone1.getNumber();
        iphone1.receiveCall("");
        System.out.println(iphone2);
        iphone2.getNumber();
        iphone2.receiveCall("");
        System.out.println(iphone3);
        iphone3.getNumber();
        iphone3.receiveCall("");

    }
}
