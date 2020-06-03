package Lab5_Problema1;

import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here

        Scanner scan = new Scanner(System.in);

        System.out.println("Type in the first number: ");
        int x = scan.nextInt();

        System.out.println("Type in the second number: ");
        int y = scan.nextInt();

        int img[][] = new int[x][y];

        for (int i = 0; i < x; i++) {
            for (int j = 0; j < y; j++) {
                img[i][j] = new Random().nextInt(255);
                System.out.print(img[i][j] + "   "); 
            }
            System.out.println();
        
        }
        
        QuickSort sort = new QuickSort();
        
        int arr[] = { 21, 13, 7, 3, 5, 22 };
		int n = arr.length;
		System.out.println("Sirul dat este:");
		sort.printArray(arr);

		QuickSort ob = new QuickSort();
		ob.sort(arr, 0, n - 1);

		System.out.println("\nSirul sortat este:");
		sort.printArray(arr);
        
        
    }
    
    
    
}