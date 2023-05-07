class Book
{
private int bookId;
private String bookName;
private double bookPrice;
public int getBookId() {
	return bookId;
}
public void setBookId(int bookId) {
	this.bookId = bookId;
}
public String getBookName() {
	return bookName;
}
public void setBookName(String bookName) {
	this.bookName = bookName;
}
public double getBookPrice() {
	return bookPrice;
}
public void setBookPrice(double bookPrice) {
	this.bookPrice = bookPrice;
}

}
public class TestBook {

	public static void main(String[] args) {
		Book ob1=new Book();
		Book ob2=new Book();
		ob1.setBookId(100);
		ob1.setBookName("math textBook");
		ob1.setBookPrice(1000);
		System.out.println("Book1 Details");
		System.out.println(ob1.getBookId());
		System.out.println(ob1.getBookName());
		System.out.println(ob1.getBookPrice());
		ob2.setBookId(101);
		ob2.setBookName("phy textBook");
		ob2.setBookPrice(1200);
		System.out.println("Book2 Details");
		System.out.println(ob2.getBookId());
		System.out.println(ob2.getBookName());
		System.out.println(ob2.getBookPrice());
	}

}
