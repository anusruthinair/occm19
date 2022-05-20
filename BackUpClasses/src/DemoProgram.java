
public class DemoProgram {
	public static void main(String[] args) {
		int row=5;
		int count=row*2-1;
		for(int i=1;i<=row;i++)
		{
			for(int j=1;j<=count;j++)
				
			{
				if(i==j || i+j==row*2)
				{
					System.out.print(i);
				}
				else
				{
					System.out.print(" ");
				}
				
			}
			System.out.println();
		}
	}
}
