package leetcode.learning;
public class CombineArrayOfNumbers {

	public static void main(String[] args) {

		int [] num = {5,2,0,3,4};
		
		makeItSingleDigitNumber(num);
	}

	private static void makeItSingleDigitNumber(int[] num) {
		
		int i = 0;
		int result = 0;
		
		while(i<num.length)
		{
			result = result*10 + num[i];
			i++;
		}
		
		
		System.out.println(result);
	}

}
