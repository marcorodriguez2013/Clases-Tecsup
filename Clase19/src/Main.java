
public class Main {

	public static void main(String[] args) {
		//ejercicio_n1();
		//ejercicio_n2(12,6);//ALTURA - ANCHO
		//ejercicio_n3();		
		System.out.println("prueba");
		hola
	}
	public static void ejercicio_n3() {
		int [] a = { 1,2,3,1,
				4,5,6,1,
				7,8,9,1,
				1,1,1,1
		};

		int [] b = { 1,2,3,1,
				4,5,6,1,
				7,8,9,1,
				1,1,1,1
		};
		multiplicacion_arreglo(arreglo_simple_a_bi(a),arreglo_simple_a_bi(b));
	}
	public static int[][] arreglo_simple_a_bi(int[] a) {
		int size=(int) Math.sqrt(a.length);
		int[][] b = new int[size][size];
		for (int i = 0; i <size; i++) {
			for (int e = 0; e < size; e++) {
				b[i][e]=(a[i*size+e]);
			}
		}
		return b;
		/*for (int i = 0; i < a.length; i++) {
			if (i%size==0) {
				System.out.println();
			}
			System.out.print(a[i]+"\t");
		}*/
	}
	public static void ejercicio_n2(int altura , int ancho) {		
		triangulo(ancho);
		imprimirrectangulo(altura-ancho,ancho-2);
	}
	public static void ejercicio_n1() {
		int[] array= {1,4,7,9,23};
		int numero_buscar = Entrada.entero(); 
		boolean pregunta=false;
		int posicion = 0;

		for (int i = 0; i < array.length; i++) {
			if (array[i] == numero_buscar){
				posicion = i;
				pregunta = true;
			}
		}
		if(pregunta == true) {
			System.out.println("El numero "+numero_buscar+ " esta en la posición "+posicion);

		}else {
			System.out.println("El numero "+numero_buscar+ " no esta en el arreglo");
		}
	}
	public static void arreglomulti() {
		int[] a= {1,2,3,1,
				4,5,6,1,
				7,8,9,1,
				1,1,1,1};
		int size=(int) Math.sqrt(a.length);
		for (int i = 0; i <size; i++) {
			for (int e = 0; e < size; e++) {
				System.out.print(a[i*size+e]+"\t");
			}
			System.out.println();
		}
		for (int i = 0; i < a.length; i++) {
			if (i%size==0) {
				System.out.println();
			}
			System.out.print(a[i]+"\t");
		}
	}
	public static void triangulo(int numero) {
		for (int i =0; i < numero;i++) {
			for (int e = 0; e < numero-i; e++) {
				System.out.print(" ");
			}
			imprimir(i+1);

		}	
	}
	public static void imprimirescaleradesc(int numero) {
		for (int i =0; i < numero; i++) {
			//imprimir(1+i);
			imprimir(numero-i);
		}	
	}
	public static void imprimirrectangulo(int alto,int ancho) {
		for (int i = 0; i < alto; i++) {
			System.out.print("   ");
			imprimir(ancho);
		}	
	}
	public static void imprimircuadrado(int numero) {
		for (int i = 0; i < numero; i++) {
			imprimir(numero);
		}	
	}
	public static void imprimir(int numero) {		
		for (int i = 0; i < numero ; i++) {
			System.out.print("* ");
		}
		System.out.println();
	}
	public static void multiplicacion_arreglo(int[][] a,int[][] b) {

		int[][] c=new int[a.length][b[0].length];
		int r=0;
		for (int e2 = 0; e2 < a.length; e2++) {
			for (int e = 0; e < b[0].length; e++) {
				r=0;
				for (int i = 0; i < b.length; i++) {
					r =r+ a[e2][i]*b[i][e];
				}
				c[e2][e]=r;
			}
		}
		ImprimirArreglo(c);
	}
	public static void ImprimirArreglo(int[][] arreglo) {
		System.out.print("[");
		for (int i = 0; i < arreglo.length; i++) {
			if (i!=0) {
				System.out.print(",");
			}
			ImprimirArreglo(arreglo[i]);
		}
		System.out.print("]");

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
}
