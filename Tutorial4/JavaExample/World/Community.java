package World;

public class Community {

	
	public static void main(String args[]) {
		System.out.println("Welcome to the community");

		Person mom = new Person();
		Person dad = new Person();
		Person child1 = new Person();
		Person child2 = new Person();

		mom.setName("Adele");
		mom.setAge(25);
		dad.setName("Ryan");
		dad.setAge(28);
		child1.setName("Jaxon");
		child1.setAge(3);
		child2.setName("Tiberius");
		child2.setAge(0);

		mom.outputPerson();
		dad.outputPerson();
		child1.outputPerson();
		child2.outputPerson();
	}
}

