class pattern_assi2_que_4
{
 public static void main(String args[])
  {
    int i,j;
     int ch=65;
    for(i=0;i<=6;i++)
    {
     for(j=i;j<=6;j++)
      {
      System.out.print((char)(ch+j)+" ");
	  }
      for(j=5;j>=i;j--)
		{
      System.out.print((char)(ch+j)+" ");
		}
       
      
     System.out.println("");
      
    }
   
  } 
}