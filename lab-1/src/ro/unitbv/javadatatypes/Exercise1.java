package ro.unitbv.javadatatypes;

import java.util.Scanner;

public class Exercise1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Hello World");

		Scanner scanner = new Scanner(System.in);
		System.out.println("Introdu nr1: ");
		int nr1  = scanner.nextInt();
		
		//afisam output-ul
		System.out.println("primul nr citit este: " + nr1);
		
		System.out.println("Introdu nr2: ");	
		int nr2 = scanner.nextInt();
		
		System.out.println("al doilea nr citit este: " + nr2);
		
		int sum = nr1 + nr2;
		System.out.println("suma este: " + sum);
		
		int dif = nr1 - nr2;
		System.out.println("Diferenta: " + dif);
		
		int prod = nr1 * nr2;
		System.out.println("Produsul: " + prod);
		
		double impartire = 0;
		
		
		int media = (nr1 + nr2)/2;
		System.out.println("Media:" + media);
		
		if (nr1 < nr2) {
			System.out.println("max integer: " + nr2);
		} else {
			System.out.println("max integer: " + nr1);
		}
		
		int dist = Math.abs(nr1-nr2);
		System.out.println("Distanta: "+dist);
		
		double raport = (double)nr1/nr2;
		System.out.print("Raportul: ");
		System.out.printf("%.3f%n", raport);
	
		}
	}

