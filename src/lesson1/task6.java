package lesson1;

import java.util.Scanner;

public class task6 {
    public static void main(String[] args) {
        System.out.println("Введите целое число: ");
        Scanner scanner = new Scanner(System.in);
        int value = scanner.nextInt();
        if (value < 0) {
            if (value % 2 == 0)
                System.out.println("Отрицательное четное число.");
            else
                System.out.println("Отрицательное нечетное число.");
        }
        if (value == 0)
            System.out.println("Ноль");
        if (value > 0) {
            if (value % 2 == 0)
                System.out.println("Положительное четное число.");
            else
                System.out.println("Положительное нечетное число.");
        }
    }
}
