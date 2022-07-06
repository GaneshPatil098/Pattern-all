/* 1 2 3 4 5 6 7
   1 2 3 4 5 6
   1 2 3 4 5
   1 2 3 4
   1 2 3
   1 2
   1  
   1 2 
   1 2 3 
   1 2 3 4 
   1 2 3 4 5
   1 2 3 4 5 6   
   1 2 3 4 5 6 7   */
class pattern_114
{
 public static void main(String args[])
  {
   int i,j;
   for(i=7;i>=1;i--)
   { 
     for(j=1;j<=i;j++)
      {
       System.out.print(j+" ");
       }
       System.out.println(" ");
    }
          
        for(i=2;i<=7;i++)
           {
            for(j=1;j<=i;j++)
            {
            System.out.print(j+" ");
           }
           System.out.println(" ");
          
          }
     
  }
}