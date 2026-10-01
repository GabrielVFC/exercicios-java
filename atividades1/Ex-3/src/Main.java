import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
       System.out.println("Ex 3");

       Scanner sc = new Scanner(System.in);

       System.out.println("Put one name:");
       String name = sc.nextLine();

       System.out.println("Digit the first number: ");
       double v1 = sc.nextDouble();
       System.out.println("Digit the second number: ");
       double v2 = sc.nextDouble();

       double result = v1 / v2;

       System.out.println("The name is: " + name + " and the result is: " + result);
    }
}