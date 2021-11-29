package controller;

import java.util.LinkedList;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class ListaDuplaController {
	public List concatena(LinkedList <Integer> l1, LinkedList <Integer> l2) {
		List <Integer> concatena = new LinkedList<Integer> (l1); 
		concatena.addAll(l2);
		return concatena;
	}
	
	public static <T> Stream<List<T>> divideLista(LinkedList<T> lista, int comprimento) {
	    if (comprimento <= 0)
	        throw new IllegalArgumentException("tamanho = " + comprimento);
	    int tamanho = lista.size();
	    if (tamanho <= 0)
	        return Stream.empty();
	    int fracoes = (tamanho - 1) / comprimento;
	    return IntStream.range(0, fracoes + 1).mapToObj(
	        n -> lista.subList(n * comprimento, n == fracoes ? tamanho : (n + 1) * comprimento));
	}
}
