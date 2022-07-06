 class Pattern_I
{
 public static void main(String args[])
 {
  int i,j,x=0,y=3;
  for(i=1;i<=5;i++)
  {
   for(j=5;j>=i;j--)
   {
    System.out.print(" ");
   }
   for(j=i+x;j>=1;j--)
   {
    System.out.print("*");
   }
   x=x+1;
    System.out.println("");
  }
  for(i=4;i>=1;i--)
  {
   for(j=5;j>=i;j--)
   {
    System.out.print(" ");
   }
   for(j=i+y;j>=1;j--)
   {
    System.out.print("*");
   }
   y=y-1;
   System.out.println("");
  }
 }
}