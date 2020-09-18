package lesson1;

import java.util.Scanner;

public class Task6 {
    static String chek1(int value) {
        String result = "";
        if (value % 2 != 0) {
            result = "нечетное";
        } else if (value == 0) {
            result = "";
        } else if (value % 2 == 0) {
            result = "четное";
        }
        return result;
    }

    static String check2(int value) {
        String result = "";
        if (value > 0) {
            result = "положительное";
        } else if (value < 0) {
            result = "отрицательное";
        } else if (value == 0) {
            result = "нулевое";
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println("Введите целое число: ");
        Scanner scanner = new Scanner(System.in);
        if (scanner.hasNextInt()) {
            int value = scanner.nextInt();
            System.out.println(value + " - это " + chek1(value) + " " + check2(value) + " число");
        } else {
            System.out.println("Вы ввели не целое число");
        }
    }
}

