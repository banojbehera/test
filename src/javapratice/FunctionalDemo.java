package javapratice;

@FunctionalInterface
public interface FunctionalDemo <T,R> {
	
	R execute (T s);
}
