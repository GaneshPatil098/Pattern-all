class pattern_assi3_qes_7
{
 public static void main(String args[])
  {
	int i,j;
    int ch=97,ch1=98; 
    for(i=0;i<=3;i++)
    {
     for(j=1;j<=i;j++)
     {
      System.out.print("*");
     }
     for(j=3;j>=i;i--)
      {
     System.out.print((char)(ch));
      }
     for(j=4;j>=i;j--)
     {
      System.out.print((char)ch1); 
     }
     for(j=i;j<=4;j++)
    {
     System.out.print((char)ch);
    }
   System.out.println("");
   }
  }
}
