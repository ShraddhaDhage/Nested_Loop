import java.util.Scanner;
class MakePrime
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number:");
		int num=sc.nextInt();
		int deno;

		for(deno=2;deno<=num;deno++)
		{
			if(num%deno==0)
			{
				break;
			}
		}
		if (deno==num)
		{
			System.out.println("It is prime");
		}

		else
		{
			
			System.out.println("It is not prime");


			int extra=0;
			int sum=0;

			while (true)
			{
				sum=num+extra;
				int i;
				for (i=2;i<sum ;i++ )
				{

					if (sum%i==0)
					{
						break;

					}
					
					
				}

				

				if (sum!=i)
				{

					extra++;
					
				}

				else
				{
					System.out.println("You need to add "+extra+" to make it prime");
					break;

				}

			}
			
		}
	}
}
