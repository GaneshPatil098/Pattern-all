class Pattern_assi5_que3

{
 public static void main(String args[])
  {
	int i,j;
    for(i=1;i<=8;i++)
     {
       if(i==1 || i==8)	
	   for(j=1;j<=8;j++)
       {
       System.out.print("*");
       }
       else
       {
        for(j=1;j<=6;j++)
        {
         if(j==1 || j==6)
         System.out.print("*");
         else
         System.out.print(" ");
        }
       }
     System.out.println("");
	}
  }
}