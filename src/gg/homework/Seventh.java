package gg.homework;

import java.util.ArrayList;
import java.util.Scanner;

public class Seventh {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //insert number of array
        System.out.println("How manny numbers do you want to enter?");
        int numbers = input.nextInt();
        int[] numberArray = new int[numbers];

        //insert array of numbers
        for (int i=0; i<numbers; i++){
            System.out.println("Unesi "+(i+1)+". broj");
            numberArray[i] = input.nextInt();
        }
        // int to string and print
        System.out.println("neparne pozicije arraya su:");
        System.out.println(oddPositions(numberArray));
    }

    private static ArrayList<Integer> oddPositions(int[] originalArray){
        ArrayList<Integer> newArray = new ArrayList<Integer>();
        for (int i = 0; i<originalArray.length; i++){
            if ((i+1)%2 != 0){
                newArray.add(originalArray[i]);
            }
        }
        return newArray;
    }
}
