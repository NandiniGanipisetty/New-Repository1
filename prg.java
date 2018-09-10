import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Ideoneclass
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
	int s1, s2, s3, flag = 0, i, j;
         Scanner s = new Scanner(System.in);
          
         s1 = s.nextInt();
         
         s2 = s.nextInt();
         
         for(i = s1; i < s2; i++)
         {
             for( j = 2; j < i; j++)
             {
                 if(i % j == 0)
                 {
                     flag = 0;
                     break;
                 }
                 else
                 {
                     flag = 1;
                 }
             }
             if(flag == 1)
             {
                 System.out.println(i);
             
}
}
}
}
