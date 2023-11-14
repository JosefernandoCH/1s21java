import java.util.Scanner;
public class P3p1_1S21{
	static Scanner teclado= new Scanner(System.in);
	public static void Suma(){
		System.out.println("Suma de 2 numeros");
		System.out.println("Ingrese el primer numero");
		int a= teclado.nextInt();
		System.out.println("Ingrese el segundo numero");
		int b= teclado.nextInt();
		int c= a+b;
		System.out.println("La suma fue " +c);
        }

        public static void Resta(){
		System.out.println("Resta de 2 numeros");
		System.out.println("Ingrese el primer numero");
		int a= teclado.nextInt();
		System.out.println("Ingrese el segundo numero");
		int b= teclado.nextInt();
		int c= a-b;
		System.out.println("La Resta fue " +c);
        }


        public static void Multiplicacion(){
		System.out.println("Multiplicacion de 2 numeros");
		System.out.println("Ingrese el primer numero");
		int a= teclado.nextInt();
		System.out.println("Ingrese el segundo numero");
		int b= teclado.nextInt();
		int c= a*b;
		System.out.println("La Multiplicacion fue " +c);
        }


        public static void Division(){
		System.out.println(" Division de 2 numeros");
		System.out.println("Ingrese el primer numero");
		int a= teclado.nextInt();
		System.out.println("Ingrese el segundo numero");
		int b= teclado.nextInt();
		int c= a/b;
		System.out.println("La Division fue " +c);
        }

        public static void menu(){
        	System.out.println("Operaciones basicas");
        	System.out.println("\n A)Suma");
        	System.out.println(" B)Resta");
        	System.out.println(" C)Division");
        	System.out.println(" D)Multiplicacion");
        	System.out.println("\n ¿Que opciones deseas?");
        }

        public static void main(String[] args) {
        	menu();
        	String opc=teclado.nextLine();
        	if (opc.equals("A"))Suma();
        	if (opc.equals("B"))Resta();
        	if (opc.equals("C"))Multiplicacion();
        	if (opc.equals("D"))Division();

        }




}