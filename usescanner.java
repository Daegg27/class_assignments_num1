import java.util.Scanner;

public class usescanner {


    public static void main(String[] args){

        Scanner newObj = new Scanner(System.in);
        System.out.print("Enter your name: ");
        String userName = newObj.nextLine();
        System.out.print("Enter the first initial of your last name: ");
        char lastInitial = newObj.next().charAt(0);
        System.out.print("Please enter your age: ");
        int yourAge = newObj.nextInt();
        System.out.print("Please enter how much money you have in your wallet: ");
        double yourMoney = newObj.nextDouble();
        System.out.println("My name is: " + userName);
        System.out.println("My last initial is: " + lastInitial);
        System.out.println("My age is: " + yourAge);
        System.out.println("The amount of money I have is : $" + yourMoney);
    
    }
    
}
