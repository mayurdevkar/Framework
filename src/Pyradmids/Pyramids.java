package Pyradmids;

import java.util.Scanner;

public class Pyramids {

	public static void main(String[] args) {
		// 
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of Rows in the Pyramids");
		int row= sc.nextInt();
		int rowcount=1;
		
		for(int i=row;i>0;i--)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print(" ");
			}
			
			for(int j=1;j<=rowcount;j++)
			{
				System.out.print(rowcount+ " ");
			}
			System.out.println();
			rowcount++;
		}
	}

}
