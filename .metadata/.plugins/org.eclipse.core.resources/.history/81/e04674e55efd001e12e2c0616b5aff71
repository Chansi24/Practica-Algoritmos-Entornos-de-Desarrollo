package util;

public abstract class Algoritmos {
	
	/*
	 * Creamos el metodo estatico fibonacci que devuelve el numero fibonacci de un entero dado. 
	 */
	public static void fibonacci(int MAX) {

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
	}
	/*
	 * Metodo factorial que devuelve el factorial de un entero dado, este consiste en multiplicar todos los 
	 * numero anteriores al numero dado incluido el propio numero.
	 */
	public static void factorial(int fac) {
		int factorial=1;
		for (int i = 1; i <= fac; i++) {
            factorial = factorial * i;
        }
	}
}
