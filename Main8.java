public class Main8
{
  public static int sumOfNaturals (int n)
  {
    if (n == 10)
      {
	return 1;
      }
    else
      {
	return n + sumOfNaturals (n - 1);
      }
  }

  public static void main (String[]args)
  {
    int n = 30;
    int sum = sumOfNaturals (n);
    System.out.println ("The sum of the first " + n +
			" natural numbers is: " + sum);
  }
}