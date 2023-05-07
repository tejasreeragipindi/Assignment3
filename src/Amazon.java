 class Amazon{
	private String name;
	private long mobileNo;
	private String email;
	private String password;
	
public Amazon(String name, long mobileNo, String email, String password) {
		super();
		this.name = name;
		this.mobileNo = (int)mobileNo;
		this.email = email;
		this.password = password;
	}


public Amazon() {
	
}




public String toString() {
	return name+" "+mobileNo+" "+email+" "+password+"";
}



public static class Ecommerce {

	public static void main(String[] args) {
		Amazon a1=new Amazon("SaiRam",7777766666l,"sai@hotmail.com","code@!23");
		System.out.println(a1);
		Amazon a2=new Amazon("venu",9999988888l,"venus@gmail.com","secret@123#");
		System.out.println(a2);
		Amazon a3=new Amazon("saketh",8888877777l,"saketh@yahoo.com","python@code");
		System.out.println(a3);
	}
	
	
	
	}

}
