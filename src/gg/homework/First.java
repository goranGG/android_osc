package gg.homework;

import java.util.Scanner;

public class First {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // input how manny numbers do you want to calculate sum with
        System.out.println("How manny numbers do you want to enter?");
        int numbers = input.nextInt();

        int total = 0;
        int newNumber;
        // calculate
        for (int i=1; i<=numbers; i++){
            System.out.println("Unesi "+i+". broj");
            newNumber = input.nextInt();
            total = total + newNumber;
        }
        System.out.println("Zbroj je "+total);
    }
}
