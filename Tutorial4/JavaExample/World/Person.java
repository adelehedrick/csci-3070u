package World;

public class Person {

	private String 	name;
	private int	age;

	public void setName(String n) {
		name = n;		
	}

	public void setAge(int a) {
		age = a;	
	}

	public void outputPerson() {
		System.out.println("Name: "+name+" Age: "+age);	
	}

}
