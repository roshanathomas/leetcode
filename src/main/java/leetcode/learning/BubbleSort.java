package leetcode.learning;

public class BubbleSort {

	public static void main(String[] args) {
		
		int [] num = {3,8,2,9,5,1};
		print(sort(num));

	}
	
	
	private static int[] sort(int[] num) {
		
		for(int i = 0 ; i<num.length-1;i++)
		{
			boolean swapped = false;
			for(int j = num.length-1;j>i;j--)
			{
				if(num[j]<num[j-1])
				{
					swap(num,j,j-1);
					swapped = true;
				}
				print(num);
				System.out.println();
			}
			
			if(!swapped)
				break;
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
