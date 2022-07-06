/* 7 6 5 4 3 2 1 
   6 5 4 3 2 1
   5 4 3 2 1
   4 3 2 1
   3 2 1
   2 1
   1  */
class pattern_110
{
 public static void main(String args[])
  {
   int i,j;
   for(i=7;i>=1;i--)
   {
    
    for(j=i;j>=1;j--)
    {
     System.out.print(j+" ");
    }
    System.out.println( );
   }
    
   
     
  }
}