class Pattern_assi5_que_4

{
 public static void main(String args[])
  {
	int i,j;
    for(i=1;i<=8;i++)
     {	
	   for(j=1;j<=i;j++)
        {      
         System.out.print("*");
        }
         System.out.println();
	 }
      for(i=8;i>=1;i--)
      {
 		for(j=1;j<i;j++)
         {
        System.out.print("*");
         }
         
       System.out.println();
     }
  }
}