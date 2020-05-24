
public class Fabonacci {

	int first = 0;
	int next = 1;
	int sum = 0;

	public void getWithOutRecursive(int febNo) {
		System.out.print(first + "   " + next);

		while(sum < febNo) {
			sum = first + next;
			first = next;
			next = sum;
			System.out.print("   " + sum);
		}
	}
	
	public int getWithRecursive(int febNo) {
		System.out.print(first + "   " + next);

		if(febNo==1 || febNo==2)
			return febNo-1;
		else
			return getWithRecursive(febNo-1)+getWithRecursive(febNo-2);
	}

	/*
	 * getWithoutRecursive() {
	 * 
	 * }
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Fabonacci f = new Fabonacci();
		//f.getWithOutRecursive(15);
		f.getWithRecursive(15);
	}

}
