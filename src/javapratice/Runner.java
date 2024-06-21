package javapratice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Runner {

	public static void main(String[] args) {

		List<String> nameList = new ArrayList<>(Arrays.asList("Technology", "Programming", "Database"));
		
		FunctionalDemo<String, Integer> fd = (s) -> s.length();
		FunctionalDemo<String, String> fd1 =(s)-> s.substring(0,4);
		List<String> newList = applyfunctionalDemonList(nameList, fd1);
		System.out.println(newList);

	}

	private static <T, R> List<R> applyfunctionalDemonList(List<T> nameList, FunctionalDemo<T, R> fd1) {
		List<R> newList = new ArrayList<>();
		for (T x : nameList) {
			newList.add(fd1.execute(x));
		}
		return newList;
	}

}
