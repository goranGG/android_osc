package gg.homework;

import java.util.Scanner;

public class Tenth {
    public static void main(String[] args) {
        char Alphabet[] = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z', ' '};
        String MorseCode[] = {".-", "-...", "-.-.", "-..", ".", "..-.", "--.", "....", "..", ".---", "-.-", ".-..", "--", "-.", "---", ".--.", "--.-", ".-.", "...", "-", "..-", "...-", ".--", "-..-", "-.--", "--..", "|"};

        Scanner input = new Scanner(System.in);
        String englishInput = input.nextLine();

        // read char by char
        for (int i = 0; i < englishInput.length(); i++) {
            char currentLetter = englishInput.charAt(i);

            //search in alphabet and get index
            for (int j=0; j < Alphabet.length; j++)
                if (currentLetter == Alphabet[j]) {
                // print from MorseCode
                    System.out.print(MorseCode[j]+" | ");
                }
        }
    }
}
