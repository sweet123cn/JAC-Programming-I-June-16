package Activity0616;

import java.util.HashSet;

public class MyActivity27 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] myarr = {49, 1, 3, 200, 2, 4, 70, 50};

		HashSet<Integer> numSet = new HashSet<>();

		for (int i :myarr)
		{
			numSet.add(i);
		}

		int longestLength = 0;
		int curNum = 0;
		int curLength = 0;

		for (int num : myarr)
		{
			if (!numSet.contains(num - 1))
			{
				curNum = num;
				curLength  = 1;

				while (numSet.contains(curNum + 1))
				{
					curNum++;
					curLength++;
				}
				
				longestLength = Math.max(curLength,longestLength);
			}

		}

		System.out.println("the length of longest consecutive sequence = " + longestLength);

	}

}
