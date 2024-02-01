import java.util.Scanner;
class CheckEveryDigit 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a num");
		int num=sc.nextInt();

		while (num!=0)
		{
			int last=num%10;
			
			int deno;
			for (deno=2;deno<=last ;deno++ )
			{
				if (last%deno==0)
				{
					break;
				}
			}
			if (last==deno)
			{
				System.out.println(+last+" is prime");
			}

			else
			{
				System.out.println(+last+" is not prime");
			}
			
			num=num/10;
		}


	}
}
