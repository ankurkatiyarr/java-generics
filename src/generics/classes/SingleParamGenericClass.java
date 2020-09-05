package generics.classes;

import generics.pojo.Dog;
import generics.pojo.Person;

public class SingleParamGenericClass<T> {
	private T item;

	public T getItem() {
		return item;
	}

	public void setItem(T item) {
		this.item = item;
	}
	
	public void print() {
		System.out.println(item);
	}

	public static void main(String[] args) {
		SingleParamGenericClass<Person> singleParamGenericPersonClass = new SingleParamGenericClass<>();
		
		singleParamGenericPersonClass.setItem(new Person("Ankur", 30));
		singleParamGenericPersonClass.print();
		
		singleParamGenericPersonClass.setItem(new Person("Shalu", 27));
		singleParamGenericPersonClass.print();
		
		SingleParamGenericClass<Dog> singleParamGenericDogClass = new SingleParamGenericClass<>();
		
		singleParamGenericDogClass.setItem(new Dog("Bruno"));
		singleParamGenericDogClass.print();
		
		singleParamGenericDogClass.setItem(new Dog("Jimmy"));
		singleParamGenericDogClass.print();
	}
}
