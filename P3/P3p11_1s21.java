import java.util.Scanner;
public class P3p11_1s21 {
    public static int factorial(int numero) {
        int fa = 1;
        for (int i = 1; i <= numero; i++) {
            fa *= i;
        }
        return numero*factorial(numero - 1);
    }
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int acumulador = 0;
        System.out.print("Ingresa el valor de N: ");
        int n = teclado.nextInt();
        for (int k = 0; k <= n; k++) {
            acumulador += factorial(n) / factorial(k) * factorial(n - k);
        }
        System.out.println("El resultado de la operación es: " + acumulador);
    }
}