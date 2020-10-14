package practice;

import java.util.Arrays;
import java.util.List;

public class Sorted {
	public static void main(String[] args) {
		Integer[] num = {1,9,54,35,71};
		List<Integer> i = Arrays.asList(num);

		// ラムダ式の記述：：降順にソート
		i.stream().sorted((x,y) -> y - x).forEach(System.out :: println);
	}

}
