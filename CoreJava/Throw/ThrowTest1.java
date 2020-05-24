package Throw;

import java.io.IOException;

public class ThrowTest1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//ThrowTest1 throwobj=new ThrowTest1();
		try{
			displayFileContent();
		}catch(IOException ex)
		{		
			System.out.println(ex.getMessage());
			ex.printStackTrace();
		}
	}
	
	public static void displayFileContent() throws IOException
	{
		System.out.println("in display file content method");
		throw new IOException("File I/O exception has occured");
		
	}

}
