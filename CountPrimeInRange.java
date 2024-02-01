import java.util.Scanner;
class CountPrimeInRange 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter start");
		int start=sc.nextInt();

		System.out.println("Enter end");
		int end=sc.nextInt();
		
		System.out.println("Prime numbers in entered range are");
		int count=0;
		while(start<=end)
		{
			int deno;
			for (deno=2;deno<=start ;deno++ )
			{
				if(start%deno==0)
				{
					break;
				}

			}
			if(start==deno)
			{
				System.out.println(deno);
				count++;
			}
			start++;
		}
		System.out.println("count of prime numbers in given range is "+count);

	}
}
