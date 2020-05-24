
public class Smallest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr[]={25,11,7,45,56,2,6,12};
		int smallest =arr[0];
		for(int i=1;i<arr.length;i++)
		{
			if(smallest>arr[i])
			{
				smallest=arr[i];
			}		
			
		}
		System.out.println("--"+smallest);
	}

}
