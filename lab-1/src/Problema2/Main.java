package Problema2;

import java.util.Arrays;
import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		double[] arr = {37.0, 36.5, 36.8, 37.8, 39.0};
		
		ArrayList<Double> normal = new ArrayList<Double>();
        ArrayList<Double> anormal = new ArrayList<Double>();
        
        ArrayList<String> sirFinal = new ArrayList<String>();
        
        System.out.println("Temperatura pacientilor: " + Arrays.toString(arr));
	
        for (int i = 0; i < arr.length; i++) {
        	if (arr[i] < 37.0) {
        		normal.add(arr[i]);
        		sirFinal.add(i +" - "+ arr[i]);
        		System.out.println("Pacientul " + (i + 1) + " are temperatura: " + arr[i]);
        	} else {
        		anormal.add(arr[i]);
        		sirFinal.add(i +" - "+ arr[i]);
        		System.out.println("Pacientul " + (i + 1) + " are temperatura: " + arr[i]);
        	}
        }
        
        System.out.println("Sunt " + normal.size() + " pacienti cu temperaturi normale.");
        System.out.println("Sunt " + anormal.size() + " pacienti cu temperaturi anormale.");
        
        System.out.println(sirFinal);
	}

}
