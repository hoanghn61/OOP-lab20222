package oop_lap1;
import java.util.Scanner;

public class AddTwoMatrix {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Number of matrix rows is: ");
		int rows = sc.nextInt();
		System.out.print("Number of matrix column is: ");
		int cols = sc.nextInt();
		
		int[][] firstMatrix = new int[rows][cols];
		int[][] secondMatrix = new int[rows][cols];
		int[][] sumMatrix = new int[rows][cols];
		
		System.out.print("Enter the first matrix: ");
		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < cols; j++) {
				firstMatrix[i][j] = sc.nextInt();
				
				
			}
		}
		System.out.print("Enter the second matrix: ");
		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < cols; j++) {
				secondMatrix[i][j] = sc.nextInt();
				
			}
		}
		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < cols; j++) {
				sumMatrix[i][j] = firstMatrix[i][j] + secondMatrix[i][j];
				
			}
		}
		System.out.println("The sum matrix: ");
        for (int i = 0; i < rows; i++){
            for (int j = 0; j < cols; j++){
                System.out.print(sumMatrix[i][j] + " ");
            }
               System.out.println();
		
        }
	}
}
