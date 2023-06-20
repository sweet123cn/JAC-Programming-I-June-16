package Activity0616;

import java.util.Random;
import java.util.Scanner;

public class MyActivity36 {

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
 
		int radonRange = 2; //random number range:0-1

		int[] myarr1 = randomIntArray(size, radonRange);
		int[] resarr = new int[myarr1.length];

	
		int count1=0;
		int count2=myarr1.length-1;

		for (int i =0; i < myarr1.length; i++)
		{

			if (myarr1[i] == 0)
			{
				resarr[count1] = 0;
				count1++;
			}
			else if (myarr1[i] == 1)
			{
				resarr[count2] = 1;
				count2--;
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
