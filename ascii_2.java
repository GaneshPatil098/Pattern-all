class ascii_2
{
 public static void main(String args[])
  {
   int i,j;
    for(i=84;i>=80;i--)
   {
    for(j=80;j<=i;j++)
     {
      System.out.print((char)j+" ");
      
     }
    System.out.println("");
   }
   
  }
}