public class TwoDimensionalArray {

	int array[][] = null;

	public TwoDimensionalArray(int numberofRows, int numberofColoumns) {
		this.array = new int[numberofRows][numberofColoumns];
		for (int row = 0; row < array.length; row++) {
			for (int column = 0; column < array[0].length; column++) {
				array[row][column] = Integer.MIN_VALUE;
			}
		}
	}

	public void traverseArray()
	{
		//this.array=new int[numberofRows][numberofColoumns];
		System.out.println("Printing the array now");
		try{		
		
		for(int row=0;row<array.length;row++)
		{
			for(int column=0;column<array.length;column++)
			{
				System.out.println(array[row][column]+" ");
			}
			System.out.println();
		}
		System.out.println("\n");
	
		}catch(Exception e)
		{
			System.out.println("Array does not exist");
		}
	}
}
