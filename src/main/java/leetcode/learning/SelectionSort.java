package leetcode.learning;

public class SelectionSort {

	public static void main(String[] args) {
		
		int [] num = {3,8,2,5,1,7,0};
		
		print(sort(num));

	}

	private static int[] sort(int[] num) {
		
		for(int i = 0 ; i<num.length-1;i++)
		{
			for(int j = 0; j<num.length-1;j++)
			{
				if(num[j+1]<num[j])
				{
					swap(num,j,j+1);
				}
				
				print(num);
				System.out.println();
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
