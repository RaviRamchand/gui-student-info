package application;

public class Student extends Person{
	//Field variables
	private double _gpa;	
	
	//Constructors 
	public Student(String newName, String newAddress, double gpa) {
		super(newName, newAddress);
		this._gpa = gpa;
	}	
	
	//Return toString method from Person class with gpa added
	@Override
	public String toString() {
		return super.toString() +" " +this._gpa;
	}
	
	//Implement the abstract method in the Person class
	public String currentStatus() {
		return "Student";
	}
	
	public int compareTo(Person p) {
		return this._fullName.compareTo(p._fullName);
	}
	
	
	//End of Student class
}
