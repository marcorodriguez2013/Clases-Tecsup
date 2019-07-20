import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner leer=new Scanner(System.in);
		System.out.print("Ingresa area de rectangulo");
		int area = leer.nextInt();
		System.out.print("Ingresa altura de rectangulo");
		int altura = leer.nextInt();
		for (int i=0 ; i<altura;i++) {
			for(int i2=0 ; i2<area;i2++) {
				System.out.print('*');
			}
			System.out.println();
		}
	}
	public static int  suma(int a , int b) {
		return a+b;
	}
	public static double  suma(double a , double b) {
		return a-b;
	}
}
