package lesson1;

import java.util.Scanner;


public class phone {

    public static void task7(String[] args) {
        System.out.println("Введите код города: ");
        Scanner scanner = new Scanner(System.in);
        int value = scanner.nextInt();
        int time = 10;
        switch (value) {
            case 905:
                System.out.println("Москва. Стоимость разговора: " + 4.15 * time);
                break;
            case 194:
                System.out.println("Саратов. Стоимость разговора: " + 1.98 * time);
                break;
            case 491:
                System.out.println("Краснодар. Стоимость разговора: " + 2.69 * time);
                break;
            case 800:
                System.out.println("Киров. Стоимость разговора: " + 5 * time);
                break;
            default:
                System.out.println("Город не найден");
        }
    }
}

