package Activity0616;

public class MyActivity24 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] myarr = {2, 10, 5, 6, 10, 4, 78, 65, 10, 1};

		printIntArray(myarr);

		int count = 0;

		for (int i : myarr)
		{
			if (i == 10)
			{
				count++;
			}
		}

		if (count == 0)
		{
			System.out.println("there is no 10");
		}
		else if (count == 3)
		{
			System.out.println("the sum of 10 is exactly 30");
		}
		else
		{
			System.out.println("the sum of 10 is not 30");
		}
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
