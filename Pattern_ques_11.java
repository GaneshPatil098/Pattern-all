class Pattern_ques_11
{
 public static void main(String args[])
 {
  int i,j;
  int ch=64;
 for(i=7;i>=1;i--)
  {
   for(j=i;j>=1;j--)
   {
    System.out.print((char)(ch+j)+" ");
   }
   System.out.println("");
  }
  for(i=1;i<=7;i++)
  {
   for(j=i;j>=1;j--)
   {
    System.out.print((char)(ch+j)+" ");
   }
    System.out.println("");
  }
 }
}