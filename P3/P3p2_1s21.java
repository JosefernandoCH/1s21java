import java.util.Scanner;
public class P3p2_1s21{
	static Scanner teclado= new Scanner(System.in);
	
	public static void main(String[] args) {
		boolean continuar=true;
	while (continuar){
        	menu();
        	String opc=teclado.nextLine().toUpperCase();
        	switch (opc) {
        		
        	
        	case "A": Suma(); break;
        	case "B": Resta(); break;
        	case "C": Multiplicacion(); break;
        	case "D": Division(); break;
        	case "S": System.out.println("Programada terminado.");
        		continuar = false; break;
        	default: System.out.println("Opcion no valida");break;

	}

	teclado.nextLine();
	}

         }

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
        	System.out.println(" S) salir");
        	System.out.println("\n ¿Que opciones deseas?");
        	
        }

        

         }
       
