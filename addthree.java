/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{ 
		// your code goes here
		Scanner sc=new Scanner(System.in);
		String input = sc.next();
		for(int i=0;i<input.length();i++)
		{
			System.out.print((char)(input.charAt(i)+3));
			
		}
		
	}
}
