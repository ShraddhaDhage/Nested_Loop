import java.util.Scanner;
class PrimeInRange 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter start");
		int start=sc.nextInt();

		System.out.println("enter end");
		int end=sc.nextInt();

		int den;
		for(int i=start;i<=end;i++)
		{
			for (den=2;den<i;den++)
			{
				if(i%den==0)
				{
					break;
				}
			}
			if(i==den)
			{
				System.out.println(i);
			}
		}
	}
}
