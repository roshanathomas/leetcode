package leetcode.learning;

public class SumRecursive {

	public static void main(String[] args) {
		
		int [] num = {1,2,3,4,5};
		int len = num.length;
		int sum = sum(num,len);
		System.out.println(sum);

	}

	private static int sum(int[] num, int len) {
		
		if(len == 0)
			return 0;
		else
		{
			return num[len-1]+ sum(num,len-1);
		}
		
	}

}
