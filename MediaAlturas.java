import java.util.ArrayList;
import java.util.Scanner;

public class MediaAlturas {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> numeros = new ArrayList<Integer>();

        System.out.println("Digite números inteiros (digite '0' para terminar):");
        
        while (true) {
            int numero = scanner.nextInt();
            if (numero == 0) {
                break;
            }
            numeros.add(numero);
        }

        if (numeros.isEmpty()) {
            System.out.println("Nenhum número foi digitado.");
        } else {
            double soma = 0;
            for (int numero : numeros) {
                soma += numero;
            }
            double media = soma / numeros.size();
            System.out.println("A média dos números digitados é: " + media);
        }
        scanner.close();
    }
}
