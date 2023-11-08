 public class P2p12_1S21 {
    public static void main(String[] args) {
        if (args.length == 0) {
            System.out.println("Estamos ejecutando el programa de forma correcta");
        } else {
            for (String cadena : args) {
                char operacion = cadena.charAt(1);
                boolean a = false;
                boolean b = false;
                boolean h = false;
                boolean e = false;

                if (operacion == 'a') {
                    a = true;
                    System.out.println("Analisis de datos");
                } else if (operacion == 'b') {
                    b = true;
                    System.out.println("Instalacion avanzada");
                } else if (operacion == 'h') {
                    h = true;
                    System.out.println(" a Analisis de datos, b Instalacion avanzada, e ejeutara el programa sin ningun elemento ");
                } else if (operacion == 'e') {
                    e = true;
                    System.out.println("ejeutara el programa sin ningun elemento");
                } else {
                    System.out.println("Estamos ejecutando el programa de forma correcta");
                }
            }
        }
    }
}