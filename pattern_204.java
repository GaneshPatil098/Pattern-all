class pattern_204
 {
  public static void main(String args[])
  {
   int i,j;
   int k=0;
    for(i=1;i<=7;i++)
    {
     for(j=i;j<=(k+7);j++)
     {
      if(j%2!=0) 
      {
      System.out.print("1");
       }
      else
      {
       System.out.print("0");
      }
     }k++;
     System.out.println(" ");
    }
  }
 }