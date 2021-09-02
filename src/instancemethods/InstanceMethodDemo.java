package instancemethods;

public class InstanceMethodDemo {
	public static void main(String args[]){
		   UserController controller =new UserController();
		   
		    User usr = new User(5486,"gayathri",4112,"sandy");
		    
			User returnUsr= controller.createUser(usr);
			System.out.println(returnUsr.userId0);
			System.out.println(returnUsr.userName0);
			System.out.println(returnUsr.userId1);
			System.out.println(returnUsr.userName1);
			
			
			User updatedusr= controller.updateUser(usr);
			System.out.println(updatedusr.userId1);
			System.out.println(updatedusr.userName1);
			
			User deleteuser= controller.deleteUser(usr);
			System.out.println(deleteuser.userId1);
			System.out.println(deleteuser.userName1);
			
		  }
		}
