package ro.unitbv.arrayoparations;

public class ArrayOperations {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		search();

	}
	
	private static void search() {
		
		int[] numbers = {1,5,7,8,32,64,57,21,56,75,12};
		
		//  Sa se gaseasca numarul cu valoare 7
		// getOvjectBy(...)
		// fint(criteria)
		
		// 1. Mod iterativ in 0(n)
		
		for(int nr:numbers) {
			if (nr == 7) {  // compararea o sa fie una time-consming
				System.out.println("Valoarea a fost gasita");
			}
		}
		
		// 2. Mod iterativ
		// - este indeajuns sa gasim primul element care respecta conditia
		// Best case 0(1) si worst case 0(n)
		
		for(int nr : numbers) {
			if (nr == 7) { // compararea o sa fie una time-consming
				return nr;
				System.out.println("Valoarea a fost gasita");
				break;
			}
		}
		
		// 3. cautarea binara
		// - Pleaca de la premisa ca sirul este ordonat crescator
		// - Incepe cautarea de la mijloc si se intreaba daca valoarea cautata este mai mare sau mai mica decat mijlocul.
		// - Daca valoarea este mai mica, atunci cautarea va continua doar in subsirul din stanga
		// - Daca valoarea este mai mare decat mijlocul, atunci cautarea va continua doar in sub sirul din dreapta.
		
		// 4. Cautarea bazata pe index
		// Pentru a obtine performanta si scalabilitate( sa mearga bine si pentru 10 elemente dar si pentru 100)
		// conteaza structura de date pe care o alegeti
		
		// Daca folositi o lista inlantuita complexitatea de cautare pe index va fi 0(n)
	}

}
