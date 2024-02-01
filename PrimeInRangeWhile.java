import java.util.Scanner;
class PrimeInRangeWhile
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter start");
		int start=sc.nextInt();

		System.out.println("enter end");
		int end=sc.nextInt();

		int den;
		while (start<=end)
		{
			for (den=2; den<start ; den++ )
			{
				if(start%den==0)
				{
					break;
				}
			}

			if(den==start)
			{
				System.out.println(start);
			}
				
			
			start++;
		}
		
	}
}
