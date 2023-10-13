import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Ingresa un numero ");
        int A = sc.nextInt();
        System.out.println("Ingresa otro numero ");
        int B = sc.nextInt();
        System.out.println("Ingresa un numero ");
        int C = sc.nextInt();
        if(A < B && A < C){
            System.out.println("El numero menor es " + A);
        }else{
            if(B < A && B < C){
                System.out.println("El numero menor es " + B);
            }else{
                System.out.println("El numero menor es " + C);
            }
        }
    }
}