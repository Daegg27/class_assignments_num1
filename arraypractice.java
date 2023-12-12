import java.util.Random;


public class arraypractice {


    public static void main(String[] args){

        int[] funNumbers = new int[10];

        Random rand = new Random();


        for (int i = 0; i < funNumbers.length; i++){

            funNumbers[i] = rand.nextInt(10) + 1;
            System.out.println("num[" + i + "] is: " + funNumbers[i]);

        }
    }
    
}
