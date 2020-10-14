package practice;

import java.util.Arrays;
import java.util.List;

public class Filter {
	public static void main(String[] args) {
		Integer[] num = {1,2,3,4,5,6,9,8,7};
		List<Integer> i = Arrays.asList(num);

		// ラムダ式の記述：：3未満を抽出
		i.stream().filter(x -> x <= 5).forEach(System.out :: println);
	}

}
