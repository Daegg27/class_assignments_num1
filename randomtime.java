import java.util.Random;
import java.text.DecimalFormat;
import java.text.Format;

public class randomtime {
    
    public static void main(String[] args){

        Random rand = new Random();
        DecimalFormat moneyFormat = new DecimalFormat("#.##");

        int zeroThroughFive = rand.nextInt(6);
        System.out.println(zeroThroughFive);

        int oneThroughFive = rand.nextInt(5) + 1;
        System.out.println(oneThroughFive);

        int tenThrough99 = rand.nextInt(90) + 10;
        System.out.println(tenThrough99);

        double monetaryValue = rand.nextDouble() * rand.nextInt(100);
        System.out.println("$" + moneyFormat.format(monetaryValue));

    }
    
}
