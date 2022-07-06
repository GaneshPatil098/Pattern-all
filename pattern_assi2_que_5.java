class pattern_assi2_que_5
{
 public static void main(String args[])
  {
    int i,j,k=0;
     int ch=65;
    for(i=0;i<=6;i++)
    {
     for(j=0;j<=i;j++)
      {
      System.out.print((char)(ch+i+k)+" ");
       
	  }
      /*for(j=5;j>=i;j--)
		{
      System.out.print((char)(ch+j)+" ");
		}*/
       
      k=k+6;
     System.out.println("");
      
    }
  // k=k+6;
  } 
}