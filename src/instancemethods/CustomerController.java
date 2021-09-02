package instancemethods;

public class CustomerController {
	
    public CustomerUser createUser(CustomerUser cu) {
	  System.out.println("creating user");
	  System.out.println(cu.id0);
	  System.out.println(cu.name0);
	  System.out.println(cu.gender0);
	  System.out.println(cu.phoneNum0);
	  System.out.println("created user succesfully");
	  return cu;
    }
    
    public  CustomerUser updateUser(CustomerUser cu) {
    	System.out.println("updated user succesfully");
    	return cu;
    	}
    
    public CustomerUser deleteUser(CustomerUser cu) {
    	System.out.println("deleted user succesfully");
    	return cu;
    }
}

