package polymorphism;

public class ComplieTimeBindingMain {

	public static void main(String[] args) {
		
		ComplieTimeBinding ctb = new ComplieTimeBinding();
        System.out.println("----------- number of parameters-------------");
		ctb.add(15, 15);
		ctb.add(10, 10, 10);
		System.out.println("----------data types parameter----------");
		ctb.add(15.5, 1.0);
		System.out.println("----------sequence in parameters--------------");
		ctb.display(2451,'g' );
		ctb.diaplay('k', 24860);
	}

}
