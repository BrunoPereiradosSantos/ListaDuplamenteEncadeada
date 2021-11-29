package view;

import java.util.LinkedList;
import java.util.List;

import controller.ListaDuplaController;

public class Principal {

	public static void main(String[] args) {
		LinkedList l1 = new LinkedList <Integer> ();
		LinkedList l2 = new LinkedList <Integer> ();
		
		ListaDuplaController ldc = new ListaDuplaController();
		l1.add(5);
		l1.add(7);
		l1.add(9);
		l1.add(10);
		
		l2.add(4);
		l2.add(6);
		l2.add(8);
		l2.add(9);
		
		List <Integer> concatena = ldc.concatena(l1, l2);
		System.out.println(concatena);
		
		ldc.divideLista(l1, 2).forEach(System.out::println);
		
		
	}

}
