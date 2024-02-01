import java.util.Scanner;
class SumOfPrimeNUmbersInRange 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);

		System.out.println("Enter start");
		int start=sc.nextInt();

		System.out.println("Enter end");
		int end=sc.nextInt();
		
		System.out.println("The prime numbers in given range are");
		int sum=0;
		while (start<=end)
		{
			int deno;
			for (deno=2;deno<=start ;deno++ )
			{
				if (start%deno==0)
				{
					break;
				}
			}
			if(start==deno)
			{
				System.out.println(deno);
				sum+=deno;
			}
			start++;
		}

		System.out.println("The sum of prime numbers in this range is "+sum);

		int i;
	for (i=2;i<=sum ;i++ )
	{
		if (sum%i==0)
		{
			break;
		}
	}
	if (sum==i)
	{
		System.out.println("The sum of prime numbers "+ sum +" is prime" );
	}
	else
	{
		System.out.println("The sum of prime numbers "+ sum +" is not  prime" );
	}
	}
		
	
}
