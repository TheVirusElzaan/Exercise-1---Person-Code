//33757550 - Elzaan Bosch

public class Person implements Comparable<Person>
{
	private string id;
	private string name;
	private string email;
	private  Address address;
	
	public Person()
	{
		this("00000000","","",new Address());
	}
	
	public Person(String id, String name, String email, Address address)
	{
		setId(id);
		setName(name);
		setEmail(email);
		setAddress(address);
	}
	
	public void setId(String id)
	{
		this.id = id;
	}
	
	public void setName(String newName)
	{
		this.name = new fullName(newName);
	}
	
	public void setEmail(String email)
	{
		this.email = email;
	}
	
	public void setAddress(Address newAddress)
	{
		this.address = newAddress;
	}
	
	public String getId()
	{
			return id;
	}
	
	public String getName()
	{
		return name;
	}
	
	public String getEmail()
	{
		return email;
	}
	
	public Address getAddress()
	{
		return address;
	}
	
	public string toString()
	{
		return "Person ID is: " + getId() + ", Person name is: " + getName().getFull() + ", Person email is: " + getEmail();
	}
	
	public static void main(String[] args)
	{
		Address firstAddress = new Addresses("My Res, Potchefstroom");
		Person firstPerson = new Person("33757550", "Elzaan,S,Bosch", "elzaanNWU@gmail.com", firstAddress);
		System.out.println("Address: " + firstAddress);
		System.out.println("Name of Person: " + firstPerson.getName());
		System.out.println("Address: " + firstAddress.getAddress().getAddress());
	}
}