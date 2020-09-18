package lesson1;

import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        System.out.println("Введите целое  число: ");
        Scanner scanner = new Scanner(System.in);
        int value = scanner.nextInt();
        if (value > 0) {
            ++value;
        } else if (value < 0) {
            value = value - 2;
        } else if (value == 0) {
            value = 10;
        }
        System.out.println(value);
    }

}
