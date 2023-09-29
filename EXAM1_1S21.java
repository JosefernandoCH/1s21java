public class EXAM1_1S21{
    public static void main(String[] args) {
        int fila = 4;
        int columna = 9;

        for (int i = 0; i < fila; i++) {
            for (int j = 0; j < columna; j++) {
                if (i == 0 || i == fila - 1 || j == 0 || j == columna - 1) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println(); 
        }
    }
}

