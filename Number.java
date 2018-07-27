import java.util.Scanner;
class Ideone
{
  public static void main (String[] args) throws java.lang.Exception
  {
    	Scanner sc=new Scanner(System.in);
		long number=sc.nextLong();
		if(number>0)
				System.out.println("positive");
		else if(number<0)
				System.out.println("negative");
		else
				System.out.println("zero");
	}
}
