import java.util.Scanner;
public class StringConcat {
    public static String Concat( String s1, Object s2, Object s3) {
        String s = s1 + s2 + s3;
        return s;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println(" Enter first string: ");
        String s1 = sc.nextLine();
        System.out.println(" Enter a parameter (int): ");
        int s2 = sc.nextInt();
        System.out.println(" Enter a parameter (float): ");
        double s3 = sc.nextDouble();
        String s = Concat(s1, s2, s3);
        System.out.println("Resultant String "+s);
        sc.close();
    }
}
