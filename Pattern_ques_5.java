class Pattern_ques_5
{
 public static void main(String args[])
 {
  int i,j,k,c;
  for(i=1;i<=7;i++)
  {
   k=i;
   c=6;
   for(j=1;j<=i;j++)
   {
    System.out.print((char)(64+k)+" ");
    k=k+c;
    c--;
   }
   System.out.println("");
  }
 }
}