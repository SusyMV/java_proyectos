import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int numero;
        Scanner teclado = new Scanner( System.in );

        System.out.println( "Introduzca un número entero: " );
        numero = teclado.nextInt();

        if ( numero % 2 == 0 )
        {
            System.out.println( "ES PAR" );
        }
        else
        {
            System.out.println( "ES IMPAR" );
        }

    }
}