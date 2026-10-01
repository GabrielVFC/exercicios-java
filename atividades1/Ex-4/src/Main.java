import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Ex 4");
        Scanner sc = new Scanner(System.in);

        System.out.println("Digit a number:");
        int n1 = sc.nextInt();
        System.out.println("Digit another number:");
        int n2 = sc.nextInt();

        int result = n1 + n2;

        System.out.println("The result is: " + result);
    }
}