package lambdaexp;

import LambdaConept.Webpageinter;

public class lambdaExpression {

	public static void main(String[] args) {
		Webpageinter w1=(name) -> {System.out.println("Hi name is"+name);};
		
		w1.value("Jyoti");
		

	}

}
