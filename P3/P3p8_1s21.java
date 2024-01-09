import java.util.Scanner;

public class P3p8_1s21{

	public static void funcion1(int c, int b){
		int d = c + b;
		System.out.println(d);
	}

	public static void funcion(int a, int b){
		int c = a + b;
		System.out.println(c);
		funcion1(c,b);
	}

	public static void main(String[] args) {
		Scanner teclado =  new Scanner(System.in);
		int a = teclado.nextInt();
		int b = teclado.nextInt();
		funcion(a,b);
	}
}