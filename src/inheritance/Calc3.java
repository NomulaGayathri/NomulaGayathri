package inheritance;

public class Calc3 extends Calc2 {
	
	
	public int multi(int x,int y) {
	Calc2 c2= new Calc2();
	
	int result2 = c2.sub(16, 15);
	System.out.println("calc2 =" + result2);
	 return x*y;
	
	}

}
