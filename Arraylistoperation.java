package LeetCode;

import java.util.ArrayList;

public class Arraylistoperation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> a=new ArrayList<Integer>();
		ArrayList<Integer> b=new ArrayList<Integer>();
		a.add(17);
		a.add(28);
		a.add(30);
		b.add(99);
		b.add(16);
		b.add(8);

		int  result[];
		result=new int[2];
	
		for(int i=0;i<a.size();i++)
		{
			if (a.get(i)>b.get(i))
			{
				result[0]=result[0]+1;
			}
			else if(a.get(i)<b.get(i))
			{
				result[1]=result[1]+1;
			}
		}
		for(int j=0;j<result.length;j++)
		{
			System.out.println(result[j]);
		}
			}

}
