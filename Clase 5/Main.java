import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		problema7();
		
		
	}
	public static void problema8() {
		
	}
	public static void problema7() {
		
		int numero1 = 120555;
		int length = (int) (Math.log10(numero1) + 1);
		System.out.println(length);
	}
	public static void problema6() {
		System.out.println("Ingrese día de la semana :");
		Scanner myObj = new Scanner(System.in);		
		int numero1 = myObj.nextInt();
		String[] dias = {"","lunes", "martes", "miercoles", "jueves","viernes","sabado","domingo"};
		if(numero1<=0 || numero1>=8) {
			System.out.println("solo 7 dias tenemos");
		}else {
			System.out.println(dias[numero1]);
		}
		
	}
	public static void problema5() {
		System.out.println("Ingrese un numero :");
		Scanner myObj = new Scanner(System.in);		
		int numero1 = myObj.nextInt();
		for (int i = 0; i <= 10; i++) {
			  int mul = numero1 * i;
			  System.out.println(i + "x" + numero1 + "=" + mul);
		}
	}
	public static void problema4() {
		System.out.println("Ingrese una letra :");
		Scanner myObj = new Scanner(System.in);		
		char letra = (myObj.nextLine()).charAt(0);
		if(letra == 'a' || letra=='e' ||letra == 'i' ||letra == 'o' ||letra == 'u' ) {
			System.out.println("es vocal");	
		} else {
			System.out.println("es consonante");	
		}
	}
	public static void problema3() {
		System.out.println("Ingrese un numero :");
		Scanner myObj = new Scanner(System.in);		
		int numero1 = myObj.nextInt();
		if(numero1>0) {
			System.out.println("numero positivo");	
		}else {
			System.out.println("numero negativo");	
		}
	}
	public static void problema2() {
		 Scanner myObj = new Scanner(System.in);		 
		 System.out.println("Ingrese un numero positivo");
		 int numero1 = myObj.nextInt();
		 if(numero1>0) {			
			 if(numero1<=9) {
				System.out.println("tiene un dígito");
			 }
			if(numero1<=99 && numero1>=10 ) {
				System.out.println("tiene dos dígitos");
			}
		 }else {
	     System.out.println("OJO Ingreso un numero negativo");
		 }
	}
	public static void problema1() {
		 Scanner myObj = new Scanner(System.in);		
		 int numero1 = myObj.nextInt();
		 int numero2 = myObj.nextInt();		 
		 if(numero1>numero2) {
			 int suma = numero1+numero2;
			 int resta = numero1-numero2;
			 System.out.println("Resultado de la suma es : " + suma);
			 System.out.println("Resultado de la diferencia es : "+resta);
		 }else {
			 int producto = numero1*numero2;
			 int division = numero1/numero2;
			 System.out.println("Resultado del producto es : " + producto);
			 System.out.println("Resultado de la division es : " + division);
		 }	
	}

}
