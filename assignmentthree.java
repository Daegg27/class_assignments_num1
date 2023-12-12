import java.util.Dictionary;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;

public class assignmentthree {
    public static void main(String[] args){

        double quarters = 9;
        double dimes = 6;
        double nickels = 3;
        double pennies = 7;

        double totalInDollars = 0;

        totalInDollars += quarters * .25;
        totalInDollars += dimes * .10;
        totalInDollars += nickels * .05;
        totalInDollars += pennies * .01;

        System.out.println("The total dollar amount of " + (int)quarters + " quarter(s), " + (int)dimes + " dime(s), " + (int)nickels + " nickle(s), and " + (int)pennies + " pennies is: $" + totalInDollars);
    }
}
