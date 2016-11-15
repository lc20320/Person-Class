/**
 * 
 * Luis Cervantes <br>
 * 11/14/16 <br>
 * Person class with methods and constructors 
 *
 */

public class Person {
	private String name;
	private int age;
	
	
	/**
	 * Person class constructor with name and age
	 */
	
	public Person() {
		name = "Bill";
		age = 20;
	}
	
	/**
	 * Constructing a new person with provided values from name and age parameters
	 * @param name the name of person
	 * @param age he age of person
	 */
	
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	/**
	 * 
	 * @return gets the name of the person
	 */
	
	public String getName() {
		return name;
	}
	
	/**
	 * 
	 * @param name sets the name of the person
	 */
	
	public void setName(String name) {
		this.name = name;
	}
	
	/**
	 * 
	 * @return gets the age of the person
	 */
	
	public int getAge () {
		return age;
	}
	
	/**
	 * 
	 * @param age returns the age of the person
	 */
	
	public void setAge(int age) {
		this.age = age;
	}
	
	/**
	 * Return a name and age of a person
	 */
	
	public String toString() {
		return this.name + "  " + this.age;
	}	
}
