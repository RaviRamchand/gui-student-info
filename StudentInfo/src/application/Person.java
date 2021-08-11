package application;

public abstract class Person
{
	private String _fullName;
	private String _address;

	
  public Person(String newName, String newAddress)
  {
	_fullName = newName;
	_address = newAddress;
	
  }

  @Override
  public String toString(){
   return (_fullName+ " "+ _address);
  }
  public abstract String currentStatus();

  
}