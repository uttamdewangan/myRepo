
public class Game {
	
	public static int solution(int N, int K) {
        // write your code in Java SE 8
        int[] arr=new int[K];
        int i=0;
        int n=N;
        while(K>0 && n>2)
        {
            //int chance=N/2;
            
            arr[i]=n/2;
            n=arr[i++];
            K--;
            
        }
        
        int chances=0;
         n=1;
        i=K-1;
        while(n <= N)
        {
            
            if(n!=arr[i])
            {
                chances++;
                n++;
            }else if(i>=0 && n==arr[i]){
                n=n*2;
                chances++;
                i--;
            }
            
        }
        return chances; 
    }





	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		int g= solution(10,10); 
		System.out.println(""+g);
		    

}}
