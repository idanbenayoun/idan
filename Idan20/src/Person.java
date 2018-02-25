
public class Person {
	 private String FullName;
	 private int age;
	 protected Address address;

	 public Person (String FullName, int age, Address address){
		 this.setFullName(FullName);
		 this.age = age;
		 this.address = address;
		 
		 
	 }

	public String getFullName() {
		return FullName;
	}

	public void setFullName(String fullName) {
		FullName = fullName;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

}


