public class P2p2_1S21{
	public static void main(String[] args) {
		int val=2;
		switch(val){
		case 1: System.out.println("se evalua 1"); break;
		case 2: System.out.println("se evalua 2"); break;
		case 3: System.out.println("se evalua 3"); break;
		case 4: System.out.println("se evalua 4"); break;
		case 5: System.out.println("se evalua 5"); break;
		default: System.out.println("valor fuera del rango");
		}

		Character opc='a';
		switch(opc){
		case 'a': System.out.println("se evalua A");
		case 'b': System.out.println("se evalua B");
		case 'c': System.out.println("se evalua C");
		case 'd': System.out.println("se evalua D");
		case 'e': System.out.println("se evalua E");
		case 'f': System.out.println("se evalua F");
		default: System.out.println("Opcion no existe");
		}

		String cadena = "uno";
		switch (cadena) {
			case "uno":System.out.println("uno");
			case "dos":System.out.println("dos");
			case "tres":System.out.println("tres");
			case "cuatro":System.out.println("cuatro");
			default: System.out.println("no existe la opcion");	
		}
	}
}			
			