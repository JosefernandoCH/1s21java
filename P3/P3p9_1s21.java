import java.util.Scanner;

public class P3p9_1s21{
	static int x;
	public static void f(int a, int b) {
		int c = a + b;
		if (c<x) {
			System.out.println(""+c);
			f(b,c);
		}
	}
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		System.out.println("Ingrse el  limite");
		x = teclado.nextInt();
		int a = 0;
		int b = 1;
		f(a,b);
	}
}