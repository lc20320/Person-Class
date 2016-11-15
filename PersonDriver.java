/**
 * 
 * @author lc20320
 * 11/14/16
 * Test program to use Person class
 *
 */

public class PersonDriver {
	
	public static void main(String [] args) {
		Person Ted = new Person();
		Person Bill = new Person();
		
		System.out.println(Ted);
		
		Ted.setName("Ted");
		
		Ted.setAge(30);
		
		System.out.println(Ted.getName() + "  " + Ted.getAge());
		
		if (Bill.getName().equals(Ted.getName())) {
			System.out.println("Name Match");
		}
		
		if (Bill.getAge() == Ted.getAge()) {
			System.out.println("Age Match");
		}
		
		if ((Bill.getAge() == Ted.getAge()) && (Bill.getName().equals(Ted.getName()))) {
			System.out.println("Name and age match! Most excellent!");
		}
		
		if (Bill.getAge() > Ted.getAge()) {
			System.out.println("Bill is older");
		}
		
		if (Bill.getAge() < Ted.getAge()) {
			System.out.println("Ted is Older");
		}
		
		else System.out.println("Does not match");
	}
}
