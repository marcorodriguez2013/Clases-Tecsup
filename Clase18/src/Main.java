import java.io.*;
public class Main {

	public static void main(String[] args) {
		//ejercicio1_metodo1();
		//ejercicio1_metodo2();
		//ejercicio2_arreglos();
		//ejercicio3_arreglos();
		ejercicio4_arreglos();

	}
	public static void ejercicio4_arreglos() {
		//ImprimirArreglo(array1);
		String[][] matriz_bi = new String[3][3];
		for (int i = 0; i < matriz_bi.length; i++) {
			String fila=Entrada.cadena();
			String[] array = fila.split(",");
			matriz_bi[i]=array;
		}
		ImprimirArreglo(matriz_bi);
	}
	public static void ejercicio3_arreglos() {
		String[] nombres = new String[4];
		int contador = 0;
		for (int i = 0; i < nombres.length; i++) {
			nombres[i] = Entrada.cadena();
		}
		ImprimirArreglo(nombres);
		System.out.print("ingrese palabra a eliminar :");
		String palabra_eliminar = Entrada.cadena();
		for (int i = 0; i < nombres.length; i++) {
			if(nombres[i].equals(palabra_eliminar)) {				

				nombres[i] = null;
			}
		}
		ImprimirArreglo(nombres);

	}
	public static void ejercicio2_arreglos() {
		String[] nombres = new String[4];
		int contador = 0;
		for (int i = 0; i < nombres.length; i++) {
			nombres[i] = Entrada.cadena();
		}
		ImprimirArreglo(nombres);
		System.out.print("ingrese palabra a buscar :");
		String palabra_buscar = Entrada.cadena();
		for (int i = 0; i < nombres.length; i++) {

			if(nombres[i].equals(palabra_buscar)) {				
				contador++;
			}
		}
		if(contador == 1) {
			System.out.println("la palabra "+palabra_buscar+" aparece "+contador+ " vez");
		}else {
			System.out.println("la palabra "+palabra_buscar+" aparece "+contador+ " veces");
		}
	}
	public static void ejercicio1_arreglos() {
		String[] nombres = new String[4];
		for (int i = 0; i < nombres.length; i++) {
			nombres[i] = Entrada.cadena();
		}
		ImprimirArreglo(nombres);
		for (int i = 0; i < nombres.length; i++) {
			if(nombres[i].equals("carmen")) {				
				nombres[i] = "david";
			}
		}
		ImprimirArreglo(nombres);
	}
	public static void ejercicio1_metodo1() {
		String palabra = Entrada.cadena();
		char[] array = palabra.toCharArray();
		String resultado = "";
		System.out.println(array.length);
		for (int i = 0; i < array.length; i++) {
			resultado = resultado + array[i] + " ";
		}
		System.out.println(resultado);		
	}
	public static void ejercicio1_metodo2() {
		String palabra = Entrada.cadena();
		String resultado = "";
		System.out.println(palabra.length());
		for (int i = 0; i < palabra.length(); i++) {
			if(palabra.charAt(i)!=' ') {
				resultado = resultado + palabra.charAt(i) + " ";
			}

		}
		System.out.println(resultado);		
	}
	public static void ImprimirArreglo(int[] arreglo) {
		System.out.print("[");
		for(int i = 0; i< arreglo.length; i++) {
			if(i==arreglo.length-1) {
				System.out.print(arreglo[i]);
			}else {
				System.out.print(arreglo[i]+",");
			}
		}
		System.out.print("]");
	}
	public static void ImprimirArreglo(String[] arreglo) {
		System.out.print("[");
		for(int i = 0; i< arreglo.length; i++) {
			if(i==arreglo.length-1) {
				System.out.print(arreglo[i]);
			}else {
				System.out.print(arreglo[i]+",");
			}
		}
		System.out.print("]");
	}

	public static void ImprimirArreglo(String[][] arreglo) {
		System.out.print("[");
		for (int i = 0; i < arreglo.length; i++) {
			if (i!=0) {
				System.out.print(",");
			}
			ImprimirArreglo(arreglo[i]);
		}
		System.out.print("]");

	}

}
