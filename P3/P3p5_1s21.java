import java.util.Scanner;

public class P3p5_1s21{

	public static int promedio(int a, int b, int c){
		return((a+b+c)/3);
	}

	public static int[] captura() {
		Scanner teclado = new Scanner(System.in);
		int[] numeros = new int[10];
		for (int x=0;x<10;x++) {
			System.out.println("Ingresa el valor numero["+(x+1)+"]: ");
		 numeros[x]=teclado.nextInt();
		}
		return numeros;
	}


    public static void main(String[] args) {
	System.out.println("el promedio de 3 numeros es " +promedio(5,7,9));
	int[] arreglo=captura();
	for (int a=0; a<arreglo.length;a++){
		System.out.println("valor en la posicion["+(a+1)+"]: "+arreglo[a]);
	}
    }
}