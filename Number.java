import java.util.Scanner;
class Ideone
{
  public static void main (String[] args) throws java.lang.Exception
  {
    	Scanner sc=new Scanner(System.in);
		long number=sc.nextLong();
		if(number>0)
				System.out.println("Positive");
		else if(number<0)
				System.out.println("Negative");
		else
				System.out.println("Zero");
	}
}
