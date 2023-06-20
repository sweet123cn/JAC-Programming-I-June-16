package Activity0616;

import java.util.Random;
import java.util.Scanner;

public class MyActivity02 {

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


		int i = 0; 
		boolean flag = false;
		int[] myarr = new int[size];

		Random rand = new Random();

		System.out.println("=======random array=======");

		for ( i = 0; i < size; i++)
		{
			myarr[i] = rand.nextInt(100);

			System.out.printf("%2d ",myarr[i]);

			if ( (i+1) %10 == 0)
			{
				System.out.println();
			}

		}

		System.out.println();

		System.out.println("please input the number you want to search:");
		int num = kb.nextInt();

		for ( i = 0; i < myarr.length; i++)
		{
			if (num == myarr[i])
			{
				System.out.println("the num " + num + " founded");
				flag = true;
			}
		}

		if (flag == false)
		{
			System.out.println("the num not founded");
		}

		kb.close();
	}

}
