import java.util.Scanner;

public class EXAM7_1S21 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("INGRESA EL VALOR DE A: ");
        double a = input.nextDouble();
        System.out.print("INGRESA EL VALOR DE B: ");
        double b = input.nextDouble();
        System.out.print("INGRESA EL VALOR DE C: ");
        double c = input.nextDouble();
        System.out.print("INGRESE EL VALOR DE D: ");
        double d = input.nextDouble();
        System.out.print("INGRESE EL VALOR DE E: ");
        double e = input.nextDouble();
        System.out.print("INGRESE EL VALOR DE F: ");
        double f = input.nextDouble();
        double divisor = a * e - b * d;

        if (divisor == 0) {
            System.out.println("SU SISTEMA DE ECUACIONES NO TIENE SOLUCION, YA QUE EL DIVISOR ES IGUAL A CERO.");
        } else {
      
            double x = (c * e - b * f) / divisor;
            double y = (a * f - c * d) / divisor;

            System.out.println("SU SOLUICION DEL SISTEMA DE ECUACIONES ES:");
            System.out.println("x = " + x);
            System.out.println("y = " + y);
        }

        input.close();
    }
}
