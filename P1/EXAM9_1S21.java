import java.util.Scanner;

public class EXAM9_1S21 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("INGRESAR EL VALOR DE LA RESISTENCIA (0 - 1000 Ω): ");
        double resistencia = input.nextDouble();
        System.out.print("INGRESAR EL VALOR DE LA INTENSIDAD: ");
        double intensidad = input.nextDouble();

        if (resistencia < 0) {
            System.out.println("ERROR: EL VALOR DE LA RESISTENCIA NO PUEDE SER NEGATIVO.");
        } else if (resistencia > 1000) {
            System.out.println("ERROR: SU VALOR DE LA RESISTENCIA ES MAYOR QUE 1000 Ω.");
        } else {
            double caidaPotencial = intensidad * resistencia;
            
            System.out.println("SU CAIDA DE POTENCIAL ES: " + caidaPotencial + " V");
        }

        input.close();
    }
}
