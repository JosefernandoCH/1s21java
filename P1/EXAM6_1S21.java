import java.util.Scanner;
import java.lang.Math;
public class EXAM6_1S21{
	public static void main(String[] args) {
		java.util.Scanner teclado = new Scanner(System.in);
		int x;
		int y;
		int a;
		int b;
		int c;
		int resultado;
		double distancia;
		double raizAB;
		System.out.println("CALCULE EL VALOR DE LAS DISTANCIAS ENTRE 2 PUNTOS ");
		System.out.println("INTRODUCE LAS CORDENADAS DEL PUNTO X: ");
		x = teclado.nextInt();
		System.out.println("INTRODUCE LAS CORDENADAS DEL PUNTO Y: ");
		y = teclado.nextInt();
		System.out.println("INTRODUCE EL VALOR A: ");
		a = teclado.nextInt();
		System.out.println("INTRODUCE EL VALOR B: ");
		b = teclado.nextInt();
		System.out.println("INTRODUSCA EL VALOR C: ");
		c = teclado.nextInt();
		resultado = Math.abs(a*x + b*y + c);
		raizAB = Math.sqrt(Math.pow(a,2) + Math.pow(b,2));
		System.out.println("SU VALOR DE LA DISTANCIA ES: " + resultado);
	}
}