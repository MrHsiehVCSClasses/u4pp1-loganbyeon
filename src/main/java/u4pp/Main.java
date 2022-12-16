package u4pp;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        // test for isLeapYear
        // int year = input.nextInt();
        // System.out.println(LeapYear.isLeapYear(year));

        InputHelper h = new InputHelper(input);
        // test for getYesNoInput
        // System.out.println(h.getYesNoInput("yes or no?"));
        
        // test for getIntegerInput
        System.out.println(h.getIntegerInput("yes or no?", 0, 5));
    }
}
