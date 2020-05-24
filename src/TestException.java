import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;


public class TestException {

	static void readFile() throws Exception
	{
		File file = new File("C:\\Users\\pankaj\\Desktop\\test.txt"); 
		  
		  BufferedReader br = new BufferedReader(new FileReader(file));
		  
		 throw new Exception("sd");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
			//readFile();
	}

}
