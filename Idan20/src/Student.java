
public class Student extends Person {
	private String schoolName;
	private int grade;
	public Student(String schoolName, int grade, String FullName, int age, Address address) {
		super(FullName, age, address);
		this.schoolName = schoolName;
		this.grade = grade;
		
		
	}
	public String getSchoolName() {
		return schoolName;
	}
	public void setSchoolName(String schoolName) {
		this.schoolName = schoolName;
	}
	public int getGrade() {
		return grade;
	}
	public void setGrade(int grade) {
		this.grade = grade;
	}
	@Override
	public String toString() {
		return "Student [schoolName=" + schoolName + ", grade=" + grade + ", address=" + address + ", getSchoolName()="
				+ getSchoolName() + ", getGrade()=" + getGrade() + ", getFullName()=" + getFullName() + ", getAge()="
				+ getAge() + "]";
	}
	
	
	
	
	/*@Override
	public String toString() {
		return getFullName() + " schoolName:"  + schoolName +  ", grade=" + grade + " Age: "
	+ getAge() +" Address: "+ getAddress().getCountry() + ","+  getAddress().getCity() +
	","+  getAddress().getStreet()+ ","+  getAddress().getHouseNum();
	}
*/
		
	
	
}
