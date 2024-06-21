package javapratice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class Runner1 {

	public static void main(String[] args) {
	
//		List<String> namelist= new ArrayList<>(Arrays.asList("bunu","csm technology","java tchnocaraft","odisha"));
//		List <Integer> intlist=new ArrayList<>(Arrays.asList(12,343,44,55,66,67));
        String name = "Technology";	
        Predicate<String> p=(s)->s.isEmpty();
        Predicate<Integer> n=(x)->x%2==0;
     //   System.out.println(n.test(31));
      //  System.out.println(p.test(name));
	Consumer<String> c=(x)->System.out.println(x);
	
	}
}
