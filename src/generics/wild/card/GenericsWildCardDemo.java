package generics.wild.card;

import java.util.ArrayList;
import java.util.List;

import generics.pojo.Dog;
import generics.pojo.Employee;
import generics.pojo.Person;

public class GenericsWildCardDemo {
	public static void upperBoundWildCardExample(List<? extends Person> list) {
		System.out.println("list: " + list);
	}
	
	public static void lowerBoundWildCardExample(List<? super Employee> list) {
		System.out.println("list: " + list);
	}
	
	public static void main(String[] args) {
		List<Person> personList = new ArrayList<Person>();
		List<Employee> employeeList = new ArrayList<Employee>();
		List<Dog> dogList = new ArrayList<Dog>();
		
		upperBoundWildCardExample(personList);		
		upperBoundWildCardExample(employeeList);
		// upperBoundWildCardExample(dogList); // not allowed
		
		lowerBoundWildCardExample(personList);
		lowerBoundWildCardExample(employeeList);
		// lowerBoundWildCardExample(dogList);
	}
}
