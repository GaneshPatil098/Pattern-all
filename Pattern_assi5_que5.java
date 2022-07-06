class Pattern_assi5_que5

{
 public static void main(String args[])
  {
	int i,j;
    for(i=1;i<=15;i++)
     {	
	   for(j=1;j<=6;j++)
       {
           if (i==1 || i==8||i==15||j==1||j==6)
        {       
        System.out.print("*");
         }
        else
        {System.out.print(" ");
        }
       }
       System.out.println();
   }
  }
}