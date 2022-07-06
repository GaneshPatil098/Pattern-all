class pattern_q_1
{
  public static void main(String args[])
  {
    int i,j;
    int ch;
	for(i=0;i<=6;i++)
    {
     ch=65;
		for(j=0;j<=i;j++)
      {
 		System.out.print((char)(ch+j)+" ");
      }
      System.out.println(" ");
    }
  }
}