package ShallowAndDeepCloning;



public class Address implements Cloneable{

	private int id;
	private String adressLine1;
	private String adressLine2;
	private String city;
	private long zipcode;
	
	
	public Address(int id, String adressLine1, String adressLine2, String city,
			long zipcode) {
		
		this.id = id;
		this.adressLine1 = adressLine1;
		this.adressLine2 = adressLine2;
		this.city = city;
		this.zipcode = zipcode;
	}
	
	
	@Override
	protected Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		return super.clone();
	}


	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getAdressLine1() {
		return adressLine1;
	}
	public void setAdressLine1(String adressLine1) {
		this.adressLine1 = adressLine1;
	}
	public String getAdressLine2() {
		return adressLine2;
	}
	public void setAdressLine2(String adressLine2) {
		this.adressLine2 = adressLine2;
	}
	public String getCity() {
		return city;
	}
	
	public void setCity(String city) {
		this.city = city;
	}
	public long getZipcode() {
		return zipcode;
	}
	public void setZipcode(long zipcode) {
		this.zipcode = zipcode;
	}	
	
	@Override
	public String toString() {
		return "Address [id=" + id + ", adressLine1=" + adressLine1
				+ ", adressLine2=" + adressLine2 + ", city=" + city
				+ ", zipcode=" + zipcode + "]";
	}
	
	
}
