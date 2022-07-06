/* 7 6 5 4 3 2 1 
   7 6 5 4 3 2 
   7 6 5 4 3
   7 6 5 4
   7 6 5 
   7 6 
   7  */
class pattern_108
{
 public static void main(String args[])
  {
   int i,j;
   for(i=1;i<=7;i++)
   {
    
    for(j=7;j>=i;j--)
    {
     System.out.print(j+" ");
    }
    System.out.println(" ");
   }
    
   
     
  }
}