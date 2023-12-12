import java.util.Random;
import java.util.Scanner;


public class dowhileloop {
    public static void main(String[] args){

        Random rand = new Random();
        Scanner newObj = new Scanner(System.in);
        int startProgram = 0;
        int continuePlaying = 0;
        int gameCounter = 0;

        boolean playingGame = false;
        
        System.out.print("Would you like to play some slots? Enter '1' for yes and '2' for no. ");
        startProgram = newObj.nextInt();

        if (startProgram == 2)
        {
            System.out.println("\nNo worries! Come back when you're ready to play!");
        }
        else if (startProgram == 1)
        {

            playingGame = true;

            do {

            int firstSlot = rand.nextInt(10);
            int secondSlot = rand.nextInt(10);
            int thirdSlot = rand.nextInt(10);
            gameCounter++;
            
            System.out.println("\n(Game #" + gameCounter + ") The first slot is " + firstSlot + ", the second slot is " + secondSlot + ", and the third slot is " + thirdSlot);

            if (firstSlot == secondSlot && firstSlot == thirdSlot)
            {
                System.out.println("\nJACKPOT!!! Big winner over here!\n");
            }else if (firstSlot == secondSlot || firstSlot == thirdSlot || secondSlot == thirdSlot){
                System.out.println("\nAlmost! Two of the three are matching.");
            }

            System.out.print("\nWould you like to play again? Enter '1' for yes and '2' for no. ");
            continuePlaying = newObj.nextInt();
            if (continuePlaying != 1){
                playingGame = false;
            }

        }
        while (playingGame);
        
        System.out.println("\nThank you for playing!");
    
    }
    else{
        System.out.println("Why are you being dificult?");
    }

    }
    
}
