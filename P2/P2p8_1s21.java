import java.util.Scanner;


public class P2p8_1s21{
	public static void main(String[] args) {
		int[] a = new int[10];
		int[] calif = new int[10];
		Scanner teclado=new Scanner(System.in);
		int promedio;
		a[0]=1;
		a[1]=2;
		a[2]=3;
		a[3]=4;
		a[4]=5;
		a[5]=6;
		a[6]=7;
		a[7]=8;
		a[8]=9;
		a[9]=10;

		System.out.println("valor en la posicion 5: " + a[4]);
		for (int i=0; i<10; i++){
			System.out.println(" el valor en la posicion " + i + " es de: " +a[i]);
		}

		for(int c=0; c<10;c++){
			System.out.println("Ingresela calificion # " +(c+1)+": ");
			calif[c] = teclado.nextInt();

		}
		promedio=0;
		for (int s=0;s<10;s++){
			promedio+=calif[s];

		}
		promedio=promedio/10;
		System.out.println("El promedio de las calificaciones es: " + promedio);

	}
}