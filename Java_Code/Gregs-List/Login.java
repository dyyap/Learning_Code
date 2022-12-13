/**
	The Login class inquires for user input of their name and password.
*/

public class Login extends userSecurity {

	private String userName;	//the user's name for signing in
	private String userPassword;	//the user's password or signing in
	

	/**Login constructor
	   Sets the user imformation to nothing.
	*/

	public Login (){
		userName = "";
		userPassword = "";
	}
	
	/**Login overloading constructor
	   @param name is the username.
	   @param password is the user password.
	*/

	public Login (Spring name, int password) {
		userName = name;
		if (password.Lengh() != 7) {
			userPassword = "";
		}
		else {
			userPassword = password;
		}
	}

	public bool canLogin(){
		bool Access = userSec.Access(userName, userPassword);
		return Access;
 	}

	public void setName(String name){
		userName = name;
	}

	public void setPass(String pass){
		userPassword = pass;
	}

	public String getName(){
		return userName;
	}

	public String getPass(){
		return userPassword;
 	}

}
	


		