import java.util.Scanner;

public class EXAM4_1S21 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("INGRESAR EL RADIO DEL CIRCULO: ");
        double radio = input.nextDouble();

        double area = Math.PI * Math.pow(radio, 2);
        double longitudCircunferencia = 2 * Math.PI * radio;

        System.out.println("SU AREA DEL CIRCULO ES: " + area);
        System.out.println("LA LONGITUD DE LA CIRCUNFERENCIA ES: " + longitudCircunferencia);

        input.close();
    }
}
