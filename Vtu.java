class Vtu{
	VtuAccount vtuAccounts[]= new VtuAccount[19];
	int index;
	
	public boolean createVtuAccount(VtuAccount vtuAccount){
		boolean isAccountCreated=false;
		
		boolean isVtuIdValid=false;
		boolean isUserNameValid=false;
		boolean isEmailValid=false;
		boolean isPasswordValid=false;
		boolean isConfirmPassword=false;
		
		
		
		int vtuId= vtuAccount.getVtuId();
		if(vtuId>0){
			isVtuIdValid=true;
		}
		
		String  userName=vtuAccount.getUserName();
		if(userName != null && !userName.isEmpty()){
			isUserNameValid=true;
		}
		
		String email=vtuAccount.getEmail();
		if(email != null && !email.isEmpty()){
			isEmailValid=true;
		}
		
		String password=vtuAccount.getPassword();
		if(password != null && !password.isEmpty()){
			isPasswordValid=true;
		}
		
		String confirmPassword=vtuAccount.getConfirmPassword();
		if(confirmPassword != null && !confirmPassword.isEmpty()){
			isConfirmPassword=true;
		}
		
		if(isVtuIdValid==true && isUserNameValid==true && isEmailValid==true  && isPasswordValid==true && isConfirmPassword==true){
			this.vtuAccounts[index++]=vtuAccount;
			isAccountCreated=true;
		}
		
		return isAccountCreated;
		
	}
	
	public void getDetails(){
		for( VtuAccount vtuAccount:vtuAccounts){
			System.out.println("-------------------->");
			System.out.println("The user id is:" +vtuAccount.getVtuId());
			System.out.println("The user Name is:" +vtuAccount.getUserName());
			System.out.println("The user email is:"+vtuAccount.getEmail());
			System.out.println("The user password is:"+vtuAccount.getPassword());
			System.out.println("The confirm password is:"+vtuAccount.getConfirmPassword());
			System.out.println("-------------------->");
		}
	}
	
}