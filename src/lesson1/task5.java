package lesson1;

import java.util.Scanner;

public class task5 {
    public static void main(String[] args) {
        System.out.println("Введите три числа");
        Scanner sc = new Scanner(System.in);
        int[] numbers = new int[3];
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = sc.nextInt();
        }
        System.out.println(numbers[0]);
    }
}

