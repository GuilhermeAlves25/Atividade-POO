
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite um numero inteiro entre 1 e 10:\n");
        int numero1 = scanner.nextInt();

        for (int i = 1; i < 11 ; i++) {
            System.out.printf("%d X %d = %d\n", numero1, i, numero1*i);
        }

    }
}