package practice;

public class Ramuda {
	public static void main(String args[]) {
		InterfaceTest it = (name,n) -> {
			return "Hello" + name + n + "!";
		};
		System.out.println(it.method("java", 57));

	}

}
