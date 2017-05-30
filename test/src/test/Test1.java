package test;

import java.util.UUID;

public class Test1 {
	public static void main(String[] args) {
		/*String address = "北京市西城区长安街100号";
		System.out.println(address.length());
		int i = address.indexOf("市");
		System.out.println(i);
		String string = address.substring(i+1);
		string =  string.replace("区", "县");
		string =  string.replace("市", "县");
		System.out.println(string);
		int j = string.indexOf("县");
		String string2 = string.substring(0, j);
		System.out.println(string2);*/
		String string = UUID.randomUUID().toString().replaceAll("-", "");
		System.out.println(string);
		String name = "aaaaaaaa.xml";
		int i = name.lastIndexOf(".");
		System.out.println(i);
	}
}
