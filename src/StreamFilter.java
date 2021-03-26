import java.util.Arrays;
import java.util.List;

public class StreamFilter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<customer> customername=Arrays.asList(new customer("tom",25),
				new customer("gen",34),
				new customer("pet",21));
		
		customer name=customername.stream().filter(ele->"pet".equals(ele.getName()))
				.findAny().orElse(null);
		
		System.out.println(name.getName()+" "+name.getAge());

	}	

}
