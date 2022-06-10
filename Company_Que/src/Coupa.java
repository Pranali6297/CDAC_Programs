
public class Coupa {

	public static void main(String[] args) {
		
		int arr[] = {12,43,23,56,51,67,24,78};
		
		int count = 1,
		max = arr[0];
		
		for(int i=1;i<arr.length;i++)
		{
			if(arr[i] > max)
			{
				count = count +1;
				max = arr[i];
				System.out.println(arr[i]+" ");
			}
			
		}
		System.out.println("No of Building we can throw ball from : "+count);
	}

}
