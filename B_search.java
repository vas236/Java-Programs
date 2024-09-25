package Prg;
import java.util.Scanner;

public class B_search {
    public static double Conv(double f) {
       double k = ((5.0 / 9.0) *(f-32)) + 273;
       return k; 
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the temperature in Fahrenheit: ");
        double f = sc.nextDouble();
        double k = Conv(f);
        System.out.printf("%.0f degrees Fahrenheit is %.0f degrees in Kelvin.", f, k);
        sc.close();
    }
}
