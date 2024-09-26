package Prg; //This is a package
import java.util.Scanner; //We import the class scanner
public class Age {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print(" Enter your age: "); //We ask th user for input
        int age = sc.nextInt();
        if(age <10){ //Check if age is less than 10
            System.out.println(" Is this your first program ? ");
        } else if (age < 13){ // Check if age is less than 13
            System.out.println(" A tween! ");
        } else if (age < 20){ // Check if age is less than 20
            System.out.println(" A teen! ");
        } else if (age < 30){ // Check if age is less than 30
            System.out.println(" A twenty something! ");
        } else if (age >= 30){ // Check if age is greater than or equal to 30
            System.out.println(" With age comes experience! ");
        }           

        sc.close(); // We close the scanner
    }
}
