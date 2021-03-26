
import java.util.function.BiFunction;
import java.util.function.BinaryOperator;

public class BinaryoperatorFunc {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		BinaryOperator<Integer> func=(x1,x2)-> x1+x2;
		int t=func.apply(12, 20);
		System.out.println("the value is "+t);
		
		BiFunction<Integer,Integer,Integer> func2 = (x1,x2)-> x1+x2;
		int result=func2.apply(15, 30);
		System.out.println("the value is "+result);
	}

}
