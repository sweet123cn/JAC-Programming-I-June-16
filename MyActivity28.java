package Activity0616;

import java.util.HashSet;

public class MyActivity28 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] myarr = {1, 3, 2, 7, 5, 4, 9, 8, 6};

		HashSet<Integer> numSet = new HashSet<>();

 
		for (int i :myarr)
		{
			numSet.add(i);
		}

		int targetNum = 8;

		System.out.println("when target num = " + targetNum);

		for ( int num : myarr)
		{
			if (numSet.contains(targetNum - num) && (num != (targetNum-num)))
			{
				System.out.println("find element:" + num + " and " + (targetNum-num));
				
				numSet.remove(num);
				numSet.remove(targetNum- num);

			}

		}

	}

}
