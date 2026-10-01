import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Ex 7");
        Scanner sc = new Scanner(System.in);

        System.out.print("Digit a number: ");
        int n1 = sc.nextInt();

        int successor = n1 + 1;
        int predecessor = n1 - 1;

        System.out.println("The successor of the number " + n1 + " is: " + successor);
        System.out.println("The predecessor of the number " + n1 + " is: " + predecessor);
    }
}