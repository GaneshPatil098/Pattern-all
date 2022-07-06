class pattern_assi2_que_1
{
 public static void main(String args[])
  {
    int i,j,k=5;
     int ch=65;
    for(i=6;i>=0;i--)
    {
     for(j=i-5;j<=0;j++)
      {
      System.out.print(" ");
	  }
      for(j=0;j<=i;j++)
		{
      System.out.print((char)(ch+j)+" ");
		}
    
     k--;
     System.out.println("");
      
    }
   
  } 
}