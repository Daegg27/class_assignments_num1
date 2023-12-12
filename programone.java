import java.util.Scanner;
import java.text.DecimalFormat;
import java.text.Format;
import java.text.NumberFormat;
import java.util.Random;

public class programone {


    public static void main(String[] args){

        NumberFormat currencyFormatter = NumberFormat.getCurrencyInstance();
        Scanner newObj = new Scanner(System.in);
        Random rand = new Random();
        int $10 = 0;
        int $5 = 0;
        int $1 = 0;
        int quarters = 0;
        int dimes = 0;
        int nickels = 0;
        int pennies = 0;
       

        double moneyInAccount = rand.nextInt(500) + (rand.nextDouble() + 0.01);
        System.out.print("Hello, what is your name? ");
        String name = newObj.nextLine();
        System.out.println("Hello " + name + "! You have " + currencyFormatter.format(moneyInAccount) + " in your bank account");

        double workableNum = Math.round(moneyInAccount * 100.0) / 100.0;

        $10 = (int) workableNum / 10; // What a perfect time to use a while loop this would be 
        workableNum = workableNum - ($10 * 10);
        workableNum = Math.round(workableNum * 100.0) / 100.0; // Fixes odd rounding issues
        $5 = (int) workableNum / 5;
        workableNum = workableNum - ($5 * 5);
        workableNum = Math.round(workableNum * 100.0) / 100.0;
        $1 = (int) workableNum / 1;
        workableNum = workableNum - ($1 * 1);
        workableNum = Math.round(workableNum * 100.0) / 100.0;
        quarters = (int) (workableNum / 0.25);
        workableNum = workableNum - (quarters * .25);
        workableNum = Math.round(workableNum * 100.0) / 100.0;
        dimes = (int) (workableNum / .10);
        workableNum = workableNum - (dimes * .10);
        workableNum = Math.round(workableNum * 100.0) / 100.0;
        nickels = (int) (workableNum / .05);
        workableNum = workableNum - (nickels * .05);
        workableNum = Math.round(workableNum * 100.0) / 100.0;
        pennies = (int) (workableNum / 0.01);
        workableNum = workableNum - (pennies * .01);
        workableNum = Math.round(workableNum * 100.0) / 100.0;

        System.out.println("$10: " + $10);
        System.out.println("$5: " + $5);
        System.out.println("$1: " + $1);
        System.out.println("Quarters: " + quarters);
        System.out.println("Dimes: " + dimes);
        System.out.println("Nickels: " + nickels);
        System.out.println("Pennies: " + pennies);

    }
    
}
