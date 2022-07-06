class pattern_assi_que_9
{
 public static void main(String args[])
  {
    int i,j,k=0;
    for(i=1;i<=3;i++)
    {
     for(j=1;j<=i;j++)
    {
      System.out.print(" ");
    }
     for(j=9-k;j>=1;j--)
      {
        System.out.print("*");
      }
      k=k+3;
      System.out.println("");
      
    }
   
  } 
}