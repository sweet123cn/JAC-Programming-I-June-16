package Activity0616;

import java.util.ArrayList;
import java.util.TreeSet;

public class MyActivity35 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] myarr = {2, 6 ,4, 1, 7, 9, 8, 5, 3, 10};

		System.out.println("the original array is :");

		printIntArray(myarr);

		int[] resarr = new int[myarr.length];

		TreeSet<Integer> myTreeSet = new TreeSet<Integer>();

		for (int i : myarr)
		{
			myTreeSet.add(i);
		}

		System.out.println("the TreeSet is (sorted):");

		printTreeSet(myTreeSet);

		ArrayList<Integer> mylist = new ArrayList<Integer>(myTreeSet);

		System.out.println("the ArrarList is :");

		printArrayList(mylist);

		int temp;

		for (int i =0; i <= (mylist.size()-1)/2; i++)
		{
			temp = mylist.size()-1-i;
			resarr[2*i] = mylist.get(temp);

			if ((2*i+1) < mylist.size())
			{
				resarr[2*i+1] = mylist.get(i);
			}
			else
			{
				break;
			}
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

	public static void printTreeSet(TreeSet<Integer> myTreeSet)
	{
		for(int j : myTreeSet)
		{
			System.out.print(j + " ");
		}
		System.out.println();
	}

	public static void printArrayList(ArrayList<Integer> mylist)
	{
		for(int j : mylist)
		{
			System.out.print(j + " ");
		}
		System.out.println();
	}

}
