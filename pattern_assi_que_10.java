class pattern_assi_que_10
{
 public static void main(String args[])
  {
    int i,j,k=1;
    for(i=1;i<=4;i++)
    {
     for(j=1;j<=4;j++)
    {
     if(j==k)
      {
      System.out.print("1");
	  }
      else
		{
      System.out.print("0");
		}
    }
     k++;
     System.out.println("");
      
    }
   
  } 
}