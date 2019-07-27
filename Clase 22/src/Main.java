
public class Main {

	public static void main(String[] args) {
		//expresiones_parte1();
		//Lab02_02_Ejercicio_02();
		//Lab02_03_Ejercicio_03();
		//Lab02_04_Ejercicio_04();
		//Lab02_05_Ejercicio_05();
		//Lab02_06_Ejercicio_06();
		//Lab02_07_Ejercicio_07();
		//Lab02_08_Ejercicio_08();
		//Lab02_09_Ejercicio_09();
		//Lab02_09_Ejercicio_09(); //codigo a medias
		//Lab02_09_Ejercicio_09_metodo2();
		Lab02_10_Ejercicio_10();
	}
	public static void expresiones_parte1() {
		double respuesta=0;
		double a=0;
		double b=0;
		double c=0;
		double d=0;
		double x=0;
		double y=0;
		double z=0;
		/*ESCRIBA LAS SIGUIENTES EXPRESIONES ALGEBRAICAS COMO EXPRESIONES DE ALGORITMOS (O DE
    LENGUAJE JAVA):*/
		respuesta = Math.sqrt(b*b-4*a*c);
		respuesta = Math.pow(x,2)-Math.pow(y,2)/Math.pow(z,2);
		respuesta = 3*x + 2*y/2*z;
		respuesta = a+b/c-d;
		respuesta = 4*Math.pow(x,2)-2*x+7;
		respuesta = Math.pow(a-b,2)+Math.pow(c-d,2);

	}
	public static void Lab02_01_Ejercicio_01() {
		int num = Entrada.entero() ;
		System.out.println("La mitad de " + num + " es " + num / 2);
		System.out.println("La mitad de " + num + " es " + num / 2.0);
		//Ejecute nuevamente el proyecto con el número impar como argumento. ¿El resultado es exacto ahora? ¿Por
		//qué? - porque se esta diviviendo por por un número doble

	}
	public static void Lab02_02_Ejercicio_02() {
		int base = Entrada.entero() ; ;
		int altura = Entrada.entero() ; ;
		System.out.println("Base : " + base);
		System.out.println("Altura: " + altura);
		System.out.println("Área : " + base*altura);
		// la clase recibe una base y recibe una altura por teclado
		//lo que hace la formula es sacar el área de un cuadrado o rectangulo
	}
	public static void Lab02_03_Ejercicio_03() {
		int catetoA = Entrada.entero() ;
		int catetoB = Entrada.entero() ;
		double resultado = 0;
		System.out.println("El cateto a es " + catetoA);
		System.out.println("El cateto b es " + catetoB);
		resultado = Math.pow(catetoA,2) + Math.pow(catetoB, 2);
		System.out.println("La hipotenusa es " +  resultado);
	}
	public static void Lab02_04_Ejercicio_04() {
		float num1 = (float) Entrada.real();
		int num2 = (int) num1;
		System.out.print("El valor ingresado es: " + num2);

		// por el tipo de dato cambiando el tipo de dato
	}
	public static void Lab02_05_Ejercicio_05() {
		int a;
		int b;
		int c;
		a = Entrada.entero();
		b = Entrada.entero();
		System.out.println("el valor de a es : "+a);
		System.out.println("el valor de b es : "+b);
		System.out.println("el sistema cambiara los datos de las variables");
		c=a;
		a=b;
		b=c;
		System.out.println("el valor de a es : "+a);
		System.out.println("el valor de b es : "+b);			
	}
	public static void Lab02_06_Ejercicio_06() {
		int largo;
		int alto;
		int perimetro;
		System.out.print("ingrese largo :");
		largo = Entrada.entero();
		System.out.print("ingrese alto :");
		alto = Entrada.entero();
		perimetro = 2*largo + 2*alto;
		System.out.println("el perimetro del rectangulo es :" + perimetro);

	}
	public static void Lab02_07_Ejercicio_07() {
		int radio= Entrada.entero();
		double pi= Math.PI;
		double circunferencia = 2*pi*radio;
		System.out.println("la circunferencia del circulo es :"+(double)circunferencia);
		double area = pi*Math.pow(radio,2);
		System.out.println("el area del circulo es :"+(double)area);

	}
	public static void Lab02_08_Ejercicio_08() {
		double a;
		double b;
		double c;
		double discriminante;
		double x1;
		double x2;
		System.out.println ("ingrese el coficiente de A");
		a = Entrada.real();
		System.out.println ("ingrese el coficiente de B");
		b = Entrada.real();
		System.out.println ("ingrese el coficiente de C");
		c = Entrada.real();
		discriminante = ((b*b)-(4*(a*c)));

		if (discriminante < 0) {
			System.out.println ("la ecuacion no tiene soluciones reales");
		}

		if (discriminante == 0) {
			System.out.println ("la ecuacion tiene solo una raiz real");
			x1 = (-b)/(2*a);
			System.out.println ("La Solucion es, X1=X2 : " +x1);
		}

		if (discriminante > 0) {
			System.out.println ("La ecuacion tiene dos raizes reales");
			x1 = (-b)+Math.sqrt(discriminante)/(2*a);
			x2 = (-b)-Math.sqrt(discriminante)/(2*a);
			System.out.println ("la soluciones, X1 = " +x1+ " y, X2 = " +x2);
		}

	}

	public static void Lab02_09_Ejercicio_09() {
		int monto = 110;
		int resultado;
		int resultado2;
		int c;

		resultado = monto%20;
		resultado2 = monto-resultado;
		c = resultado;
		System.out.println("usted recibe "+ resultado2);
		resultado = c%50;
		resultado2 = c-resultado;
		c = resultado;
		System.out.println("usted recibe "+ resultado2);
		resultado = c%100;
		resultado2 = c-resultado;
		c = resultado;
		System.out.println("usted recibe "+ resultado2);

	}
	public static void Lab02_09_Ejercicio_09_metodo2() {
		int numero = 600 ;
		int cincuenta = 0;
		if(numero%20!=0) {
			cincuenta+=1;
			numero-=50;

		}
		System.out.println("cien :" + numero /100);
		System.out.println("cincuenta :" + cincuenta);
		System.out.println("veinte :" + (numero%100)/20);

	}
	public static void Lab02_10_Ejercicio_10() {
		int velocidad_final=0;
		int velocidad_inicial=60;
		int aceleracion=10;
		int tiempo=20;
		int distancia;
		velocidad_final = velocidad_inicial+aceleracion*tiempo;
		distancia = (int) (velocidad_inicial*tiempo+Math.pow(aceleracion*tiempo,2)/2);
		System.out.println(velocidad_final);
		System.out.println(distancia);

	}
}