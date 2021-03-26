
public class customer {
	
	String name;
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	int age;
	
	customer(String name,int age){
		this.name=name;
		this.age=age;
		
	}
	

}
