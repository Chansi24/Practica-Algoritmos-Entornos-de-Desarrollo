package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import util.Algoritmos;

class test1 {
    int n1=3;
    int n2=6;
    int n3=11;
    		
	@Test
	void fibonacci() { //3
		int fibonacciEsperada=1;
		int fibonacciObtenida=Algoritmos.fibonacci(3);
		assertEquals(fibonacciEsperada, fibonacciObtenida);
	}
	
	@Test
	void fibonacci2() { //6
		int fibonacciEsperada=5;
		int fibonacciObtenida=Algoritmos.fibonacci(6);
		assertEquals(fibonacciEsperada, fibonacciObtenida);
	}
	@Test
	void fibonacci3() { //11
		int fibonacciEsperada=55;
		int fibonacciObtenida=Algoritmos.fibonacci(11);
		assertEquals(fibonacciEsperada, fibonacciObtenida);
	}
	
	@Test
	void factorial() { //3
		int factorialEsperado=6;
		int factorialObtenido=Algoritmos.factorial(3);
		assertEquals(factorialEsperado, factorialObtenido);
	}
	
	@Test
	void factorial2() { //6
		int factorialEsperado=720;
		int factorialObtenido=Algoritmos.factorial(6);
		assertEquals(factorialEsperado, factorialObtenido);
	}
	
	@Test
	void factorial3() { //11
		int factorialEsperado=39916800;
		int factorialObtenido=Algoritmos.factorial(11);
		assertEquals(factorialEsperado, factorialObtenido);
	}
	
	@Test
	void esPrimo() { //3
		boolean esPrimoEsperado=true;
		boolean esPrimoObtenido=Algoritmos.esPrimo(3);
		assertEquals(esPrimoEsperado, esPrimoObtenido);
	}
	
	@Test
	void esPrimo2() { //6
		boolean esPrimoEsperado=false;
		boolean esPrimoObtenido=Algoritmos.esPrimo(6);
		assertEquals(esPrimoEsperado, esPrimoObtenido);
	}
	
	@Test
	void esPrimo3() { //11
		boolean esPrimoEsperado=true;
		boolean esPrimoObtenido=Algoritmos.esPrimo(11);
		assertEquals(esPrimoEsperado, esPrimoObtenido);
	}
	
	

}
