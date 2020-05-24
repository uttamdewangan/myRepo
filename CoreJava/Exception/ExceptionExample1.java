package Exception;

import java.util.Scanner;

public class ExceptionExample1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
			Scanner scanner = null;
			System.out.println("Main method start..");
			try {
				scanner = new Scanner(System.in);
					
				System.out.println("Enter Dividend number:");
				int dividend = scanner.nextInt();
					
				System.out.println("Enter Divisor number:");
				int divisor = scanner.nextInt();
					
				int result = dividend/divisor;
					
				System.out.println("Result is:"+result);
				} catch (Exception e) {
					e.printStackTrace();
				}finally {
					if(scanner != null)
						scanner.close();
				}
				System.out.println("Main method end..");
			}

	

}
