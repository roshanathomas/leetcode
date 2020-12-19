package leetcode.learning;

public class MergeSort {

	public static void main(String[] args) {
		
		int [] num = {3,8,2,9,5,1,45,34,21,11,67};
		mergeSort(num);

	}

	private static void mergeSort(int[] num) {
		
		if(num.length == 1)
			return;
		
		int mid = num.length/2+num.length%2;
		int[] leftArray = new int[mid];
		int[] rightArray = new int[num.length-mid];
		
		split(num,leftArray,rightArray,mid);
		
//		print(leftArray);
//		print(rightArray);
		
		mergeSort(leftArray);
		mergeSort(rightArray);
		
		merge(num,leftArray,rightArray);
		print(num);
		
		
	}
	
	private static void merge(int[] num, int[] leftArray, int[] rightArray) {

		int i = 0;
		int j = 0;
		int k = 0;
		
		while(i<leftArray.length && j<rightArray.length)
		{
			if(leftArray[i]<rightArray[j])
			{
				num[k] = leftArray[i];
				i++;
			}
			else
			{
				num[k] = rightArray[j];
				j++;
			}
			
			k++;
			
		}
		
		while(i<leftArray.length)
		{
			num[k] = leftArray[i];
			k++;i++;
		}
		
		while(j<rightArray.length)
		{
			num[k] = rightArray[j];
			k++;j++;
		}
	}

	private static void split(int[] num, int[] leftArray, int[] rightArray,int mid) {
		
		for(int i = 0 ;i<num.length;i++)
		{
			if(i<mid)
			{
				leftArray[i] = num[i];
			}
			else
			{
				rightArray[i-mid] = num[i];
			}
		}
		
	}

	
	private static void print(int[] num)
	{
		for(int number : num)
		{
			System.out.print(number+",");
		}
		System.out.println();
	}

}
