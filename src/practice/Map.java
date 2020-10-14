package practice;

import java.util.Arrays;
import java.util.List;

public class Map {
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Integer[] num = {1,2,3,4,5,9};
		List<Integer> i = Arrays.asList(num);

		// ラムダ式の記述：：四則演算
		i.stream().map(x -> x * 10 -5).forEach(System.out::println);
	}

}
