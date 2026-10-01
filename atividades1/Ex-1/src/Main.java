import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        System.out.println("Ex-1");

        Scanner sc = new Scanner(System.in);

        System.out.print("Digite 5 valores separadamente: ");
        double n1 = sc.nextDouble();
        double n2 = sc.nextDouble();
        double n3 = sc.nextDouble();
        double n4 = sc.nextDouble();
        double n5 = sc.nextDouble();

        double total = (n1 + n2 + n3 + n4) / n5;
        System.out.print("O total deu: " + total);
    }
}