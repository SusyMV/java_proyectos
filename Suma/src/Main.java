import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner miScanner = new Scanner(System.in);
        int numero;
        int resultado = 0;

        System.out.print("Introduce un número para sumar sus dígitos: ");
        numero = miScanner.nextInt();

        while(numero > 0) {

            resultado += numero % 10;

            numero = numero / 10;

        }
        System.out.println("La suma es: " + resultado);

    }
}