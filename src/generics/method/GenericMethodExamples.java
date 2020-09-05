package generics.method;

import generics.pojo.Person;

public class GenericMethodExamples {
	public static <T> void basicExample1(T element) {
		System.out.println(element.getClass().getName() + " is: " + element);
	}
	
	public static void main(String[] args) {
		GenericMethodExamples.basicExample1(new Person("Ankur", 30));
		GenericMethodExamples.basicExample1("Ankur");
		GenericMethodExamples.basicExample1(10);
	}
}
