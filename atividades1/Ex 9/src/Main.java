import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Ex 9");
        Scanner sc = new Scanner(System.in);

        System.out.print("Digit a number: ");
        double n1 = sc.nextDouble();

        double doubleN1 = Math.pow(n1, 2);
        double tripleN1 = Math.pow(n1, 3);

        System.out.println("The double of the number " + n1 + " is: " + doubleN1);
        System.out.println("The triple of the number " + n1 + " is: " + tripleN1);
    }
}