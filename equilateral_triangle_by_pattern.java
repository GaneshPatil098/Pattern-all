import java.util.*;
class equilateral_triangle_by_pattern
 {
  public static void main(String args[])
  {
   int i,j;
   for(i=1;i<=6;i++)
   {
    for(j=i;j<=6;j++)
    System.out.print("  ");
    
    for(j=1;j<=i;j++)
    System.out.print("* ");
   
    for(j=1;j<i;j++)
    System.out.print("* ");


    System.out.println();
   }
  }
 }