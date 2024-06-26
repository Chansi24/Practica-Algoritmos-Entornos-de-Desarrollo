package app;

import java.util.Random;

import util.Algoritmos;

public class Principal {

	public static void main(String[] args) {
	//1-Crea mediante un bucle un array de enteros llamado “numeros” con 5 números aleatorios del 1 al 10.
		int[]numeros= new int[5];
		Random ran= new Random();
		for(int i=0; i<5; i++) {
			numeros[i]= ran.nextInt(10) + 1;
		}
	//2-Calcula mediante un bucle el número de fibonacci de los 5 números del array y
	//	almacena el resultado en otro array de enteros llamado “resultadoFibonacci”.
		
		int[]resultadoFibonacci=new int[5];
		for(int i=0; i<5; i++ ) {
			resultadoFibonacci[i]=Algoritmos.fibonacci(numeros[i]);
		}
	//3-Calcula mediante un bucle el factorial de los 5 números del array y almacena el resultado en otro
	//	array de enteros llamado “resultadoFactorial”.
		int[]resultadoFactorial=new int[5];
		for(int i=0; i<5; i++ ) {
			resultadoFactorial[i]=Algoritmos.factorial(numeros[i]);
		}
	//4-Comprueba mediante un bucle si los 5 números del array son primos o no y almacena el resultado en otro
	//	array de booleanos llamado “resultadoPrimos”.
		boolean[]resultadoPrimos=new boolean[5];
		for(int i=0; i<5; i++ ) {
			resultadoPrimos[i]=Algoritmos.esPrimo(numeros[i]);
		}
		
	}

}
