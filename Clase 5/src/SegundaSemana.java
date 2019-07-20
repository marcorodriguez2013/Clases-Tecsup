
public class SegundaSemana {
	public static void main(String[] args) {
		int numero1 [] = {1,2,3,4,5};
		int numero2 [] = {6,7,8,9,10};
		int numero3 [] = {11,12,13,14,15};
		int[] doble=llenararreglo(5);
		imprimirarreglo(doble);

	}
	public static int[] sumararreglos(int[] a1,int[] a2){
		int []a3 = new int[a1.length];
		for(int i=0;i<a1.length;i++) {
			a3[i]=a1[i]+a2[i];
		}
		return a3;

	}
	public static int[] llenararreglo(int size) {
		System.out.println("se creara un arreglo de tamaño " + size);
		int[] arreglo = new int[size];
		for(int i=0;i<size;i++) {
			System.out.print("ingre el valor para ["+i+"]=");
			arreglo[i]=Entrada.entero();
		}
		return arreglo;
		
	}
	public static void imprimirarreglo(int[] arreglo) {
		String respuesta="";
		for(int i=0 ; i<arreglo.length;i++) {
			if(i== arreglo.length-1) {
				respuesta = respuesta + arreglo[i];
			}else {
				respuesta = respuesta + arreglo[i]+",";
			}
		}
		System.out.println("["+respuesta+"]");
	}
	public static void calculadora() {
		int resultado;
		System.out.println("ingrese primer numero");
		int numero1 = Entrada.entero();
		System.out.println("ingrese segundo numero");
		int numero2 = Entrada.entero();
		System.out.println("ingrese operador");
		char op = Entrada.caracter();
		switch (op) {
		case '+':
			resultado = suma(numero1,numero2);
			break;
		case '-':
			resultado = resta(numero1,numero2);
			break;
		case '*':
			resultado =multiplicacion(numero1,numero2);
			break;
		case '/':
			resultado = division(numero1,numero2);
			break;
		default:
			resultado = 0;
			break;
		}
		//System.out.println(resultado);
		System.out.println(numero1 + " " + op + " " + numero2 + "=" + resultado);
		calculadora();
	}
	public static int suma(int a ,int b) {
		return a+b;
	}
	public static int resta(int a ,int b) {
		return a-b;
	}
	public static int multiplicacion(int a ,int b) {
		return a*b;
	}
	public static int division(int a ,int b) {
		return a/b;
	}

	public static void segunda() {

	}
	public static void primera() {
		int size=Entrada.entero();
		double[] n= new double[size];		
		for	(int i=0; i<n.length; i++) {
			n[i]=Entrada.entero();
		}
		/*for	(int i=0; i<n.length; i++) {
			System.out.println(n[i]);
		}
		for	(int i2=n.length-1; i2>=0; i2--) {
			System.out.println(n[i2]);
		}
		for	(int i=0; i<n.length; i++) {
			System.out.println((n[n.length-1)-i]);
		}*/
		for	(int i=0; i<n.length; i++) {
			System.out.println(n[i]*2);
		}
	}

}
