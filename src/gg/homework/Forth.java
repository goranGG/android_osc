package gg.homework;

import java.util.Calendar;

public class Forth {
    public static void main(String[] args) {
        // get current year as int
        int year = Calendar.getInstance().get(Calendar.YEAR);

        // calculate leap year - every 4th
        for (int i = 1; i<=20; i++){
            if (year%4 == 0){
                System.out.println(year+" ");
            }
            year++;
        }
    }
}
