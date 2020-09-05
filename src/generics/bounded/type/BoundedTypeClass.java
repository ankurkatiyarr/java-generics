package generics.bounded.type;

import generics.pojo.Dog;
import generics.pojo.Employee;
import generics.pojo.Person;

public class BoundedTypeClass<T extends Person> {
	private T element;

	public T getElement() {
		return element;
	}

	public void setElement(T element) {
		this.element = element;
	}

	public static void main(String[] args) {
		BoundedTypeClass<Person> personBoundedTypeClass = new BoundedTypeClass<>(); // allowed
		BoundedTypeClass<Employee> employeeBoundedTypeClass = new BoundedTypeClass<>(); // allowed
		// BoundedTypeClass<Dog> dogBoundedTypeClass = new BoundedTypeClass<>(); // not allowed
		
		/* BoundedTypeClass boundedTypeClass = new BoundedTypeClass<>();
		boundedTypeClass.setElement("Abc"); Not allowed */
	}

}
