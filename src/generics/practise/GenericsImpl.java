package generics.practise;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.function.Predicate;

/**
 * 
 * https://docs.oracle.com/javase/tutorial/java/generics/QandE/generics-questions.html
 *
 */
public class GenericsImpl {
	/*
	 * Write a generic method to count the number of elements in a collection that
	 * have a specific property (for example, odd integers, prime numbers palindromes etc.).
	 */
	public static <E> void numberOfElementsImpl(Collection<E> collection, Predicate<E> predicate) {
		Iterator<E> iterator = collection.iterator();
		while (iterator.hasNext()) {
			E e = iterator.next();
			if (predicate.test(e)) {
				System.out.println(e);
			}
		}
	}
	
	public static void numberOfElements() {
		List<Integer> list = new ArrayList<>();
		list.add(5);
		list.add(2);
		list.add(3);
		list.add(6);
		list.add(1);

		System.out.println("odd numbers are..");
		Predicate<Integer> oddNumberPredicate = (number) -> number%2 == 1;
		numberOfElementsImpl(list, oddNumberPredicate);
		
		System.out.println("even numbers are..");
		Predicate<Integer> evenNumberPredicate = (number) -> number%2 == 0;
		numberOfElementsImpl(list, evenNumberPredicate);
	}
	
	/*
	 * Write a generic method to exchange the positions of two different elements in an array.
	 * 
	 */
	public static <T> void swapElementsInArrayImpl(T[] arr, int i, int j) {
		T temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
		System.out.println("Array after swaping..");
		for (int k = 0; k < arr.length; k++) {
			System.out.print(arr[k] + " ");
		}
		System.out.println();
	}
	
	public static void swapElementsInArrayImpl() {
		String[] arr = new String[4];
		arr[0] = "Ankur";
		arr[1] = "Shalu";
		arr[2] = "Rajat";
		arr[3] = "Shivam";
		swapElementsInArrayImpl(arr, 0, 3);
	}
	
	public static void main(String[] args) {
//		numberOfElements();
		swapElementsInArrayImpl();
	}
}
