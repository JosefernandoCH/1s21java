import java.util.Scanner;

public class EXAM3_1S21 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

 
        final double PI = 3.1416;

        System.out.print("INGRESE EL RADIO DE LA ESFERA AQUI: ");
        double radio = scanner.nextDouble();

        double volumen = (4.0 / 3.0) * PI * Math.pow(radio, 3);

        System.out.println("SU VALUMEN DE LA ESFERA CON RADIOS ES " + radio + " es: " + volumen);

        scanner.close();
    }
}
