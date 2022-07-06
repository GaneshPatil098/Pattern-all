class Pattern_ques_13
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
   for(j=i;j>=1;j--)
   {
    System.out.print((char)(ch+j)+" ");
   }
   for(j=2;j<=i;j++)
   {
    System.out.print((char)(ch+j)+" ");
   }
    System.out.println("");
  }
 }
}