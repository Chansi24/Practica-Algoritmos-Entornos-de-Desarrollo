package util;

public abstract class Algoritmos {
	
	/*
	 * Creamos el metodo estatico fibonacci que devuelve el numero fibonacci de un entero dado. 
	 */
	public static void fibonacci(int MAX) {

		int firstNumber = 0;
		int secondNumber = 1;
		int fibonacci = '\0';
		if (MAX ==0) {
			fibonacci=0;
		}
		if (MAX ==1) {
			fibonacci=1;
		}
		else {
			for (int i = 2; i < MAX; i++) {

				fibonacci = firstNumber + secondNumber;
			

				firstNumber = secondNumber;
				secondNumber = fibonacci;
			}
		}
	}
}
