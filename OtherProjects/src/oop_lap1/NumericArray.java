package oop_lap1;
import java.util.Arrays;
import java.util.Scanner;
public class NumericArray {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your array size: ");
		int n = sc.nextInt();
		System.out.println("the elements of your array is: ");
		int[] arr = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}	
		
		for (int i = 0; i < n; i++) {
			
		}
		Arrays.sort(arr);
		System.out.print("\nThe sorted array is: ");
		for ( int i : arr) {
			System.out.print(i + " ");
		
		}
		int sum = 0;
		for ( int i = 0; i < n; i++) {
			sum +=arr[i];
		}
		double avg = sum/n;
		System.out.println("\nThe sum of this array is: " + sum);
		System.out.println("\nthe avarage of this array is: " + avg);
		
		

	}

}
