package Activity0616;

public class MyActivity31 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[]  myarr = {1, 2, 3, 4, 5, 6, 7, 8, 9};

		System.out.print("the original array is : ");
		for (int j : myarr )
		{
			System.out.print(j + " ");
		}
		System.out.println();

		int[] rotatearr = new int[myarr.length];

		for (int i = myarr.length-1; i >= 0; i--)
		{
			if (i == myarr.length-1)
			{
				rotatearr[0] = myarr[i];
			}
			else
			{
				rotatearr[i+1] =myarr[i];
			}
		}

		System.out.print("the rotated array is : ");
		for (int j : rotatearr )
		{
			System.out.print(j + " ");
		}
		System.out.println();
	}

}
