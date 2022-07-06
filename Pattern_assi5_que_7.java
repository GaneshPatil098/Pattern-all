class Pattern_assi5_que_7

{
 public static void main(String args[])
  {
	int i,j;
    for(i=1;i<=7;i++)
     {	
	   for(j=1;j<=7;j++)
        { 
         if((i+j==5) || (i+j==11) || (j-i==3) || (i-j==3))     
         System.out.print("*");
         else
         System.out.print(" ");
        }
         System.out.println();
	 }
     
  }
}