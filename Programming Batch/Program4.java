// Q. Write a java program to convert the time given in seconds in to degrees and minutes and seconds.
//    For example, if the input is 3666 seconds, the output should be 1 degree, 1 minute and 6 seconds.

import java.util.Scanner;

public class Program4 {
    public static void main(String[] args) {
        int seconds;
        System.out.println("Enter the time in seconds: ");
        try (Scanner s = new Scanner(System.in)) {
            seconds = s.nextInt();
        }
        convertTime(seconds);
    }

    public static void convertTime(int seconds){
        int degree, min, sec;
        degree = (seconds/3600);
        min = (seconds%3600)/60;
        sec = (seconds%3600)%60;
        System.out.println("Time: "+ degree + " degree, "+ min + " minute," + sec + " seconds");
    }
}
