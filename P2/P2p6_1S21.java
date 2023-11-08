import java.util.Scanner;
public class P2p6_1S21{
	public static void main(String[] args) {
        Scanner teclado =new Scanner(System.in);
       char  opc;
		int a=1;
		do{
			System.out.println("aqui nos repetimos");
			a++;

		}while(a<10);

		a=10;
		do{
			System.out.println("acaso se ejecutara esta linea");

		}while(a<10);


		do{
			System.out.println("Presiona s para salir: ");
			opc = teclado.next().charAt(0);
			if(opc=='S'){
				break;
			}

		}while(opc !='s');

		
	}
}