import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Ex 6");
        Scanner sc = new Scanner(System.in);

        System.out.println("Digit a number: ");
        double n1 = sc.nextInt();

        double result = Math.pow(n1, 2);

        System.out.println("The result is: " + result);
    }
}