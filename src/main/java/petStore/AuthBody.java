package petStore;

public class AuthBody {
	
	 private int id;
	    private String username;
	    private String firstName;
	    private String lastName;
	    private String email;
	    private String password;
	    private String phone;
	    private int userStatus;

	    public AuthBody(int id, String username, String firstName, String lastName, String email, String password, String phone, int userStatus) {
	        this.id = id;
	        this.username = username;
	        this.firstName = firstName;
	        this.lastName = lastName;
	        this.email = email;
	        this.password = password;
	        this.phone = phone;
	        this.userStatus = userStatus;
	    }
	public int getid() {
		return id;
	}
	
	public String getusername() {
		return username;
		
	}
	
	public String getfirstName() {
		return firstName;
		
	}
	public String getlastName() {
		return lastName;
		
	}
	public String getemail() {
		return email;
		
	}
	public String getpassword() {
		return password;
		
	}
	public String getphone() {
		return phone;
		
	}
	
	public int getuserStatus() {
		return userStatus;
	}
	
	
	
	

}
