class Ass2q13
{
    public static void main(String args[])
     {
	  char ch='A';
      for(int i=1;i<=5;i++)
	{  			  

	   int k=i%2;
	   for(int j=5;j>=i;j--)
	      {
	        System.out.print(" ");
	      }
	   for(int j=1;j<=i;j++)
	      {
	      if(k==1)
		System.out.print(ch+" ");
	      else
		System.out.print(ch+" ");
	      } 
		  ch++;
	   System.out.println(" ");
	}
     
     }
}