class Pattern_ques_15
{
 public static void main(String args[])
 {
  int i,j;
  int ch=64;
 for(i=1;i<=8;i++)
  {
   for(j=8;j>=i;j--)
   {
    System.out.print(" ");
   } 
   for(j=1;j<=i;j++)
   {
    System.out.print((char)(ch+i)+"");
   }
   /*for(j=2;j<=i;j++)
   {
    System.out.print((char)(ch+j)+" ");
   }*/
    System.out.println("");
  }
 }
}