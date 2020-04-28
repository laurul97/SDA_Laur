package ro.unitbv.matrici;

public class Matrici {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
	}
	
	// 1. de ce avem nevoie de matrici
	// 2. Cum declaram o matrice
	// 3. Unde avem nevoie de siruri multi-dimensionale
	// 4. algoritmi de baza

	int mat1[]; // sir de date uni-dimensional
	int mat2[][] = new int[4][3]; // sir date bi-dimensional
	int mat3[][][] = new int[4][4][3]; // sir tri-dimensional
	//..
	int mat5[][][][][] = new int[3][4][5][3][3];
		
	// Use-cases
	// liste - table
	// imagini - reprezentatrea imaginilor in mod digital
	//
	// sa reprezinti o imagine alb-negru in digital
	// valori de 0 - 255 intr-o matrice
	//
	//
	// - procesari de imagine:
	//		- functii de auto-corect - operatii/algoritmi pe amtrici
	//		- functia de filter din instagram - operatii/algoritmi pe matrici
	//		- recunoastere de imagini/ face regognition
	//		- recunoasterea de obiecte din imagine
	//	- openCV https://opencv.org
	
	
	
	//statistica - big data
	// - proprietati
	// prezicerea pretului unei locuinte in functie de locatie si metri patrati
	// - predictiile se fac pe mai mult de 2 parametri
	
	// machine learning / deep learning
	// algoritmi de regresie/ clustering .. date sunt reprezentate ca si tablouri multi dimensionale
	// deep learning = acelasi lucru 
	// - retele convolutionale (retele specializate pe imagini) - imagini reprrezentate ca si 
	// matrici si operatii pe ele
	
	
	
	// algoritmi de baza
	// - inmultirea sirurior bi dimensionale
	// - adinari
	// - parcurgeri partiale( partea superioara, inferioara - diagonalei principale)
	// - aplicari de filtre peste siruri bi-dimensionale
		
}
