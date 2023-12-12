import java.util.Scanner;
import java.util.Random;

public class assignmentfive {
    

    public static void main(String[] args){


        Scanner newObj = new Scanner(System.in);
        Random rand = new Random();

        boolean playingGame = false;

        int diceOne = 0;
        int diceTwo = 0;
        int tieGame = 0;

        System.out.print("Would you like to play a game? Enter '1' for yes and '2' for no: ");
        int startProgram = newObj.nextInt();

        if (startProgram == 2){

            System.out.println("\nNo worries! Have a good day!");

        }
        else if (startProgram == 1){

            playingGame = true;
            int counter = 1;

            do {

                int firstDice = rand.nextInt(6) + 1;
                int secondDice = rand.nextInt(6) + 1;
                System.out.println("This is firstDice: " + firstDice);
                System.out.println("This is seconDice: " + secondDice);


                if (firstDice > secondDice){

                    diceOne++;

                }
                else if (secondDice > firstDice){

                    diceTwo++;

                }
                else {

                    tieGame++;

                }
                
                System.out.println("\nTotal Games: " + counter + " || Scoreboard: Dice #1: " + diceOne + " || Dice #2: " + diceTwo + " || Tie Game: " + tieGame);
                counter++;

                System.out.print("\nWould you like to play again? Enter '1' for yes and '2' for no: ");
                int continuePlaying = newObj.nextInt();

                if (continuePlaying != 1){
                    playingGame = false;
                    System.out.println("\nThank you for playing!");
                }



            }
            while(playingGame);
            
        }
        else {

            System.out.println("\nPlease refrain from being difficult in the future!");
        }

    }


}
