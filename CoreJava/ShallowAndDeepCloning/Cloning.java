package ShallowAndDeepCloning;

public class Cloning {
	
	public static void main(String[] args) throws CloneNotSupportedException {
		ABC obj1=new ABC();
		obj1.i=5;
		obj1.j=6;
		
		ABC obj2=(ABC)obj1.clone();
		obj2.i=8;
		
		System.out.println("--: "+obj1);
		System.out.println("--:"+obj2);	
		
	}

}

class ABC implements Cloneable
{
	int i=0;
	int j=0;
	@Override
	public String toString() {
		return "ABC [i=" + i + ", j=" + j + "]";
	}
	@Override
	protected Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		return super.clone();
	}
	
	
	
	
}
