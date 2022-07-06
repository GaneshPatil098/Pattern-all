class Pattern_j
{
 public static void main(String args[])
 {
  int i,j;
  for(i=1;i<=5;i++)
  {
    for(j=1;j<i;j++)
   {
    System.out.print(" ");
   }
   for(j=i;j<=5-1;j++)
    {
   System.out.print("*");
    }
   System.out.println("");
  }
  for(i=5-1;i>=1;i--)
  {
   for(j=1;j<i;j++)
    {
    System.out.print(" ");
    }
   for(j=i;j<=i-1;j++)
   {
    System.out.println("*");
   }
   System.out.println("");
  }
 }
}