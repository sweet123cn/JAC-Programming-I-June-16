package Activity0616;

import java.util.Random;
import java.util.Scanner;

public class MyActivity20 {

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

		int countEven = 0;
		int countOdd = 0;
		String even = "even number = ";
		String odd = "odd number = ";

		for (int i = 0; i < myarr1.length; i++)
		{
			if (myarr1[i] %2 == 0)
			{
				countEven++;
				even = even + myarr1[i] + " ";	
			}
			else
			{
				countOdd++;
				odd = odd + myarr1[i] + " ";
			}
		}

		System.out.println(even);
		System.out.println("even count = " + countEven);

		System.out.println(odd);
		System.out.println("odd count = " + countOdd);

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
