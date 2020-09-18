package lesson1;

import java.util.Scanner;


public class Task2 {
    public static void main(String[] args) {
        System.out.println("Введите целое трехзначное число: ");
        Scanner sc = new Scanner(System.in);
        String c = sc.nextLine();
        int sum = 0;
        for (int i = 0; i < c.length(); i++) {
            if (c.charAt(i) != ',')
                sum += Integer.parseInt(Character.toString(c.charAt(i)));
        }
        System.out.println("sum = " + sum);
    }

}

