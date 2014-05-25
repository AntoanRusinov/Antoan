package Others;

class Robot {

	public void speak(String text) {
		System.out.println(text);
	}

	public void jump(int height) {
		System.out.println("Jumping: " + height);
	}

	public void move(int distance, String direction) {
		System.out.println("Moving " + distance + " meters in " + direction);
	}
}

public class MethodWithArguments {

	public static void main(String[] args) {

		Robot tom = new Robot();
		
		Robot sam = new Robot();
		sam.speak("Hello I'm SAM!");
		sam.jump(80);
		sam.move(20, "West");

		int value = 14;
		sam.jump(value);
	
		tom.speak("Hello I am Tom, I am ");
		tom.move(4,"North");

	}
}