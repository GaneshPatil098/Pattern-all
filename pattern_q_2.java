class pattern_q_2
{
  public static void main(String args[])
  {
    int i,j;
    int ch;
	for(i=6;i>=0;i--)
    {
     ch=65;
		for(j=6;j>=i;j--)
      {
 		System.out.print((char)(ch+j)+" ");
      }
      System.out.println(" ");
    }
  }
}