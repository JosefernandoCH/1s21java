 public class P2p11_1S21{
 	public static void main(String[] args) {
 		for (String cadena : args){
 			char operacion = cadena.charAt(1);
 			switch(operacion){
 			case 'a': System.out.println("Analisis de datos");break;
 			case 'b': System.out.println("Instalacion avanzada");break;
 			case 'h': System.out.println("/a Analisis de datos, /b Instalacion avanzada, /e ejeutara el programa sin ningun elemento");break;
 			case 'e': System.out.println("ejeutara el programa sin ningun elemento");break;
 			} 				
 		}
 	}
 	
 }