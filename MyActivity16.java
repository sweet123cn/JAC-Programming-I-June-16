package Activity0616;

import java.util.Random;
import java.util.Scanner;

public class MyActivity16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner kb = new Scanner(System.in);

		System.out.println("please input the row of matrix");
		int row = kb.nextInt();

		while (row <= 0)
		{
			System.out.println("row of matrix error, please input size of row:");
			row = kb.nextInt();
		}

		System.out.println("please input the column of matrix");
		int column = kb.nextInt();

		while (column <= 0)
		{
			System.out.println("column of matrix error, please input size of column:");
			column = kb.nextInt();
		}
 
		int radonRange = 100; //random number range:0-99
		
		
		int[][] mymatrix1 = randomIntMatrix(row, column, radonRange);
		int[][] mymatrix2 = randomIntMatrix(row, column, radonRange);

		int[][] resultMatrix= new int[row][column];

		addMatrix(mymatrix1, mymatrix2, resultMatrix );

		System.out.println("=======add result Matrix=======");
		printIntMatrix( resultMatrix );

		kb.close();
	}

	public static int[][] randomIntMatrix(int row,int column, int range)
	{
		System.out.println("=======generate random Matrix=======");

		Random rand = new Random();

		int[][] mymatrix =new int[row][column];

		for ( int i = 0; i < row; i++)
		{
			for (int j = 0; j < column; j++)
			{
				mymatrix[i][j] = rand.nextInt(range);
			}
			
		}

		printIntMatrix( mymatrix );

		return mymatrix;

	}

	public static void printIntMatrix( int[][] matrix )
	{
		for (int[] row : matrix) 
		{
            for (int element : row) {
                System.out.printf("%3d ", element);
            }
            System.out.println();
        }

		System.out.println();
	}

	public static void addMatrix( int[][] matrix1, int[][] matrix2, int[][] resultMatrix )
	{
		if ( ( matrix1.length != matrix2.length ) || ( matrix1[0].length != matrix2[0].length ) )
		{
			System.out.println("matrix1 and matrix2 size are not equal");
		}

		for (int i =0; i < resultMatrix.length; i++ ) 
		{
            for (int j = 0; j < resultMatrix[0].length; j++ ) 
			{
                resultMatrix[i][j] = matrix1[i][j] + matrix2[i][j];
            }
        }

	}

}
