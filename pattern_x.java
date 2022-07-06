class pattern_x
{
 public static void main(String args[])
  {
   int i,j,k;
   for(i=1;i<7+1;i++)
    {
     for(j=i;j<7+1;j++)
     {
      System.out.print(j+" ");
     }
     for(k=1;k<i;k++)
     {
       System.out.print(k+" ");	
     }
     System.out.println(" ");
    }
  }
}