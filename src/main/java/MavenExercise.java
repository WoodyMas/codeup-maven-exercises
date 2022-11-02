
import org.apache.commons.lang3.StringUtils;

import java.nio.file.attribute.UserPrincipalNotFoundException;
import java.util.Scanner;


public class MavenExercise {
    static Scanner input = new Scanner(System.in);

    public static String isNumResponse(String input) {
        if (StringUtils.isNumeric(input)) {
            return "is numeric.";
        } else {
            return "is not numeric.";
        }
    }

    public static String inputCaseSwap (String input){
        return StringUtils.swapCase(input);
    }

    public static void main(String[] args) {

        System.out.println("Enter something");
        String userInput = input.nextLine();
        System.out.printf("You Entered: %s%n", userInput);
        System.out.printf("%s %s%n", userInput, isNumResponse(userInput));
        System.out.printf("%s%n", inputCaseSwap(userInput));
        System.out.printf("%s%n", StringUtils.reverse(userInput));
    }
}
