class Person{
	private int age;
	private String name;
	private float price;
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public float getPrice() {
		return price;
	}
	public void setPrice(float price) {
		this.price = price;
	}
	
}
public class TestPerson {

	public static void main(String[] args) {
		Person ob1=new Person();
		Person ob2=new Person();
		ob1.setAge(25);
		ob1.setName("teja");
		ob1.setPrice(25000);
		System.out.println("Person1 Details");
		System.out.println(ob1.getAge());
		System.out.println(ob1.getName());
		System.out.println(ob1.getPrice());
		ob2.setAge(30);
		ob2.setName("maneesha");
		ob2.setPrice(10000);
		System.out.println("Person2 Details");
		System.out.println(ob2.getAge());
		System.out.println(ob2.getName());
		System.out.println(ob2.getPrice());
		
	}

}
