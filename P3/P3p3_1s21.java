public class P3p3_1s21{
	public static void elevacion(int a,int contador){
		System.out.println("el valor es " + a);
		if (!(contador == 5)) elevacion(a*2,contador+1);
	}
	public static void main(String[] args) {
		int valor = 2;
		elevacion(valor,1);
	}
}