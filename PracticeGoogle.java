package HackerRank;
import java.lang.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Stack;

public class PracticeGoogle {
	
	public int solution(int[] S, int[] E) {
		Arrays.sort(S);
		Arrays.sort(E);
		int guest_cnt=0;
		int final_cnt=0;
		for(int i=0;i<E.length;i++)
		{
			for(int j=0;j<S.length;j++)
			{
				if(E[i]==S[j])
					{
						final_cnt=guest_cnt;
						break;
					}
				else {
					guest_cnt=guest_cnt+1;
				}
			}
			break;
		}
		
		return final_cnt;
		

    }

	public static void main(String[] args) {
		PracticeGoogle pg=new PracticeGoogle();
		int []temp1={1,2,6,5,3};
		int []temp2= {5,5,7,6,8};
		System.out.println(pg.solution(temp1,temp2));


	}

}
