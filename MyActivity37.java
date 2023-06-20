package Activity0616;

import java.util.Random;
import java.util.Scanner;

public class MyActivity37 {

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
		int[] resarr = new int[myarr1.length];
	
		
		int count=0;
	
		for (int i =0; i < myarr1.length; i++)
		{
	
			if (myarr1[i]%2 == 0)
			{
				resarr[count] = myarr1[i];
				count++;
			}
		}

		for (int i =0; i < myarr1.length; i++)
		{
	
			if (myarr1[i]%2 != 0)
			{
				resarr[count] = myarr1[i];
				count++;
			}
		}

		System.out.println("=======result array=======");
	
		printIntArray( resarr );
	
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

