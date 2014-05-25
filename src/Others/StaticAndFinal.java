package Others;

class Thing {

	public static final int LUCKY_NUMBER = 7;

	public String name;
	public static String description;

	public static int count = 0;
	public int Id;

	public Thing() {
		Id = count;
		count++;
	}

	public void showNameAndId() {
		System.out.println("Object Id: " + Id + ", " + description + ": "
				+ name);
	}

	public static void showInfo() {
		System.out.println(description);
	}

}

public class StaticAndFinal {

	public static void main(String[] args) {

		Thing.description = "I'm a thing!";

		Thing.showInfo();

		System.out.println("Before: " + Thing.count);

		Thing thing1 = new Thing();
		Thing thing2 = new Thing();

		System.out.println("After: " + Thing.count);

		thing1.name = "Idiot";
		thing2.name = "Selqnin";

		thing1.showNameAndId();
		thing2.showNameAndId();

		System.out.println(Math.PI);
		
		System.out.println("The lucky number is: " + Thing.LUCKY_NUMBER);

	}

}
