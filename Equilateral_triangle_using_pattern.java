class Equilateral_triangle_using_pattern
{
public static void main(String args[])
{
int i ,j;
for(i=1;i<=5;i++)
{
       for(j=i;j<=5;j++)
           System.out.print("  ");
        for(j=1;j<=i;j++)
           System.out.print("i ");
        for(j=1;j<i;j++)
           System.out.print("j ");

System.out.println();
}
}
}         