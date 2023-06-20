package Activity0616;

import java.util.Random;
import java.util.Scanner;

public class MyActivity15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner kb = new Scanner(System.in);

		System.out.println("please input the size of array?");
		int size = kb.nextInt();

		while (size <= 0)
		{
			System.out.println("Array size error, please input size of array:");
			size = kb.nextInt();
		}
 
		int radonRange = 100; //random number range:0-99
		int temp, i;
		
		int[] myarr1 = randomIntArray(size, radonRange);

		for ( i = 0 ; i < myarr1.length; i++) //sort
		{
			for (int j = i ; j < myarr1.length; j++)
			{
				if ( myarr1[i] > myarr1[j])
				{
					temp = myarr1[i];
					myarr1[i] = myarr1[j];
					myarr1[j] = temp;
				}
			} 
		}

		printIntArray(myarr1);

		int[] sortResult = new int[myarr1.length];
		sortResult[0] = myarr1[0];
		int count = 0;

		for ( i = 1; i < myarr1.length; i++ )
		{
			if ( sortResult[count] != myarr1[i] )
			{
				count++;
				sortResult[count] = myarr1[i];
			} 
		}

		printIntArray(sortResult);

		System.out.println("the second smallest element is " + sortResult[1]);

		kb.close();
	}

	public static int[] randomIntArray(int size,int range)
	{
		System.out.println("=======generate random array=======");

		Random rand = new Random();

		int[] myarr =new int[size];

		for ( int i = 0; i < size; i++)
		{
			myarr[i] = rand.nextInt(range);
		}

		printIntArray( myarr );

		return myarr;

	}

	public static void printIntArray( int[] arr )
	{
		for ( int i = 0; i < arr.length; i++)
		{
			System.out.printf("%2d ",arr[i]);

			if ( (i+1) %10 == 0)
			{
				System.out.println();
			}

		}

		System.out.println();
	}

}
