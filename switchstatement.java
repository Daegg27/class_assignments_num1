import java.util.Scanner;


public class switchstatement {


    public static void main(String[] args){

        Scanner newObj = new Scanner(System.in);
        System.out.print("Please enter your shape: ");
        String input = newObj.nextLine();

        switch (input.toLowerCase()) {

            case "circle":
                System.out.print("Please enter the radius of your circle: ");
                int circleRadius = newObj.nextInt();
                double circleArea =  (circleRadius * circleRadius) * Math.PI;
                System.out.println("The area of your circle is: " + circleArea);
                break;
            case "square": 
                System.out.print("Please enter the length of one side of your square: ");
                int squareSide = newObj.nextInt();
                double squareArea = squareSide * squareSide;
                System.out.println("The area of your square is: " + squareArea);
                break;
        }
    }
    
}
