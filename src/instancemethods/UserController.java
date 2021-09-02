package instancemethods;

public class UserController {

	 public User createUser(User user){
		 System.out.println("createUser :-");
		 System.out.println(user.userId0);
		 System.out.println(user.userName0);
		 System.out.println(user.userId1);
		 System.out.println(user.userName1);
		 
		 System.out.println("created user succesfully");
		 return user;
	 }
	 public User updateUser(User user){
		 System.out.println("updateUser:-");
		 user.userId1= 1875;
		 user.userName1= "shreya";
		 System.out.println("updated user succesfully");
		 return user;
	 }
	 public User deleteUser(User user){
	     System.out.println("deleteuser");
	     user.userId1= 1875;
		 user.userName1= "shreya";
		  return user;
	 }
}

