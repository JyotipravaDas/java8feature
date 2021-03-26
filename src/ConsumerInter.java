import java.util.function.Consumer;

public class ConsumerInter {
	public static void main(String[] args) {
	
		Consumer<String> str=x-> System.out.println(x);
		str.accept("This is jyoti");
	}
}
