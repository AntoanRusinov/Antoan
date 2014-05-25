package Others;

class Person {

	String name;
	int age;
	boolean isMale;
	int salary;

	void talk() {
		System.out.println(name + " is talking!");
	}

	void sing() {
		System.out.println(name + "is singing!" + " Lalalalalalalalala!");
	}

	public void setSalary(int salary) {
		System.out.println("I get " + salary + " salary");
	}

	public int getSalary(){
		return salary;
	}

	void sayGender() {
		if (isMale == false) {
			System.out.println("I am woman");
		} else {
			System.out.println("I am a man");
		}
	}

}

public class DemoMethods {
	public static void main(String[] args) {

		Person person1 = new Person();
		person1.name = "Stefan Vadev";
		person1.age = 88;
		person1.salary = 1100;
		person1.isMale = false;

		person1.talk();
		person1.sing();
		person1.sayGender();

		Person person2 = new Person();
		person2.name = "Rusinov Antoan";
		person2.age = 23;
		person2.isMale = true;
		person2.salary = 1100;

		person2.talk();
		person2.sing();
		person2.sayGender();
		person2.setSalary(1500);
		person2.getSalary();
		
	}
}
