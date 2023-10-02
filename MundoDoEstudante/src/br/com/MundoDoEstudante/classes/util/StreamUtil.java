package br.com.MundoDoEstudante.classes.util;

import java.util.Iterator;
import java.util.Spliterator;
import java.util.Spliterators;
import java.util.stream.Stream;
import java.util.stream.StreamSupport;

public class StreamUtil {

	public static <T> Stream<T> convertToStream(Iterator<T> cellIterator) {
		Spliterator<T> spliterator = Spliterators.spliteratorUnknownSize(cellIterator, Spliterator.ORDERED);
		return StreamSupport.stream(spliterator, false);
	}
}

