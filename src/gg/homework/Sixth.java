package gg.homework;

import java.util.Arrays;
import java.util.Scanner;

public class Sixth {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //insert number of array
        System.out.println("How manny numbers do you want to enter?");
        int numbers = input.nextInt();

        int[] numberArray = new int[numbers];
        int[] reverseArray = new int[numbers];

        //insert array of numbers
        for (int i=0; i<numbers; i++){
            System.out.println("Unesi "+(i+1)+". broj");
            numberArray[i] = input.nextInt();
        }
        System.out.println(Arrays.toString(numberArray));
        reverseArray = reverseArray(numberArray);
        System.out.println(Arrays.toString(reverseArray));

    }

    private static int[] reverseArray(int[] originalArray){
        int[] rev = new int[originalArray.length];
        int length = originalArray.length;
        // reverse array
        for (int i = 0; i<originalArray.length;i++){
            rev[i] = originalArray[(length-i-1)];
        }
        return rev;
    }
}
