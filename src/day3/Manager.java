package day3;

public class Manager extends Developer{

	
	private String Dept;
	
	public Manager() {
		
	}
	
	public Manager(String Dept,String ProgLang,int Experience,String name,int Id,double Salary) {
		super(ProgLang, Experience, name, Id, Salary);
		this.Dept=Dept;
	}
	
	
	@Override
	public void displayInfo()  {
		super.displayInfo();
		System.out.println("Department: "+ Dept);
	}
	 
}
