package instancemethods;

public class CustomerMainMethod {

	public static void main(String[] args) {
	
		CustomerController controller = new CustomerController();
		 
		CustomerUser cu = new CustomerUser(1425,"harsha",'M',94945872215L);
		
		CustomerUser returnuser= controller.createUser(cu);
	    System.out.println(cu.id0);
	    System.out.println(returnuser.name0);
	    System.out.println(returnuser.gender0);
	    System.out.println(returnuser.phoneNum0);
	    
	    CustomerUser updatedUser= controller.updateUser(cu);
		System.out.println();
		
		CustomerUser deleteUser= controller.deleteUser(cu);
		System.out.println();
				
	}
}
