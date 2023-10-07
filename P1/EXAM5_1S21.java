import java.util.Scanner;
import java.lang.Math;
public class EXAM5_1S21{
	public static void main(String[] args) {
		java.util.Scanner teclado = new Scanner(System.in);
		System.out.println("CALCULE EL AREA DEL TRIANGULO");
		System.out.println("   *");
		System.out.println("   * *");
		System.out.println(" a *   * b");
		System.out.println("   *  s *");
		System.out.println("   *      *");
		System.out.println("   * * * * * *");

		System.out.println("         c");
		int a;
		int b;
		int c;
		int d;
		int area;
		double resultado;
		System.out.println("INTRODUSCA EL VALOR DE A :");
		a = teclado.nextInt();
		System.out.println("INTRODUSCA EL VALOR DE B :");
		b = teclado.nextInt();
		System.out.println("INTRODUSCA EL VALOR DE C :");
		c = teclado.nextInt();
		d = (a+b+c)/2;
		area = d*(d-a)*(d-b)*(d-c);
		resultado = Math.sqrt(area);
		System.out.println("SU AREA DEL TRIANGULO ES: " + resultado);

	}
}