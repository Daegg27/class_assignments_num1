import java.util.Scanner;


public class colorcar {


    public static void main(String[] args){

        Scanner newObj = new Scanner(System.in);

        System.out.print("Would you like a red or blue car? ");
        String userInput = newObj.nextLine();
        
        if (userInput.toLowerCase().equals("red")){
            System.out.print("Would you like a scarlett or maroon red colored car? ");
            userInput = newObj.nextLine();
            if (userInput.toLowerCase().equals("scarlett")){
                System.out.println("You chose a scarlett red colored car!");
            }
            else if (userInput.toLowerCase().equals("maroon")){
                System.out.println("You chose a maroon red colored car!");
            }
            else {
                System.out.println("You did not enter one of the two options.");
            }
        }
        else if (userInput.toLowerCase().equals("blue")){
            System.out.print("Would you like a baby or royal blue colored car? ");
            userInput = newObj.nextLine();
            if (userInput.toLowerCase().equals("baby")){
                System.out.println("You chose a baby blue colored car!");
            }
            else if (userInput.toLowerCase().equals("royal")){
                System.out.println("You chose a royal blue colored car!");
            }
            else {
                System.out.println("You did not enter one of the two options.");
            }
        }
        else {
            System.out.println("Ok! Thank you.");
        }
        

    }
    
}
