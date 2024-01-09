import java.util.Scanner;
public class P3p10_1s21 {
    public static int alcubo(int n) {
        return n * n * n;
    }
    public static int factorial(int numero) {
        int fa = 1;
        for (int i = 1; i <= numero; i++) {
            fa *= i;
        }
        return fa;
    }
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int acumulador = 0;
        System.out.print("Ingresa el valor de N: ");
        int n = teclado.nextInt();
        for (int i = 0; i <= n; i++) {
            acumulador += (alcubo(n) * factorial(i)) / factorial(n);
        }
        System.out.println("El resultado de la operación es: " + acumulador);
    }
}
