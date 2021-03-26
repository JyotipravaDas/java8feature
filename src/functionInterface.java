import java.util.function.Function;

public class functionInterface {

	public static void main(String[] args) {

		Function<String, Integer> func = x -> x.length();
		int length=func.apply("The value of name");
		System.out.println("length of the string is:"+length);
		Function<Integer, Integer> func2 = x -> x*2;
		int result=func.andThen(func2).apply("The happy");
		System.out.println(result);
		

	}
}
