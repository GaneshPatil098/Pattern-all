class Pattern_ques_10
{
 public static void main(String args[])
 {
  int i,j;
  int ch=64;
 for(i=1;i<=7;i++)
  {
   for(j=1;j<=i;j++)
   {
    System.out.print((char)(ch+j)+" ");
   }
   System.out.println("");
  }
  for(i=6;i>=1;i--)
  {
   for(j=1;j<=i;j++)
   {
    System.out.print((char)(ch+j)+" ");
   }
    System.out.println("");
  }
 }
}