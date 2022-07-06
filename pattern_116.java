/* Question no.15
    1010101
    0101010
    1010101
    0101010
    1010101
    0101010
    1010101 */


class pattern_116
{
 public static void main(String args[])
  {
   int i,j;
   int d=0;
    for(i=1;i<=7;i++)
      {
      for(j=i;j<=d+7;j++)
        
       if(j%2==0){
        System.out.print("0");
        }
      else{
      System.out.print("1");
         }
d++;
       System.out.println(" ");
     
      }
  }
}  