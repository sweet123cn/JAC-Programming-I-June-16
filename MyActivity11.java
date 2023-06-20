package Activity0616;

import java.util.Arrays;

public class MyActivity11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[]  strArray1 = {"jke", "weoid", "893e", "45ei", "eir", "dei", "ieks","iewk"};

		String[]  strArray2 = {"jkc", "djie", "ield", "3ie", "389d", "eir" };

		System.out.println(Arrays.toString(strArray1));
		System.out.println(Arrays.toString(strArray2));

		boolean flag = false;

		for (int i = 0; i < strArray1.length; i++)
		{
			
			for (int j = 0 ; j < strArray2.length; j++)
			{
				if ( strArray2[j].equals(strArray1[i]) )
				{
					System.out.println("string:" + strArray2[j] + " is common elements in two String Array");
					flag = true;
				}
			}
		}

		if (flag == false)
		{
			System.out.println("There is no common elements in two String Array");
		}

	}

}
