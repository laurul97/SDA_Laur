package Lab4_Problema2;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int [] arr =  new int[]{12, 25, 47, 58, 47, 7, 96, 14, 3, 9};

        ArrayList myNewArray = new ArrayList();

        for (int i = 0; i < arr.length; i++) {
            myNewArray.add(arr[i]);
        }

        Scanner scan = new Scanner(System.in);

        int position = -1;
        int number = 0;
        int temp = 0;

        do {
            System.out.println("Select the position between 0-9: ");
            position = scan.nextInt();
        } while (position < 0 || position > 9);

        myNewArray.remove(position);
        
        System.out.println(myNewArray);
		
	}

}
