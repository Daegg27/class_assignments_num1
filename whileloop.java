import java.util.Scanner;
import java.util.ArrayList;

public class whileloop {


    public static void main(String[] args){

        Scanner newObj = new Scanner(System.in);
        int startProgram = 0;
        int testScore = 1;
        int totalScores = 0;
        ArrayList <Integer> testScores = new ArrayList<Integer>();


        System.out.print("Are you ready to enter test scores?: Enter '1' for yes and '2' for no. ");
        startProgram = newObj.nextInt();

        if (startProgram == 2){
            System.out.println("No worries! Come back when your ready!");
        }
        else if (startProgram == 1){
            

            while (testScore > 0){
            
                System.out.print("Please enter the first test score: ");
                testScore = newObj.nextInt();
                if (testScore > 0){
                    testScores.add(testScore);
                }
            }
            
            for (int i = 0; i < testScores.size(); i++){
                    totalScores += testScores.get(i);
            }
            System.out.println("The average of all the test scores are: " + (double)totalScores / testScores.size() );

        
        }else{
            System.out.println("Why are you being dificult?");
        }
    }
    
}
