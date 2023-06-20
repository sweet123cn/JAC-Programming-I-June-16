package Activity0616;

import java.util.Random;
import java.util.Scanner;


public class MyActivity01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner kb = new Scanner(System.in);
		double avg = 0;

		System.out.println("please input the size of array?");
		int size = kb.nextInt();

		while (size <= 0)
		{
			System.out.println("Array size error, please input size of array:");
			size = kb.nextInt();
		}

		double sum= 0.0;

		int[] myarr = new int[size];

		Random rand = new Random();

		for ( int i = 0; i < size; i++)
		{
			myarr[i] = rand.nextInt(100);

			sum = sum + myarr[i];

			System.out.print(myarr[i] + " ");

		}

		System.out.println();

		avg = sum / size;

		System.out.printf("the average of the array is %.3f" , avg );

		kb.close();
		
	}

}
