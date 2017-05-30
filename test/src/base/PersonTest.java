package base;

public class PersonTest {

	public static void main(String[] args) {
		new Person();
		Object object = new Object();
		int code = object.hashCode();
		System.out.println(code);
		String string1 = "aaa";
		String string2 = string1;
		System.out.println(string1);
		System.out.println(string2);
		string1 = "bbb";
		System.out.println(string1);
		System.out.println(string2);
	}

}
