import java.util.*;
 class duplicate
{    
    static void mostrepeat(String s)
    {
    	char[] str=s.toCharArray();    	    	  
    	int leng= s.length()-1;     	
    	int prev=0;char c=' ';
    	while(leng>=0)
    	{    		
    		int temp=0;
    		for(int i=0;i<=leng;i++)
    		{
    			if(str[leng]==str[i])
    				temp++;    				
    		}
    		if(temp>prev)
    		{
    			prev=temp;
    			c=str[leng];
    		}
    		leng--;
    	}
    	System.out.println(c);
    }
    public static void main (String[] args) 
    {
    	Scanner sn = new Scanner(System.in);
    	String s = sn.nextLine();
    	mostrepeat(s);
    }
}
