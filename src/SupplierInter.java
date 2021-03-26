import java.util.function.Supplier;

public class SupplierInter {

	public static void main(String[] args) {
		
		
		getText(()->"Java");
		getText(()->"Ruby");
		getText(()->"Python");
	}
	
	public static void getText(Supplier<String> text) {
		
		System.out.println(text.get().length());
	}

}
