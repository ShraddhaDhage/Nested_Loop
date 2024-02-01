import java.util.Scanner;
class AlternatePrime 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);

		System.out.println("Enter start");
		int start=sc.nextInt();

		System.out.println("Enter end");
		int end=sc.nextInt();
		
		System.out.println("Alternate Prime Numbers in given range are:");
		int count=0;
		while(start<=end)
		{
			int deno;
			for(deno=2;deno<=start;deno++)
			{
				if(start%deno==0)
				{
					break;
				}

			}
			if(start==deno)
				{
					count++;
					if (count%2==1)
					{
						System.out.println(deno);
					}
				}

			start++;
		}
	}
}
