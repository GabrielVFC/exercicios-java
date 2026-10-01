import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Ex 10");
        Scanner sc = new Scanner(System.in);

        System.out.print("Digit the first exam score:");
        double n1 = sc.nextDouble();
        System.out.print("Digit the second exam score: ");
        double n2 = sc.nextDouble();

        double average = ((n1 * 2) + (n2 * 3)) / 5;

        System.out.println("The result is: " + average);
    }
}