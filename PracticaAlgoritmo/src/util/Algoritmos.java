package util;

public abstract class Algoritmos {
	
	/**
	 * Creamos el metodo estatico fibonacci que devuelve el numero fibonacci de un entero dado.
	 * @param MAX
	 * @return un entero que es el numero fibonacci del numero dado
	 */
	 
	public static int fibonacci(int MAX) {

		int firstNumber = 0;
		int secondNumber = 1;
		int fibonacci = '\0';
		//Si el numero es 0, el número fibonacci sera tambien 0.
		if (MAX ==0) {
			fibonacci=0;
		}
		//Si el numero es 1, el número fibonacci sera tambien 1.
		if (MAX ==1) {
			fibonacci=1;
		}
		//Si el numero es mayor que 1, deberemos sumar el fibonacci de los dos números anteriores
		else {
			for (int i = 2; i < MAX; i++) {

				fibonacci = firstNumber + secondNumber;
			

				firstNumber = secondNumber;
				secondNumber = fibonacci;
			}
		}
		return fibonacci;
	}
	/**
	 * Metodo factorial que devuelve el factorial de un entero dado, este consiste en multiplicar todos los 
	 * numero anteriores al numero dado incluido el propio numero.
	 *
	 * @param fac
	 * @return el numero factorial del numero dado
	 */
	
	public static int factorial (int fac) {
		int factor=1;
		for (int i = 1; i <= fac; i++) {
            factor = factor * i;
        }
		return factor;
	}
	/**
	 * Metodo esPrimo devuelve true en caso de que el numero introducido sea primo y false si no lo es.
	 * Mediante un bucle comprobamos que el numero no sea divisible con resto 0 por ningun número salvo
	 * por si mismo y por el 1.
	 * @param prim
	 * @return true si el numero es primo y false si no lo es
	 */
	public static boolean esPrimo(int prim) {
		boolean primo =false;
		for	(int i=2; i<prim; i++) {
			if(prim % i == 0) {
				primo=false;
				i = prim+1;
			}
			else {
				primo=true;
			}
		}
		return primo;
	}
}
