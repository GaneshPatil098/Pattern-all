class pattern_assi_que_8
{
 public static void main(String args[])
 {
  int i,j;
  for(i=6;i>=1;i--)
  {
   for(j=1;j<=i;j++)
    {
     System.out.print("*");
    }
    for(j=i-1;j<=i;i++)
     {
      System.out.print("#");
     }
    System.out.println("");
  }
 } 
}