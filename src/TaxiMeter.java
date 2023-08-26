import java.util.Scanner;
public class TaxiMeter {
    public static void main(String[] args) {
        Scanner take = new Scanner(System.in);
        System.out.println("Please enter the travelled KM: ");
        float f = take.nextFloat();
        float total = (f*2.22f) + 10;
        float price = total >= 20 ? total : 20;
        System.out.println("Price: " + price);
    }
}
