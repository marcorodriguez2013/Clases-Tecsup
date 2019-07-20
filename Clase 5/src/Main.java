import java.util.Scanner;
import javax.swing.JOptionPane;


public class Main {

	public static void main(String[] args) {
		fibo();                   
		
	}
	public static void fibo() {
		

	}
	public static void sumaenteros() {
		int numero=253;
		int respuesta = 0;
		while(numero >0 ) {
			int unidades = numero%10;
			numero= numero/10;
			respuesta+=unidades;
		}
		
		
		
	}
	public static void factorial_suma() {
		int numero=1;
		int numero_fin =10;
		long resultado=1;
		for (int i = numero; i <= numero_fin; i++) {			
		for (int ii = 1; ii <= numero; ii++) {
			resultado = resultado * i;
		}
		System.out.println(resultado);
		}	
		 
	}
	public static void factorial() {
		int numero=10;
		long resultado=1;
		for (int i = 1; i <= numero; i++) {
			resultado = resultado * i;
			System.out.println(resultado);
		}
		
	}
	public static void abecedario() {		
		for (char i = 'a'; i <= 'z'; i++) {
		System.out.print(i);
		}
	}
	public static void ejercicio5() {
		int dia = Entrada.entero();
		int mes = Entrada.entero();
		int anio = Entrada.entero();
		
		int dias = dia;
		switch(mes) {
		case 12:
			dias = dias +30;
		case 11:
			dias = dias +31;
		case 10:
			dias = dias +30;
		case 9:
			dias = dias +31;
		case 8:
			dias = dias +31;
		case 7:
			dias = dias +30;
		case 6:
			dias = dias +31;
		case 5:
			dias = dias +30;
		case 4:
			dias = dias +31;
		case 3:
			if (anio%4==0 && (anio%100!=0 || anio%400== 0)) {
				dias = dias +29;
			}else {
				dias = dias +28;
			}
		case 2:
			dias = dias +31;
		}
		System.out.println(dias);
		
	}
	public static void ejercicio4() {
		double total=300;
		if(total>=300) {
			total = total-(total*0.2);			
		}
		System.out.println("El total a pagar es " + total);
	}
	public static void ejercicio3() {
		int horas = 41;
		int horas_extras;	;
		if(horas<=40) {
			System.out.println("su pago es :"+horas*16);
		}else {		
			horas_extras = horas - 40;
			int resultado = 640 + horas_extras*20;
			System.out.println("su pago es :"+resultado);
		}
	}
	public static void ejercicio2() {
		int dado1=6;
		int dado2=6;
		int dado3=6;
		if((dado1 == 6 && dado2!=6 && dado3!=6)|| (dado1 != 6 && dado2==6 && dado3!=6)||(dado1 != 6 && dado2!=6 && dado3==6)) {
			System.out.println("regul");
		}
		if((dado1 != 6 && dado2==6 && dado3==6)||(dado1 == 6 && dado2!=6 && dado3==6)||(dado1 == 6 && dado2==6 && dado3!=6)) {
			System.out.println("muy bien");
		}
		if(dado1 == 6 && dado2==6 && dado3==6) {
			System.out.println("excelente");
		}
		if(dado1 != 6 && dado2!=6 && dado3!=6) {
			System.out.println("pesimo");
		}
		
	}
	public static void ejercicio1() {
		int numero = 200;
		String numero1="200";
		System.out.println(numero1.length());
		if(numero<=9) {
			System.out.println("1 cifra");
		}else if(numero<=99) {
			System.out.println("2 cifras");
		}else if(numero<=999){
			System.out.println("3 cifras");
		}else if(numero<=9999){
			System.out.println("4 cifras");
		}
	}
	public static void entradas() {
		String nombre = Entrada.cadena();
		int numero = Entrada.entero();
		double real = Entrada.real();
		char caracter = Entrada.caracter();
		System.out.println("el nombre ingresado es : "+nombre);
		System.out.println(numero);
		System.out.println(real);
		System.out.println(caracter);
	}
	public static void  jpanel() {
		JOptionPane.showMessageDialog(null, "Operaci�n realizada correctamente");
	}
	public static void problema7() {
		
		int numero1 = 120555;
		int length = (int) (Math.log10(numero1) + 1);
		System.out.println(length);
	}
	public static void problema6() {
		System.out.println("Ingrese d�a de la semana :");
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
				System.out.println("tiene un d�gito");
			 }
			if(numero1<=99 && numero1>=10 ) {
				System.out.println("tiene dos d�gitos");
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
