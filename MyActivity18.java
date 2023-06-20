package Activity0616;

public class MyActivity18 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] array = {1, 2, 4, 7, 3, 6, 10, 9, 8};
		
		int n = array.length + 1;
		int sum = (n * (n + 1)) / 2;
		int sumOfArray = 0;
		
		for (int num : array) 
		{
			sumOfArray += num;
		}

		System.out.println("Missing number: " + (sum - sumOfArray));	
		
	}

}
