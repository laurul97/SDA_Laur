package Lab4_Problema3;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int [] arr =  new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        System.out.println("Numar din jumatatea din stanga, pe pozitie para: " + searchInt(arr, 3));
        System.out.println("Numar din jumatatea din stanga, pe pozitie impara: " + searchInt(arr, 4));

        System.out.println("Numar din jumatatea din dreapta, pe pozitie para: " + searchInt(arr, 7));
        System.out.println("Numar din jumatatea din dreapta, pe pozitie impara: " + searchInt(arr, 8));

        System.out.println("Numar din mijlocul sirului: " + searchInt(arr, 5));

        System.out.println("Primul numar: " + searchInt(arr, 1));
        System.out.println("Ultimul numar: " + searchInt(arr, 10));

        System.out.println("Numar inexistent: " + searchInt(arr, 13));

    }

    static boolean searchInt (int[] intArr, int toBeSearched) {
        int left = 0, right = intArr.length - 1;

        while(left <= right)
        {
            int i = (left + right) / 2;
            if(intArr[i] == toBeSearched)
            {
                return true;
            }
            if(intArr[i] > toBeSearched)
                right = i - 1;
            if(intArr[i] < toBeSearched)
                left = i + 1;
        }
        return false;
    }
}