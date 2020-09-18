package lesson1;

import java.util.Arrays;

public class Task8 {
    public static void main(String[] args) {
        int[] numbers = {1, -10, 5, 6, 45, 23, -45, -34, 0, 32, 56, -1, 2, -2};
        int max = 0;
        int sum_plus = 0;
        int count_plus = 0;
        int sum_minus = 0;
        int arg = 0;
        int sum_negative = 0;
        int count_minus = 0;
        for (int i = 0; i < numbers.length; i++) {
            if (max < numbers[i])
                max = numbers[i];
            if (numbers[i] > 0) {
                sum_plus = sum_plus + numbers[i];
                count_plus++;
            }
            if ((numbers[i] < 0) && (numbers[i] % 2 == 0)) {
                sum_minus = sum_minus + numbers[i];
            }
            if (numbers[i] < 0) {
                sum_negative = sum_negative + numbers[i];
                count_minus++;
                arg = sum_negative / count_minus;
            }
        }
        System.out.println("Максимальное значение= " + max);
        System.out.println("Сумма положительных элементов= " + sum_plus);
        System.out.println("Сумма четных отрицательных элементов= " + sum_minus);
        System.out.println("Количество положительных элементов= " + count_plus);
        System.out.println("Cреднее арифметическое отрицательных элементов= " + arg);
    }

}
