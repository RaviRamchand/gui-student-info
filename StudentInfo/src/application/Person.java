package application;

//Implement Comparable interface here, because sorting by name -> field in Person class
public abstract class Person implements Comparable<Person>{
	protected String _fullName;
	protected String _address;

	
  public Person(String newName, String newAddress){
	_fullName = newName;
	_address = newAddress;	
  }

  @Override
  public String toString(){
   return (_fullName+ " "+ _address);
  }
  public abstract String currentStatus();

  public abstract int compareTo(Person p);
  
}