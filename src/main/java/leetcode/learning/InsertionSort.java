package leetcode.learning;

public class InsertionSort {

	public static void main(String[] args) {

		int [] num = {3,8,2,9,5,1};
		print(sort(num));

	}
	
	private static int[] sort(int[] num) {
		
		for(int i = 0 ; i<num.length-1;i++)
		{
			for(int j=i+1;j>0;j--)
			{
				if(num[j]<num[j-1])
				{
					swap(num,j,j-1);
				}
				
//				print(num);
//				System.out.println();
			}
		}
		
		return num;
		
	}
	
	
	private static void swap(int[] num, int a, int b)
	{
		int temp = num[b];
		num[b] = num[a];
		num[a] = temp;
	}
	
	private static void print(int[] num)
	{
		for(int number : num)
		{
			System.out.print(number+" ");
		}
	}

}
