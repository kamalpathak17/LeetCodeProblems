package LeetCode;

public class TwodimensionalArrayOperation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[][] arr=new int[][]{
			{1,2,3},
			{4,5,6},
			{1,8,9}	
	};
	int d1=0;
	int d2=0;
	//Left to Right Diagonal
	for(int i=0;i<3;i++)
	{
		for(int j=0;j<3;j++)
		{
			if(i==j)
			{
			d1=d1+arr[i][j];
			}
		}
	}
	System.out.println("Sum of left to right diagonal:"+d1);
	
	//Right to Left Diagonal
	for(int i=0;i<3;i++)
	{
		for(int j=2;j>=0;j--)
		{
			if(i+2==j)
			{
				d2=d2+arr[i][j];
			}
 			else if(i==j)
			{
				d2=d2+arr[i][j];
			}
			else if(i-2==j)
			{
				d2=d2+arr[i][j];
			}
		}
	}
	System.out.println("Sum of right to left diagonal:"+d2);
	
	System.out.println("Absolute Difference ::"+(d1-d2));
	}
	
}
