public class Bitwise
{
public static void main (String args[])
{
int num1=-13,num2=86,num3=0;
System.out.println("num1 & num2="+(num1 & num2));
System.out.println("num1 | num2="+(num1 | num2));
System.out.println("num1 ^ num2="+(num1 ^ num2));
System.out.println("~num1="+~num1);
num3=num1<<2;
System.out.println("num1<<1="+num3);
num3=num1>>2;
System.out.println("num1>>1="+num3);
num3=num1>>>2;
System.out.println("num1>>>1="+num3);
}
}
