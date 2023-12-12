import java.util.Random;
import java.text.DecimalFormat;
import java.text.NumberFormat;

public class randomNumber {
    
    public static void main(String[] args){

        double initialValue = 64;
        double endValue = Math.sqrt(initialValue);

        System.out.println((int)endValue + " is the square root of " + (int) initialValue);

        DecimalFormat dec = new DecimalFormat("#.###");
        System.out.println(dec.format(3.14522));


    }


}
