package gg.homework;

import java.util.Scanner;

public class Second {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // input how manny numbers do you want to calculate sum with
        System.out.println("How manny numbers do you want to enter?");
        int numbers = input.nextInt();

        int total;
        int[] numberArray = new int[numbers];

        //insert array of numbers
        for (int i=0; i<numbers; i++){
            System.out.println("Unesi "+i+". broj");
            numberArray[i] = input.nextInt();
        }

        System.out.println("koju operaiju zelite napraviti 1.zbrajanje 2. mnozenje");
        int operation = input.nextInt();
        if (operation == 1){
            total = 0;
        }
        else {
            total = 1;
        }

        for (int i=0; i<numberArray.length; i++){
            switch (operation){
                case 1:
                    total = total + numberArray[i];
                    break;
                case 2:
                    total = total * numberArray[i];
                    break;
            }
        }
        System.out.println("rezultat je "+total);
    }
}
