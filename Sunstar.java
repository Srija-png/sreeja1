abstract class Sunstar{
abstract void printlnfo();
}
class Employee extends Sunstar{
void printlnfo()
{
String name = "mythri";
int age = 21;
float salary = 222.2f;
System.out.println(name);
System.out.println(age);
System.out.println(salary);
}
}
class Base{
public static void main(String[]args)
{
Sunstar S = new Employee();
S.printlnfo();
}
}