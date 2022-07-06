class Pattern_ques_14
{
 public static void main(String args[])
 {
  int i,j,k=1;
  int ch=64;
 for(i=1;i<=7;i++)
  {
   for(j=1;j<=k;j++)
   {
    System.out.print((char)(ch+j)+" ");
   }
   k=k+2; 
    System.out.println("");
  }
 }
}