import java.util.Scanner;

public class EXAM2_1S21{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        
        final double PI = 3.1416;

        System.out.print("INGRESE SU VALOR AQUI: ");
        double grados = scanner.nextDouble();

        double radianes = grados * (PI / 180);

        System.out.println(grados + " LOS GRADOS EQUIVALEN A " + radianes + " radianes.");

        scanner.close();
    }
}
