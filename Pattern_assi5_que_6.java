class Pattern_assi5_que_6

{
 public static void main(String args[])
  {
	int i,j;
    for(i=1;i<=6;i++)
     {	
	   for(j=1;j<=i;j++)
        { 
         if(i==1 || i==6 || j==1 || j==i)     
         System.out.print("*");
         else
         System.out.print(" ");
        }
         System.out.println();
	 }
     
  }
}