public class nestedloops {


    public static void main(String[] args){

        int firstNum = 1;
       

        while (firstNum < 13){
            int secondNum = 1;

            while (secondNum < 13){
                int currentSum = firstNum * secondNum;
                System.out.print(" " + currentSum);
                secondNum++;
            }
            System.out.println("\n");
            firstNum++;
        }

    }
    
}
