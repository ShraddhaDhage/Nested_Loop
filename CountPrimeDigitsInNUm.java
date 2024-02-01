import java.util.Scanner;
class  CountPrimeDigitsInNUm
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a num");
		int num=sc.nextInt();
		
		System.out.println("Prime digits in given number are:");
		int count=0;
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
				System.out.println(deno);
				count++;
			}

			num/=10;
		}
		System.out.println("The count of prime digits in entered number is "+count);
	}
}
