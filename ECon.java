import java.util.Scanner;
public class ECon {
    private static final double c = 299792458;
    public static double EC(double g) {
        double kg = g / 10000.0;
        double E = kg * c * c;
        return E;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print(" Enter the weight in grams: ");
        double  m = sc.nextDouble();
        double E = EC(m);
        System.out.printf(" The energy in joules is %.2e ", E);

        sc.close();
    }
}
