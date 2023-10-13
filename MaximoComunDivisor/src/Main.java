
public class Main {
    public static void main(String[] args) {
        int a = 3;
        int b = 9;


        int mcd = maximoComunDivisor(a, b);
        System.out.printf("El MCD de %d y %d es %d\n", a, b, mcd);
    }

    public static int maximoComunDivisor(int a, int b) {
        int temporal;//Para no perder b
        while (b != 0) {
            temporal = b;
            b = a % b;
            a = temporal;
        }
        return a;
    }
}
