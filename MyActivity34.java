package Activity0616;

import java.util.ArrayList;

public class MyActivity34 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] myarr = {2, -6 ,4, -1, -7, 6, -4, 8, 5, -3};

		System.out.println("the original array is :");

		printIntArray(myarr);

		int[] resarr = new int[myarr.length];

		ArrayList<Integer> negativeArray = new ArrayList<Integer>();

		ArrayList<Integer> positiveArray = new ArrayList<Integer>();

		for (int i : myarr)
		{
			if ( i > 0 )
			{
				positiveArray.add(i);
			}
			else if ( i < 0 )
			{
				negativeArray.add(i);
			}
		}

		for (int j = 0 ; j < positiveArray.size(); j ++ )
		{
			resarr[j] = positiveArray.get(j);
		}
		for (int j = 0 ; j < negativeArray.size(); j ++ )
		{
			resarr[j+positiveArray.size()] = negativeArray.get(j);
		}

		System.out.println("the result array is :");

		printIntArray(resarr);
	}

	public static void printIntArray(int[] myarray)
	{
		for (int j : myarray )
		{
			System.out.print(j + " ");
		}
		System.out.println();
	} 

}
