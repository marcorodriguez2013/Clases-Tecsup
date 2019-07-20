package clasenumero2;
import java.util.Scanner;
public class main {
    public static void main(String[] args) {
        ejemplo5();
    }
    static void ejemplo7() {
    	
    	/*if(n%7==0) {
    		System.out.println("es primo");
    	}else {
    		System.out.println("no es primo");
    	}*/
    	int n = 15;
    	int m = 4;
    	int z=0;
    	while (n > m) {
    	 n = n-m ;
    	 System.out.println(n);
    	}
    	


    }
    
    static void ejemplo3() {
        int a = 2034;
        if ((a % 4 == 0) && ((a % 100 != 0) || (a % 400 == 0))) {
            System.out.println("El año es bisiesto");
        } else {
            System.out.println("El año no es bisiesto");
        }
    }

    static void ejemplo2() {
        char genero = 'a';
        if (genero == 'a') {
            System.out.println("este género es a");
        };
        if (genero == 'b') {
            System.out.println("este género es b");
        };
        if (genero == 'c') {
            System.out.println("este género es c");
        };
        if (genero == 'd') {
            System.out.println("este género es d");
        };
        if (genero == 'e') {
            System.out.println("este género es e");
        };
        switch (genero) {
            case 'a':
                System.out.println("este género es a");
                break;
            case 'b':
                System.out.println("este género es a");
                break;
            case 'c':
                System.out.println("este género es a");
                break;
            case 'd':
                System.out.println("este género es a");
                break;
            case 'e':
                System.out.println("este género es a");
                break;
            default:
                break;
        }
    }
    static void ejemplo1() {
        //area
        double r = 15;
        double pi = Math.PI;
        double area_circulo = (r * r) * pi;
        //System.out.println(area_circulo);

        //circunferencia		
        double r2 = 15;
        double circunferencia = 2 * pi * r2;
        //System.out.println(circunferencia);

        //iguales
        double nuno = 15;
        double ndos = 15;
        if (nuno == ndos) {
            //System.out.println("son iguales");
        }

        // multiplo
        int res;
        int numero1 = 21;
        int numero2 = 3;
        res = numero1 % numero2;
        if (res == 0) {
            //System.out.println(numero1 + " es múltiplo de " + numero2);
        } else {
            //System.out.println(numero1 + " no es múltiplo de " + numero2);
        }
        //numero mayor
        int number1 = 10;
        int number2 = 20;
        if (number1 > number2) {
            //System.out.println(number1);
        } else {
            //System.out.println(number2);
        }

        //ecuación cuadrática
        int a = 2;
        int b = 4;
        int c = -8;
        int d = (b * b) - (4 * a * c);
        int e = 2 * a;
        if (d == 0) {
            //System.out.println("x1 = x2 ="+(- b / e));
        }

        int edad = 18;
        char genero = 'F';
        boolean varon = edad >= 21 && genero == 'M';
        boolean mujer = edad >= 18 && genero == 'F';
        if (varon || mujer) {
            System.out.print("ingresa");
        } else {
            if (genero == 'M') {
                System.out.print("necesita tener mas de 21");
            } else {
                System.out.print("necesita tener mas de 18");
            }
            System.out.print("no ingresa");

        }

    }
    public static void ejemplo4() {
        System.out.println("Empezamos el programa");
        System.out.println("Por favor introduzca una cadena por teclado:");
        String palabra;
        String palabra2;
        String resultado;
        Scanner entradaEscaner = new Scanner(System.in);
        palabra = entradaEscaner.nextLine();
        palabra2 = entradaEscaner.nextLine();
        resultado = palabra.concat(palabra2);
        System.out.println(palabra.concat(" ").concat(palabra2));

    }
    public static void ejemplo5() {

        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        char gender = sc.next().charAt(0);
        int age = sc.nextInt();
        long mobileNo = sc.nextLong();
        double average = sc.nextDouble();
        System.out.println("Nombre: " + name);
        System.out.println("Género: " + gender);
        System.out.println("Edad: " + age);
        System.out.println("Teléfono: " + mobileNo);
        //System.out.println("Promedio: " + average);
    }
    public static void ejemplo6() {
        String operacion = "retiro";
       /* if (operacion == "retiro") {
            System.out.println("retiro 10 soles");
        } else if (operacion == "deposito") {
            System.out.println("deposito 100");
        } else if (operacion == "movimientos") {
            System.out.println("movimiento 1 \n movimiento2");
        }*/
        switch (operacion) {
		case "retiro":
			System.out.println("deposito 100");
			break;
		case "deposito":
			System.out.println("movimientos");
			break;
		case "movimientos":
			System.out.println("movimiento 1 \n movimiento2");
			break;
		}
    }
}