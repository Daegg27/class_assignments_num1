// class hello {
    

//     public static void main(String[] args) {
//         System.out.println("\t *");
//         System.out.println("\t  **");
//         System.out.println("\t   ***");
//         System.out.println("\t    ****");
//         System.out.println("\t  *****");
//         System.out.println("\t\b******");
//         System.out.println("\t\b\b*****");
//         System.out.println("\t ****");
//         System.out.println("\t  ***");
//         System.out.println("\t **");
//         System.out.println("\t *");
//         System.out.println("Dalton Eggleston");
//     }
// }

class hello {
    public static void main(String[] args) {
        
        // double a = 12.2;
        // double b = 4.4;

        // double sum;
        // double difference;
        // double product; 


        // sum = a + b;
        // difference = a / b;
        // product = a * b;

        // System.out.println("The sum of " + a + " plus " +  b + " is: " + sum);
        // System.out.println("The difference of " + a + " divided by " +  b + " is: " + difference);
        // System.out.println("The product of " + a + " times " +  b + " is: " + product);

        // System.out.println(19%5);

        // int maris = 26;
        // int max = maris / 2;

        // max += 3;

        // for (int x = 0; x < 3; x++){ Extra credit for double incrementing?????? :D
        //     max++;
        //     System.out.println(max);
        // }

        // System.out.println("Max is going to be " + max + " in three years");


        // float length = 10;
        // float width = 2; 

        // float area;
        // float perimeter;

        // area = length * width;
        // perimeter = 2 * (length + width);

        // System.out.print("A rectangle with a length of " + length + " and a width of " + width + " has an area of " + area + " and a perimeter of " + perimeter + ".");

        // double pi = 3.14;
        // int dozenApples = 12;
        // char charC = 'c';

        // System.out.println("The value of pi is: " + pi);
        // System.out.println("There are " + dozenApples + " number of apples in a dozen.");
        // System.out.println("The third letter of the alphabet is: " + charC);


        // int firstNum = 35;
        // int secondNum = 72;
        // int thirdNum = 96;

        // double average = (double)(firstNum + secondNum + thirdNum) / 3;

        // System.out.println("The average of " + firstNum + ", " + secondNum + ", and " + thirdNum + " is: " + average);

        int[] funNumbers = {21, 42, 16};
        double average = 0;

        for (int i = 0; i < funNumbers.length; i++){ // I heard you didn't want us to use for loops yet :D

            if (i == funNumbers.length - 1){
                average += (double)funNumbers[i];
                average = average / funNumbers.length;
                System.out.println("The average of " + funNumbers[0] + ", " + funNumbers[1] + ", and " + funNumbers[2] + " is: " + average);
            }
            else {
                average += funNumbers[i];
            }
        }
        

       

        

    }
}

   