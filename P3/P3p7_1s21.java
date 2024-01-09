import java.util.Scanner;

public class P3p7_1s21{

	public static int alcubo(int n){
		int o=3;
		for (int a=0;a<n;a++) {
		double resultado = Math.pow(a+1,o);
		System.out.println(resultado);
	    }
	    return n;
	}

	public static int factorial(int n){
		int fac = 1;
		for (int i=0;i<n;i++) {
			fac*= i+1;
			System.out.println(fac);
		}
		return n;
	}


	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		System.out.println("ingrese el valor de n");
		int n=teclado.nextInt();
		double acomulador = 1;
		int a = alcubo(n);
		int f = factorial(n);
		for(int i=0;i<n;i++){
		    acomulador+=a/f;
            System.out.println(acomulador);
	    }
	     
	}
}