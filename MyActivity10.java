package Activity0616;

import java.util.Arrays;
import java.util.Scanner;

public class MyActivity10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[]  stringArray = {"jke", "weoid", "893e", "45ei", "eir", "dei", "ieks","iewk"};

		System.out.println(Arrays.toString(stringArray));

		Scanner kb = new Scanner(System.in);

		System.out.println("please input the string:");
		String str = kb.next();

		boolean flag = false;

		for (int i = 0; i < stringArray.length; i++)
		{
			if ( str.equals(stringArray[i]) )
			{
				System.out.println("string:" + str + " is duplicate in String Array");
				flag = true;
			}
		}

		if (flag == false)
		{
			System.out.println("string:" + str + " is not duplicate in String Array");
		}

		kb.close();
	}

}
