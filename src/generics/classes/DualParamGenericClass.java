package generics.classes;

import generics.pojo.Dog;
import generics.pojo.Person;

public class DualParamGenericClass<U, V> {
	private U item1;
	private V item2;

	public U getItem1() {
		return item1;
	}

	public void setItem1(U item1) {
		this.item1 = item1;
	}

	public V getItem2() {
		return item2;
	}

	public void setItem2(V item2) {
		this.item2 = item2;
	}
	
	public void print() {
		System.out.println("item1: " + item1);
		System.out.println("item2: " + item2);
	}

	public static void main(String[] args) {
		DualParamGenericClass<Person, Dog> dualParamGenericClass = new DualParamGenericClass<>();
		dualParamGenericClass.setItem1(new Person("Ankur", 30));
		dualParamGenericClass.setItem2(new Dog("Bruno"));
		dualParamGenericClass.print();
	}
}
