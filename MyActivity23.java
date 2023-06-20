package Activity0616;

public class MyActivity23 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] myarr = {2, 3, 5, 6, 9, 4, 78, 65, 41, 1};

		printIntArray(myarr);

		boolean flag = true;

		for (int i : myarr)
		{
			if (i ==0 || i == -1)
			{
				flag = false;
			}
		}

		if (flag)
		{
			System.out.println("the array is without 0 and -1");
		}
		else
		{
			System.out.println("the array include 0 or -1");
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
