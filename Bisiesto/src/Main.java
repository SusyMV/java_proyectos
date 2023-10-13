import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int año;
        System.out.print("Introduzca el año: ");
        año = sc.nextInt();

        if (año % 4 == 0 && año % 100 != 0 || año % 400 == 0) {
            System.out.println("Es un año Bisiesto");
        } else {
            System.out.println("No es un año Bisiesto");
        }
    }
}