package u4pp;
import java.util.Scanner;

public class InputHelper {
    Scanner input;

    public InputHelper(Scanner scanner){
        input = scanner;
    }

    public boolean getYesNoInput(String prompt){
        System.out.println(prompt);
        String userInput = input.nextLine().substring(0, 1).toLowerCase();

        while(!(userInput.equals("y")) && !(userInput.equals("n"))) {
            System.out.println("Input is invalid.");
            System.out.println(prompt);
            userInput = input.nextLine().substring(0, 1).toLowerCase();
        }
        if(userInput.equals("y")){
            return true;
        }
        return false;
    }

    public int getIntegerInput(String prompt, int min, int max){
        System.out.println(prompt);
        int userInput = input.nextInt();
        while(userInput < min || userInput > max){
            System.out.println("Input is invalid.");
            System.out.println(prompt);
            userInput = input.nextInt();
        }
        return userInput;
    }
}