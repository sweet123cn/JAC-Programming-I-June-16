package Activity0616;

import java.util.Random;
import java.util.Scanner;

public class MyActivity22 {

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

		int sum = 0;
		
		for (int i : myarr1)
		{
			sum += i;
		}

		System.out.println("the sum is " + sum);
		System.out.println("the sum except max and min is " + (sum -max-min));

		double avg = 0;

		avg = (sum - max - min) / (double)(myarr1.length-2); 

		System.out.printf("the average except max and min = %.3f %n" , avg);

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
			if (max <= i)
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
			if (min >= i)
			{
				min = i;
			}
		}

		return min;
	}

}