package Reverse_String;

import java.util.Scanner;

public class ReverseStringCharrArry {

	public static void main(String[] args) {
		
		//Using Iterator method by changing String to Char Array

				Scanner sc= new Scanner(System.in);
				System.out.println("Enter the String");
				String str= sc.nextLine();
				
				char[] strArray= str.toCharArray();
				for(int i=str.length()-1;i>=0;i--)
				{
					System.out.print(strArray[i]);
				}
				
			
	}

}
