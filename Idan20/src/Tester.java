
public class Tester {

	public static void main(String[] args) {
		Address addIdan = new Address("Israel", "Zikhron", "Hertzel" , 67);
		Student idan = new Student("JBMD", 100, "Idan Benayoun", 21, addIdan);
		
		Address addBella = addIdan;
		Student bella = new Student("JBMD", 0, "Bella Perel", 20, addBella);
		
		System.out.println(bella.toString());
		System.out.println(idan.toString());
	}

}
