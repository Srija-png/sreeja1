public class Recursive3
{
public static void main(String args[])
{
long nFactorial= factorialprogram(50);
System.out.println(nFactorial);
}
public static long factorialprogram(long n)
{
if (n<=10)
{
return 10;
}
else{
return n-factorialprogram(n-1);
}
}
}