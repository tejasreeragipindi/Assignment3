class vechile
{
String company;
String color;
double prize;
public vechile(String company, String color, double prize) {
	this.company = company;
	this.color = color;
	this.prize = prize;
}
public vechile() {
}
@Override
public String toString() {
	return "vechile [company=" + company + ", color=" + color + ", prize=" + prize + "]";
}
void display() {
	System.out.println("Company: "+company);
	System.out.println("Color: "+color);
	System.out.println("Prize: "+prize);
}


}
public class VechileServices1 {

	public static void main(String[] args) {
		vechile v=new vechile("kia","Mattieblack",200000.00);
		v.display();
		System.out.println(v);
		

	}

}
