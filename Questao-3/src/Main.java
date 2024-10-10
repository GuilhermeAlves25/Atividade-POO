
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int[] vet = new int[5];
        int soma = 0;
        System.out.printf("Digite cinco numeros:%n");
        int multi = scanner.nextInt();
        soma += multi;
        vet[0] = multi;

        for (int i = 1; i < 5; i++) {
            vet[i] = scanner.nextInt();
            soma += vet[i];
            multi *= vet[i];
        }

        System.out.printf("Soma dos numeros digitados: %d%n",soma);
        System.out.printf("Multiplicação dos numeros digitados: %d%n",multi);
        System.out.printf("Numeros digitados: ");
        for (int i = 0; i < 5; i++) {
            System.out.printf("%d ", vet[i]);
        }


    }
}