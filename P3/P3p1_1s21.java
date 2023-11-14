import java.util.Scanner;

public class P3p1_1s21{
	static Scanner teclado = new Scanner(System.in);
	public static void main(String[] args){
		System.out.println("Suma de 2 numeros");
		System.out.println("ingrese el 1 numero");
		int a = teclado.nextInt();
		System.out.println("ingrese el 2 numero");
		int b = teclado.nextInt();
		int c = a+b;
		System.out.println("la suma fue: " + c);
	}
}