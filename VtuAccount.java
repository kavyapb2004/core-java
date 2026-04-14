public class VtuAccount{
	private int vtuId;
	private String userName;
	private String email;
	private String password;
	private String confirmPassword;
	
	public VtuAccount(){
		
	}
	
	public void setVtuId(int vtuId){
		this.vtuId=vtuId;
	}
	public int getVtuId(){
		return this.vtuId;
	}
	
	public void setUserName(String  userName){
		this.userName=userName;
	}
	public String  getUserName(){
		return this.userName;
	}
	
	public void setEmail(String  email){
		this.email=email;
	}
	public String  getEmail(){
		return this.email;
	}
	
	public void setPassword(String  password){
		this.password=password;
	}
	public String  getPassword(){
		return this.password;
	}
	
	public void setConfirmPassword(String  confirmPassword){
		this.confirmPassword=confirmPassword;
	}
	public String  getConfirmPassword(){
		return this.confirmPassword;
	}
}