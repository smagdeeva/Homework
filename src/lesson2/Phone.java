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

    public Phone(int number, String model, int weight) {
        this.number = number;
        this.model = model;
        this.weight = weight;
        Phone phone1 = new Phone(number, model);
    }

    public Phone(int number, String model) {
        this.number = number;
        this.model = model;
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



