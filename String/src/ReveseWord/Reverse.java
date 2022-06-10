package ReveseWord;


public class Reverse {
	
	public static void reverse(char[] strarr,int start,int end)
	{
		char temp;
		while(start <= end)
		{
			temp = strarr[start];
			strarr[start] = strarr[end];
			strarr[end] = temp;
			start++;
			end--;
		}
	}

	public static void reverseWord(char[] strarr, int start, int end) //Words From String Are divided into words on the bases of the Space.
	{
		int Wstart,Wend;
		for(Wstart = Wend = start;Wend<end;Wend++)
		{
			
			if(strarr[Wend] == ' ')//when loop is iterated till space and then will convert that as first 
			{
				continue;
			}
			Wstart = Wend;
			while(strarr[Wend] != ' ' && Wend <end)
			{
				Wend++;
			}
			if(Wend !=end)//to exclude space in first World
			{
				Wend--;
			}
			reverse(strarr,Wstart,Wend);//Reverse a character
		}
		
	}
		
}
