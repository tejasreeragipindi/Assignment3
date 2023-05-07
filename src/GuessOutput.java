class CodeGnan{ 
int m; 
static int n; 
void  m1() { 
m = 5; 
n = 8; 
} 
static void m2() { 
n = 7; 
} 
void display(){ 
System.out.println("m="+m+" "+"n="+n); 
} 
} 

public class GuessOutput {

	public static void main(String[] args) {
		CodeGnan cg1 = new CodeGnan(); 
		cg1.m1(); 
		cg1.display();//m=5 n=8 
       CodeGnan cg2 = new CodeGnan(); 
		cg2.display();  //m=0 n=8 
CodeGnan cg3 = new CodeGnan(); 
cg3.m1(); 
cg3.m2(); 
cg3.display(); // m=5 n=7 
CodeGnan cg4 = new CodeGnan(); 
CodeGnan.n=6; 
cg4.display();  //m=0 n=6 


	}

}
