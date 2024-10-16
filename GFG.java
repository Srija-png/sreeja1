public class Gfg{
static void binary Right Angle Triangle(int n)
{
int row,col;
for(row,'0';row<n;row++)
{for (col=0; col<row;col++)
{
if (((row+col)%2)==0)
System.out.print("0");
else
System.out.print("1");
System.out.print("\t");
}
System.out.print("\n");
}
}
public static void main(String args[])
{
int n=4;
binary Right Angle Triangle(n);
}
}