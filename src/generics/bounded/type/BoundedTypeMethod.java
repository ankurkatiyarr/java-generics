package generics.bounded.type;

import generics.pojo.Dog;
import generics.pojo.Employee;
import generics.pojo.Person;

public class BoundedTypeMethod {
	public static <T extends Person> void foo(T element) {
		System.out.println("element: " + element);
	}
	
	public static void main(String[] args) {
		BoundedTypeMethod.foo(new Person()); // allowed
		BoundedTypeMethod.foo(new Employee()); // allowed
		// BoundedTypeMethod.foo(new Dog());  // not allowed
	}
}
