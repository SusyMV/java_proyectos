import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sn = new Scanner(System.in);

        System.out.println("Introduce un numero");
        int numero = sn.nextInt();

        int cifras = cuentaCifras(numero);

        System.out.println("Numero de cifras: " + cifras);
    }
    public static int cuentaCifras(int num) {

        int contador = 0;

        if (num == 0) {
            contador = 1;
        } else {

            for (int i = Math.abs(num); i > 0; i /= 10) {
                contador++;
            }
        }
        return contador;
    }
}