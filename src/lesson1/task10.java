package lesson1;

public class task10 {
    public static void main(String[] args) {
        int[] numbers = {5, 10, 0, -6, -5, 3, 0, -34, 0, 32, 56, 0, 24, -52};
        int j = 0;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] != 0) {
                int temp = numbers[j];
                numbers[j] = numbers[i];
                numbers[i] = temp;
                j++;
            }
            System.out.println(numbers[i]);
        }
    }
}
