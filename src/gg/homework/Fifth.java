package gg.homework;

import java.util.Scanner;

public class Fifth {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        // input how manny numbers do you want to calculate sum with
        System.out.println("How manny numbers do you want to enter?");
        int numbers = input.nextInt();
        int max = 0;
        int number;

        for (int i = 0; i < numbers; i++) {
            System.out.println("Unesi broj:");
            number = input.nextInt();
            max = getMaxValue(max, number);
        }
        System.out.println("max number is " + max);
    }

    private static int getMaxValue(int currentMax, int newNumber) {
        int max;
        if (newNumber > currentMax)
            max = newNumber;
        else
            max = currentMax;

        return max;
    }
}
