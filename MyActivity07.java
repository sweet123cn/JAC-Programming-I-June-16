package Activity0616;

import java.util.Random;
import java.util.Scanner;

public class MyActivity07 {

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

		int max = maxIntArrary(myarr1);

		int min = minIntArrary(myarr1);

		System.out.println("MAX in the array is " + max);

		System.out.println("MIN in the array is " + min);

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

	public static int maxIntArrary(int[] intArray)
	{
		int max = intArray[0];

		for (int i : intArray)
		{
			if (max < i)
			{
				max = i;
			}
		}

		return max;
	}

	public static int minIntArrary(int[] intArray)
	{
		int min = intArray[0];

		for (int i : intArray)
		{
			if (min > i)
			{
				min = i;
			}
		}

		return min;
	}

}
