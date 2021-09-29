//subclass of student
public class Phd extends Student{

	//two extra attributes for Phd
	private String advisor;
	private int numberOfPapersPublished;
	
	//CONSTRUCTOR
	public Phd(String name, double GPA, int year, String advisor, int numberOfPapersPublished) {
		//super - from parent class of student
		super(name,GPA,year);
		this.advisor 				 = advisor;
		this.numberOfPapersPublished = numberOfPapersPublished;
	}
	
	//getters and setters
	public String getAdvisor() {
		return this.advisor;
	}


	public void setAdvisor(String advisor) {
		this.advisor = advisor;
	}


	public int getNumberOfPapersPublished() {
		return this.numberOfPapersPublished;
	}


	public void setNumberOfPapersPublished(int numberOfPapersPublished) {
		this.numberOfPapersPublished = numberOfPapersPublished;
	}

	//implement abstract method
	public boolean readyToGraduate() {
		if (this.numberOfPapersPublished > 20 && this.year > 5) {
			return true;
		}
		return false;
	}
	
	//main - create instances
	public static void main(String[] args) {
		Phd m = new Phd("Joe", 3.8, 4, "Dr. Furry", 23);
		System.out.println(m.readyToGraduate());

		Phd n = new Phd("Hannah", 4.0, 5, "Dr. Elaine", 8);
		n.setNumberOfPapersPublished(23);
		n.setYear(6);
		System.out.println(n.readyToGraduate());
	
		System.out.println(n instanceof Phd);//true
		System.out.println(n instanceof Student);

		
		
	}
}
