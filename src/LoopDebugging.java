/*
 * The following program should allow the user to input as many things as
 * they want until they stop.
 * Each time it is supposed to repeat with what the user said, can you fix it?
 */

import java.util.Scanner;

public class LoopDebugging {

    public static void main(String[] args) {

        String userInput = "", msg = "";
        int indx;

        Scanner keyboard = new Scanner(System.in);

        // delimeter is "#"
        System.out.println("Enter your message.  Type \'#\' to stop.");

        while (true) {
            userInput = keyboard.nextLine();

            // check if user has typed in "#"
            if (userInput.contains("#")) {
                indx = userInput.indexOf("#");
                msg = msg + userInput.substring(0, indx);
                break;
            }

            /*
             * concatenate message
             *
             * since it is reading a line (upto end_of_line character),
             * need to attach end_of_line character to the message
             */

            msg = msg + userInput + "\n";

        }

        System.out.println("The message is: \n" + msg);
    }
}