//This program is to take an array as input and check which index value is even or odd.
/*
e.g:-
a:[22.56.44.23.76.89.65.78.11.34.565.78]--> Given array
here 22 is even
23 is odd. Like this
*/

package problem;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayProgram {
    public static void main(String[] args) {
        //Created the array by giving values from Console itself.
        System.out.println("Enter the size of an array");
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        System.out.println("Enter the values for an array");
        int[] a = getArray(n,scan);
        scan.close();
        int[] even = checkEvenValues(a,n);  //For checking and getting even values
        System.out.println("\n");
        int[] odd = checkOddValues(a,n);    //For checking and getting odd values
        System.out.println("\n");

        //After sorting
        System.out.println("Even array that is created and sorted is : ");
        printArray(even);
        System.out.println("Odd array that is created and sorted is : ");
        printArray(odd);
    }

    public static int[] getArray(int n, Scanner scan) {
        int[] array = new int[n];
        for (int i = 0; i < n; i++)
        {
            array[i] = scan.nextInt();
        }
        return array;
    }

    public static void printArray(int[] array) {
        Arrays.sort(array);
        for (int i = 0; i < array.length; i++)
        {
            if (array[i] != 0)
            {
                System.out.print(array[i] + "  ");
            }
        }
        System.out.println("\n");
    }

    public static int[] checkOddValues(int[] a, int n) {
        int[] odd = new int[n];
        System.out.println("Odd values present in the array are listed below : ");
        for (int i = 0; i < a.length; i++)
        {
            if(a[i] % 2 != 0)
            {
                System.out.print(a[i]+ "  ");
                odd[i] = a[i];
            }
        }
        return odd;
    }

    public static int[] checkEvenValues(int[] a, int n) {
        int[] even = new int[n];
        System.out.println("Even values present in the array are listed below : ");
        for (int i = 0; i < a.length; i++)
        {
            if(a[i] % 2 == 0)
            {
                System.out.print(a[i]+ "  ");
                even[i] = a[i];
            }
        }
        return even;
    }
}
