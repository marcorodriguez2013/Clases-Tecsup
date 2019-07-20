
public class ultimaclase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int numeros2[][] = {{1,4,7},{2,110,8},{3,88,9}};
		//9
		int numeros3[][] = {{3,2,5},{1,2,3},{3,1,4}};
		//5
		//ImprimirArreglo(sumararreglos(numeros2, numeros3,'+'));
		
	
		//ImprimirArreglo(sumararreglos(numeros2, numeros3,'-'));
	
		//ImprimirArreglo(sumararreglos(numeros2, numeros3,'*'));
	
		

	}
	public static int obtenermayor(int[][] a) {
		return 0;
		
		
	}
		

	public static int[][] sumararreglos(int[][] a,int[][] b,char simbolo) {
		int[][] c = new int[a.length][a[0].length];
		for (int e = 0; e < a.length; e++) {
			for (int i = 0; i < a.length; i++) {
				switch (simbolo) {
				case '+':
					c[e][i]=a[e][i]+b[e][i];
					break;
				case '-':
					c[e][i]=a[e][i]-b[e][i];
					break;
				case '*':
					c[e][i]=a[e][i]*b[e][i];
					break;       
				}	
				
			}
		}
		return c;

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
	public static int[] ordenararreglo(int[] arreglo) {
		int cantidad  = arreglo.length;
		int temporal;
		for(int i2=0;i2<cantidad-1;i2++) {
			for(int i=0;i<cantidad-1-i2;i++) {				
				if(arreglo[i]>arreglo[i+1]) {
					temporal =arreglo[i];
					arreglo[i]=arreglo[i+1];
					arreglo[i+1]=temporal;
				}
			}
		}
		return arreglo;
	}
	public static void ordenararreglo2(){
		int array[] = {3,2,5,7};
		int temporal, i;
		boolean cambios;
		System.out.println(array.length/2);
		for(int i2=array.length/2; i2!=0; i2=i2/2){
			cambios=true;
			while(cambios){ 
				cambios=false;
				for(i=i2; i< array.length; i++) 
					if(array[i-i2]>array[i]){ 
						temporal=array[i]; 
						array[i]=array[i-i2];
						array[i-i2]=temporal;
						cambios=true; 
					}
			}
		}
		ImprimirArreglo(array);
	}

	public static int[] LlenarArreglo(int size) {
		System.out.println(
				"Se crear un arreglo de tamaño "+size);
		int[] arreglo = new int[size];
		for(int i = 0; i< size; i++) {
			System.out.print("Ingrese el valor para ["+i+"]=");
			arreglo[i] = Entrada.entero();
		}
		return arreglo;
	}

	public static int[] SumarArreglos(int[] a1, int[] a2) {
		int[] n_arreglo = new int[a1.length];
		for(int i = 0; i<a1.length;i++) {
			n_arreglo[i] = a1[i] + a2[i];
		}
		return n_arreglo;

	}

	public static int[] DuplicarArreglo(int[] arreglo) {
		int[] n_arreglo = new int[arreglo.length];
		for(int i = 0; i< arreglo.length; i++) {
			n_arreglo[i] = arreglo[i]*2;
		}
		return n_arreglo;
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

	public static boolean RealizarOperacion() {
		boolean repetir = true;
		System.out.println("Ingrese primer numero");
		int n = Entrada.entero();
		System.out.println("Ingrese segundo numero");
		int n2 = Entrada.entero();
		System.out.println("Ingrese operador");
		char op = Entrada.caracter();

		System.out.println(n + " "+ op+ " "+ n2 + " =");
		int resultado = 0;
		switch(op) {
		case '+':
			resultado = Suma(n, n2);
			break;
		case '-':
			resultado = Resta(n, n2);
			break;
		case '/':
			resultado = Division(n, n2);
			break;
		case '*':
			resultado = Multiplicacion(n, n2);
			break;
		default:
			System.out.println("Caracter incorrecto");
			break;
		}
		System.out.println(resultado);
		return repetir;
	}

	public static int Suma(int a, int b) {
		int x = a+b;
		return x;
	}

	public static int Resta(int a, int b) {
		int x = a-b;
		return x;
	}

	public static int Multiplicacion(int a, int b) {
		int x = a*b;
		return x;
	}

	public static int Division(int a, int b) {
		int x = a/b;
		return x;
	}




}
