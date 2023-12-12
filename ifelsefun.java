import java.util.Scanner;

public class ifelsefun {

    public static void main(String[] args){

        Scanner newObj = new Scanner(System.in);

        System.out.print("Would you like a red car?: ");
        String userInput = newObj.nextLine();

        if (userInput.toLowerCase().equals("yes")){

            /*  if (userInput.toLowercase() == "yes") was returning false. Stack overflow says it has to do with '==' checking for object
            reference in java. Assuming it's a java thing to not use '==' for comparing strings.
            */

            System.out.println("Too bad buddy! Life sucks!");
        }
        else if (userInput.toLowerCase().equals("no")){

            System.out.println("You weren't getting one anyways!");
        }
        else {

            System.out.println("Please answer the question with a 'yes' or 'no'");
        }
    }
    
}
