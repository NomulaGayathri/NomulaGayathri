package inheritance;

public class Calc2 {
	

	public int sub(int x,int z) {
		Calc c1= new Calc();
		
		System.out.println(Calc.g);
		int result1 = c1.add(15, 15);
		System.out.println("calc1 =" + result1);
		return x-z;
		
	}
	}

