package Activity0616;

public class MyActivity26 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] myarr = {2, 10, 5, 77, 10, 65, 78, 33, 10, 2, 65, 77};

		int[]  resarr = myarr.clone();

		printIntArray(myarr);

		int[] duplciateArray = findDuplicateIntArray(myarr);

		System.out.println("======== duplicate array =========");
		printIntArray(duplciateArray);

		for (int i = 0; i < duplciateArray.length; i++)
		{
			if(duplciateArray[i] >= 2)
			{
				resarr = removeIntArray(resarr, myarr[i]);

				
			}

		}

		System.out.println("======== result array =========");
		printIntArray(resarr);
		System.out.println("result array length = " + resarr.length);


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

	public static int[] findDuplicateIntArray(int[] myArray)
	{
		int[] duplicate = new int[myArray.length];

		int count = 0;

		for (int i = 0; i < myArray.length; i++ )
		{
			for (int j : myArray)
			{
				if (myArray[i] == j)
				{
					count++;
				}
			}

			duplicate[i] = count;
			count = 0;
		}

		return duplicate;
	}

	public static int[] removeIntArray(int[] sourceArray,int delNum)
	{
		int repeatCount = 0, duplicateCount = 0;
		int i, index;
		index = 0;

		for ( i = 0; i < sourceArray.length; i++)  //if the element exits in the array, and count times
		{
			if (delNum == sourceArray[i])
			{
				duplicateCount++;
			}
			
		}

		int[] destinationArray = new int[sourceArray.length - duplicateCount + 1];

		for (  i = 0; i < sourceArray.length; i++)
		{
			if (sourceArray[i] == delNum && repeatCount == 0)
			{
				
				destinationArray[index] = sourceArray[i];
				index++;
				repeatCount++;
			}
			if (sourceArray[i] != delNum)
			{
				destinationArray[index] = sourceArray[i];
				index++;
			}
		}
		
		return destinationArray;

	}

}
