class pattern_assi2_que_3
{
 public static void main(String args[])
  {
    int i,j;
     int ch=65;
    for(i=0;i<=6;i++)
    {
     for(j=6;j>i;j--)
      {
      System.out.print((char)(ch+j)+" ");
	  }
      for(j=0;j<=i;j++)
		{
      System.out.print((char)(ch+i)+" ");
		}
       
      
     System.out.println("");
      
    }
   
  } 
}