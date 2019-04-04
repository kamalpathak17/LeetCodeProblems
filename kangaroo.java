package HackerRank;

public class kangaroo {

	 static String kangaroo(int x1, int v1, int x2, int v2) {
		 int jump=0;
         int value1=0;
         int value2=0;
         boolean flag=false;
         while(jump!=10000)
         {
             value1=x1+v1;
             x1=value1;
             
             value2=x2+v2;
             x2=value2;
             if(value1==value2)
             {
                 flag=true;
                 break;
             }
             jump++;
         }
     if (flag==true)
     {
       return "YES";  
     }
     else{
         return "NO";
     }
	        
	    }
	public static void main(String[] args) {
		kangaroo k=new kangaroo();
		String abc=k.kangaroo(2081, 8403, 9107, 8400);
		System.out.println(abc);
	}

}
