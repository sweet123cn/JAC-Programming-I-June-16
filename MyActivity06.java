package Activity0616;

import java.util.Random;
import java.util.Scanner;

public class MyActivity06 {

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

		System.out.println("please input the number you want to insert:");
		int num = kb.nextInt();

		System.out.println("please input the location you want to insert [1-" + (size+1) +"]:");
		int location = kb.nextInt();

		while (location < 1 || location > size + 1 )
		{
			System.out.println("location error: please input the location you want to insert [1-" + (size+1) +"]:");
			location = kb.nextInt();
		}

		int[] myarr2 = insertIntArray(myarr1, num, location);

		System.out.println("=======after insert array,size = " + myarr2.length + " =======");
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

	public static int[] insertIntArray(int[] sourceArray, int number, int location)
	{
		int[] tempArray = new int[sourceArray.length+1];

		int i = 0;

		if (location == 1) //insert into the tempArray[0]
		{
			tempArray[0] = number;
		}
		else
		{
			for ( i = 0 ; i < location-1; i++)
			{
				tempArray[i] = sourceArray[i];
			}

			tempArray[i] = number;
		}

		

		for ( i = location-1 ; i < sourceArray.length; i++)
		{
			tempArray[i+1] = sourceArray[i];
		}

		return tempArray;

	}

}
