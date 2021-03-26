import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class Arraylistiterator {

	public static void main(String[] args) {
		
		ArrayList<String> arr=new ArrayList<String>();
		
	arr.add("Jyoti");
	arr.add("Das");
	arr.forEach(show -> {System.out.println("Show is"+show);});
	System.out.println("1--------------");
	Iterator<String> it=arr.iterator();
	while(it.hasNext())
	{
		String name=it.next();
		System.out.println(name);
	}
	System.out.println("2--------------");
	it=arr.iterator();
	it.forEachRemaining(name-> {System.out.println(name);});
	
	

	System.out.println("3--------------");
	
	for(String show1 : arr){
		System.out.println(show1);
	}
	
	System.out.println("4-----------");
	
	for(int i=0;i<arr.size();i++) {
		
		System.out.println(arr.get(i));
	}
	
	System.out.println("5---------------");
	
	ListIterator<String> list=arr.listIterator(arr.size());
	
	while(list.hasPrevious()) {
		
		String show=list.previous();
		System.out.println(show);
	}
	
	
	
	
	
	
	
	
	
			
	}
	
}
