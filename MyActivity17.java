package Activity0616;

public class MyActivity17 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] myarr1 = {1, 2, 3, 4, 5};
		int [] myarr2 = {1, 2, 3, 4, 6};

		boolean flag = true;

		if (myarr1.length == myarr2.length)
		{
			for (int i =0; i < myarr1.length; i++)
			{
				if (myarr1[i] != myarr2[i])
				{
					flag = false;
					break;
				}
			}
		}
		else
		{
			flag = false;
			System.out.println("the size of two array is not equal");
		}

		if (flag == true)
		{
			System.out.println("two array is equal");
		}
		else
		{
			System.out.println("two array is not equal");
		} 

	}

}
