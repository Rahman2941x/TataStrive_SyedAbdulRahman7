package day2;

public class StudentMain {

	public static void main(String[] args) {
		Student st = new Student();
		st.setName("Rahman");
		st.setGrade(79.50);
		System.out.println(st);
		
		System.out.println();
		
		Student st1 = new Student();
		st1.setName("Syed Abdul");
		st1.setGrade(81.50);
		System.out.println(st1);
	}
}
