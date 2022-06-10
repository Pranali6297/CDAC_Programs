//Given Sorted Array And number x,find the pair in array whose sum is closest to x.

package ArraySum;
 
public class Array {

	public static void main(String[] args) {
		
		int resi = 0,resj = 0;
		int arr[] = {20,25,30,40,65,80,100,120};
		
		int x = 54;
		
		int sum = arr[0]+arr[1];
		int diff = Math.abs(sum-x);
		
		for(int i = 0;i<arr.length-1;i++)
		{
			for(int j =i+1;j<arr.length;j++)
			{ 
				sum = arr[i]+arr[j];
				if((Math.abs(sum-x)) < diff)
				{	resi = i;
					resj = j;
					diff = Math.abs(sum-x);
				}
			}
		}
		
		System.out.println("The Difference Between Two Pairs "+arr[resi]+" and "+arr[resj]+" is nearest to the given number i.e = "+x);

	}

}