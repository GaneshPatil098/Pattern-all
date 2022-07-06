class Pattern_ques_6
{
 public static void main(String args[])
 {
  int i,j;
  int ch=64;
 for(i=1;i<=7;i++)
  {
   for(j=7;j>=i;j--)
   {
    System.out.print(" ");
   }
   for(j=1;j<=i;j++)
  {
   System.out.print((char)(ch+j)+" ");
  }
   System.out.println("");
  }
  for(i=1;i<=7;i++)
  {
   for(j=0;j<=i;j++)
   {
    System.out.print(" ");
   }
   for(j=1;j<8-i;j++)
   {
    System.out.print((char)(ch+j)+" ");
   }
    System.out.println("");
  }
 }
}