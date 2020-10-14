package practice;

import java.util.Arrays;
import java.util.StringJoiner;

public class Test {
	public static void main(String[] args) {
		String[] num = {"cat","dog","bard","fish"};
		StringJoiner sj  = new StringJoiner(" / ");
		Arrays.stream(num).forEach(i -> sj.add(String.valueOf(i)));
		System.out.println(sj.toString());

	}

}
