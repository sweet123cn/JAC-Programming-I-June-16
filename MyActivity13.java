package Activity0616;

import java.util.Random;
import java.util.Scanner;

public class MyActivity13 {

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
		
		int[] myarr1 = randomIntArray(size, radonRange);

		System.out.println("please input the number you want to remove:");
		int num = kb.nextInt();

		int[] myarr2 = removeIntArray(myarr1, num);

		System.out.println("=======final array=======");
		printIntArray( myarr2 );

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
	
	public static int[] removeIntArray(int[] sourceArray,int delNum)
	{
		
		int repeatCount = 0;
		int i, j, index;

		for ( i = 0; i < sourceArray.length; i++)  //if the element exits in the array, and count times
		{
			if (delNum == sourceArray[i])
			{
				System.out.println("the num " + delNum + " founded, index = " + i);
				repeatCount++;
			}
			
		}

		if (repeatCount == 0)
		{
			System.out.println("the number you searched DOESN'T exit");
		}

		int[] destinationArray = new int[sourceArray.length - repeatCount];

		index = 0;

		for (  j = 0; j < sourceArray.length; j++)
		{
			if (sourceArray[j] != delNum)
			{
				destinationArray[index] = sourceArray[j];
				index++;
			}
		}
		
		return destinationArray;

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
