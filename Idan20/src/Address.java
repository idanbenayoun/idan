
public class Address {
	private String Country;
	private String City;
	private String Street;
	private int houseNum;
	
	public Address(String Country , String City ,String Street, int houseNum){
		this.Country = Country;
		this.City = City;
		this.Street = Street;
		this.houseNum = houseNum;
		
	}

	public String getCountry() {
		return Country;
	}

	public void setCountry(String country) {
		Country = country;
	}

	public String getCity() {
		return City;
	}

	public void setCity(String city) {
		City = city;
	}

	public String getStreet() {
		return Street;
	}

	public void setStreet(String street) {
		Street = street;
	}

	public int getHouseNum() {
		return houseNum;
	}

	public void setHouseNum(int houseNum) {
		this.houseNum = houseNum;
	}

	@Override
	public String toString() {
		return "Address [Country=" + Country + ", City=" + City + ", Street=" + Street + ", houseNum=" + houseNum + "]";
	}

	
}
