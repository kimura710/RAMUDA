package practice;

import java.util.Arrays;
import java.util.List;

public class Ramuda2 {
	public static void main(String[] args) {
		Integer[] num = {1,2,3,4,5};
		List<Integer> l = Arrays.asList(num);

		//ラムダ式の記述
		l.forEach(System.out :: println);
	}

}
