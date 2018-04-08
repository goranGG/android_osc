package gg.homework;

import java.util.Arrays;
import java.util.Scanner;

public class Eighth {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Koliko elemenata ima niz:");

        int number = input.nextInt();

        System.out.println(Arrays.toString(createArray(number)));

    }

    private static int[] createArray(int numberOfElements){
        int[] array = new int[numberOfElements];
        for (int i=0; i<numberOfElements;i++){
            array[i] = i;
        }
        return array;
    }
}
