import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Ex 8");
        Scanner sc = new Scanner(System.in);

        System.out.print("Digit a number: ");
        double n1 = sc.nextDouble();
        System.out.print("Digit another number: ");
        double n2 = sc.nextDouble();

        double result = n1 % n2;
        System.out.println("The result is: " + result);
    }
}