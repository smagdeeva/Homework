package lesson1;

import java.util.Arrays;

public class task9 {
    public static void main(String[] args) {
        int[] numbers = {5, 10, 51, -6, -5, 3, -10, -34, 0, 32, 56, -12, 24, -52};
        int n = numbers.length;
        int temp;
        for (int i = 0; i < n / 2; i++) {
            temp = numbers[n - i - 1];
            numbers[n - i - 1] = numbers[i];
            numbers[i] = temp;
        }
        System.out.println(Arrays.toString(numbers));
    }
}

