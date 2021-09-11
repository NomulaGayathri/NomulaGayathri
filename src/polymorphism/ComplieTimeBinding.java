package polymorphism;

public class ComplieTimeBinding {
	 
	// number of parameters
	public void add(int a, int b) {
		int sum=a+b;
		System.out.println("number/sum of paramenter" + sum);
	}
	public void add(int a,int b,int c) {
		int sum = a+b+c;
		System.out.println("number/sum of paramenter" + sum);
	}
    //data types parameter
	public void add(double a,double b) {
		double sum= a+b;
		System.out.println("data types parameter" + sum);
	}
	//sequence in parameters
	public void display(int a,char b) {
		System.out.println("int,char");
	}
	public void diaplay(char b, int a) {
		System.out.println("char,int");
	}
}
