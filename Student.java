
public abstract class Student{
	String name;
	double GPA;
	int year;
	
	//constructor three parameters
	public Student(String name, double GPA, int year) {
		this.name = name;
		this.GPA  = GPA;
		this.year = year;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getGPA() {
		return this.GPA;
	}

	public void setGPA(double GPA) {
		this.GPA = GPA;
	}

	public int getYear() {
		return this.year;
	}

	public void setYear(int year) {
		this.year = year;
	}
	
	//constructor freshman
	public Student(String name) {
		this.name = name;
		this.year = 0;
		this.GPA = 4.0;
	}
	
	abstract boolean readyToGraduate();
	

		
	

}