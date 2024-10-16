public class Recursive
{
public static void main(String args[])
{
long nFactorial= factorialprogram(9);
System.out.println(nFactorial);
{
public static long factorialprogram(long n)
{
if (n<=1)
{
return 1;
}
else{
return n*factorialprogram(n-1);
}
}
}