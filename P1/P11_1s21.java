import java.util.Scanner;

public class p11_1S21{
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		System.out.println("Que tipo de operacion desea realizar");
		System.out.println("Suma,Resta,Multiplicacion,Division,Raiz,Potencia");
	    String operacion;
	    operacion=teclado.nextLine();
	    switch(operacion){
	    	case "Suma":
	    		System.out.println("Haremos una suma");
	    		Scanner input = new Scanner(System.in);
	    		int a,b,c;
	    		System.out.println("Ingresa dos valores: ");
	    		a = input.nextInt();
	    		b = input.nextInt();
	    		c = a + b;
	    		System.out.println("La suma de los 2 numeros es:" +c);
	    		break;


	    	case "Resta":
	    		System.out.println("Haremos una Resta");
	    		Scanner ra = new Scanner(System.in);
	    		float ra1,ra2,ra3;
	    		System.out.println("Ingresa dos valores");
	    		ra1 = ra.nextFloat();
	    		ra2 = ra.nextFloat();
	    		ra3 = ra1 - ra2;
	    		System.out.println("La Resta de los 2 numeros es: " +ra3);
	    		break;

	    	case "Multiplicacion":
	    		System.out.println("Haremos una Multiplicacion");
	    		Scanner mo = new Scanner(System.in);
	    		float mo1,mo2,mo3;
	    		System.out.println("Ingresa dos valores");
	    		mo1 = mo.nextFloat();
	    		mo2 = mo.nextFloat();
	    		mo3 = mo1 * mo2;
	    		System.out.println("La Multiplicacion de los 2 numeros es: " +mo3);
	    		break;

	    	case "Division":
	    		System.out.println("Haremos una Division");
	    		Scanner di = new Scanner(System.in);
	    		float di1,di2,di3;
	    		System.out.println("Ingresa dos valores");
	    		di1 = di.nextFloat();
	    		di2 = di.nextFloat();
	    		di3 = di1 / di2;
	    		System.out.println("La Division de los 2 numeros es: " +di3);
	    		break;


	    	case "Potencia":
	    		System.out.println("Haremos una potencia");
	    		Scanner po = new Scanner(System.in);
	    		float base,potencia;
	    		System.out.println("Dime la base");
	    		base = po.nextFloat();
	    		System.out.println("Dime la potencia");
	    		potencia = po.nextFloat();
	    		System.out.println("La Potencia de los 2 numeros es: " +Math.pow(base,potencia));
	    		break;

	    	case "Raiz":
	    		System.out.println("Haremos una raiz");
	    		Scanner rz = new Scanner(System.in);
	    		float numero, raiz;
	    		System.out.println("Dime el numero al que deseas obetenerle raiz");
	    	    numero = rz.nextFloat();
	    	    System.out.println("La raiz cuadrada de es " + Math.sqrt(numero));
	    	    break;






	    }

	}

}