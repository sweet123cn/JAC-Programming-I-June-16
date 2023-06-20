package Activity0616;

public class MyActivity25 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] myarr = {2, 10, 5, 77, 10, 65, 78, 33, 10, 1, 65, 77};

		printIntArray(myarr);

		int count_65 = 0;
		int count_77 = 0;

		for (int i : myarr)
		{
			if (i == 65)
			{
				count_65++;
			}
			else if (i == 77)
			{
				count_77++;
			}
		}

		
		System.out.println("65 count = " + count_65);
		System.out.println("77 count = " + count_77);

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
