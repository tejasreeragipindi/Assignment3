class Customer{
	int id;
	String name;
	String address;
	long mobileNo;
	double payBill;
	
	public Customer() {
		id=102;
		name="teja";
		address="Bollapalli";
		mobileNo= 9581032412l;
		payBill=15000.00;
		
	}


	void display()
	{
		System.out.println("id:"+id);
		System.out.println("Name:"+name);
		System.out.println("Address:"+address);
		System.out.println("mobileNo:"+mobileNo);
		System.out.println("payBill:"+payBill);
	}
}
public class TestCustomer {

	public static void main(String[] args) {
		Customer ob=new Customer();
		ob.display();

	}

}
