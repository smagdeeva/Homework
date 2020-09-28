package lesson2;

public class Phone {
    private int number;
    private String model;
    private int weight;


    public void receiveCall(String name) {
        System.out.println("Звонит " + name);
    }

    public void getNumber() {
        System.out.println(number);

    }

    public Phone(int a, String b, int c) {
        number = a;
        model = b;
        weight = c;
        Phone phone1 = new Phone(a, b);
    }

    public Phone(int a, String b) {
        number = a;
        model = b;
    }

    public Phone() {
    }

    public void receiveCall(String name, int num) {
        System.out.println(name + "\n" + num);
    }

    public void sendMessage(int num1, int num2) {
        System.out.println(num1 + "\n" + num2);
    }
}



