class pattern_que_10
{
  public static void main(String args[])
  {
    int i,j;
    int ch=65;
	for(i=6;i>=0;i--)
    { 
      
	  for(j=0;j<=i;j++)
		{
		 System.out.print(" ");
       }
       for(j=i;j<=6;j++)

        {
         System.out.print((char)(65+j)+" ");
		} 
       
		System.out.println(" ");
	}
  }
}