import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Ex 5");
        Scanner sc = new Scanner(System.in);

        System.out.print("Digit one number: ");
        int n1 = sc.nextInt();
        System.out.print("Digit another number: ");
        int n2 = sc.nextInt();

        int result = n1 - n2;
        System.out.println("The result is: " + result);
    }
}