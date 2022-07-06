class pattern_assi3_qes_2
{
 public static void main(String args[])
  {
	int i,j,k=0;
    for(i=0;i<=3;i++)
    {
     for(j=0;j<=i;j++)
     {
      System.out.print(" ");
     }
      for(j=6-k;j>=1;j--)
     {
		System.out.print("1");
     }
     k=k+2;
     System.out.println("");
   }
  }
}