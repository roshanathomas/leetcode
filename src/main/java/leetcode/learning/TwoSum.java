package leetcode.learning;
import java.util.ArrayList;
import java.util.List;

 
public class TwoSum {
	
	public static void main(String[] args)
	{
		int []l1 = {2,4,3};
		int []l2 = {3,6,9};
		addTwoNumbers(l1,l2);
		
	}
    public static void addTwoNumbers(int[] l1, int[] l2) {
        
        int carry = 0;
        List<Integer>result = new ArrayList<>();
        int i = 0;
        int j = 0;
        
        while(i<l1.length && j<l2.length)
        {
        	int sum = l1[i]+l2[j]+carry;
        	
        	if(sum>9)
        	{
        		carry = 1;
        		sum =sum%10;
        	}
        	else
        		carry = 0;
        	
        	result.add(sum);
        	
        	i++;
        	j++;
        }
        
        if(carry>0)
        	result.add(carry);
        
        System.out.println(result);
        
    }
}
