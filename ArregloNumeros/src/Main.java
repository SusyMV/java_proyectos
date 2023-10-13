
public class Main {
    public static void main(String[] args) {
        double [] valores = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        double suma = calcularSuma(valores);
        double promedio = calcularPromedio(valores);

        System.out.println("La suma de los valores del arreglo es: " + suma);
        System.out.println("El promedio de los valores del arreglo es: " + promedio);

    }
    public static double calcularSuma(double[] valores) {
        double suma = 0.0;
        for (int i = 0; i < valores.length; i++) {
            suma += valores[i];
        }
        return suma;
    }
    public static double calcularPromedio(double[] valores) {
        double suma = calcularSuma(valores);
        double promedio = suma / valores.length;
        return promedio;
    }
}
