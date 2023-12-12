import java.text.DecimalFormat;
import java.text.Format;
import java.text.NumberFormat;



public class formatpractice {

    public static void main(String[] args){


        DecimalFormat piTime = new DecimalFormat("#.####");
        NumberFormat currencyFormatter = NumberFormat.getCurrencyInstance();
        NumberFormat percentFormatter = NumberFormat.getPercentInstance();

        double pi = 3.14159;
        double randomNum = 32.76;

        System.out.println(piTime.format(pi));
        System.out.println(currencyFormatter.format(randomNum));
        System.out.println(percentFormatter.format(randomNum));
    }
    
}
