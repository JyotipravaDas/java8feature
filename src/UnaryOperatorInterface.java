import java.util.ArrayList;
import java.util.List;
import java.util.function.UnaryOperator;

public class UnaryOperatorInterface {
	public static void main(String[] args) {

		UnaryOperator<Integer> func=x->x*5;
		int n1=func.apply(3);
		System.out.println("the value is "+n1);
		
		List<String> list=new ArrayList<String>();
		list.add("Jyoti");
		list.add("Dipti");
		list.add("Ami");
		
		System.out.println("List should be"+list);
		
		list.replaceAll(ele -> ele + "Prava");
		
		System.out.println("List should be"+list);
		
				
		
	}

}
