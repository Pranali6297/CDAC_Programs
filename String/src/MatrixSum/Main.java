package MatrixSum;

import java.util.Scanner;

public class Main {

		public static void main(String[] args) 
		{
			int[][] arr = new int [][]{{1,1,1,4,5,6,7,8},{1,1,1,5,6,7,8,9},{1,1,1,6,5,4,3,2},{8,7,6,5,4,3,2,1},{1,2,3,4,6,7,8,9},{9,8,7,6,4,3,2,1}};

			int row = 6; 
			int column = 8;


			for (int i=0; i<row;i++) 
			{
				for (int j=0; j<column; j++)
				{
					System.out.print(arr[i][j]+"   ");
				}
				System.out.println();
			}


			int max = 0;
			int sum = 0;
			int resi=0;
			int resj=0;
			int starti=0;
			int startj=0;


			for( starti=0; starti<=row-3; starti++)
			{
				startj=0;
				for (startj=0; startj<=column-3; startj++) 
				{
					sum = 0;
					for (int i = starti; i<starti+3;i++) 
					{
						for (int j = startj;j<startj+3;j++) 
						{
							if(i==starti || j==startj || i==starti+2 || j==startj+2)
							{
								sum += arr[i][j];
							}
						}

					}
					if(max < sum)
					{
						System.out.println("("+starti+","+startj+")");
						System.out.println(sum);
						max = sum;
						resi = starti;
						resj = startj;	
					}
				}

			}

			System.out.println("Array of 3X3 with highest sum is :");
			for (int i=resi; i<resi+3; i++) 
			{
				for (int j=resj; j<resj+3; j++) 
				{
					System.out.print(arr[i][j]+"   ");
				}
				System.out.println();

			}

		}


	}