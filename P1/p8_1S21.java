import java.util.Scanner;
public class p8_1S21{
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		byte edad;
		System.out.println("ingrese su edad: ");
		edad = teclado.nextByte();

		if(edad >= 18){
			System.out.println("Eres mayor de edad...");
		}
	}		
}	