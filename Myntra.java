class Myntra{

	MyntraAccount myntraAccount= new MyntraAccount();
	public boolean createAccount(MyntraAccount myntraAccount){
		boolean isAccountCreated = false;
		
		boolean isUserIdValid = false;
		boolean isUserNameValid = false;
		boolean isEmailValid  = false;
		boolean isPasswordValid  = false;
		boolean isGenderValid  = false;
		boolean isDateOfBirthValid  = false; 
		boolean isAddressValid  = false;
		
		int userId=  myntraAccount.getUserId();
		
		if(userId>0){
			isUserIdValid=true;
		}
		
		String userName= myntraAccount.getUserName();
		
		if(userName!=null && !userName.isEmpty()){
			isUserNameValid=true;
		}
		
		String email = myntraAccount.getEmail();
		
		if(email!=null && !email.isEmpty()){
			isEmailValid=true;
		}
		
		String password=myntraAccount.getPassword();
		
		if(password!=null && !password.isEmpty()){
			isPasswordValid=true;
		}
		
		String gender = myntraAccount.getGender();
		
		if(gender!=null && !gender.isEmpty()){
			isGenderValid=true;
		}
		
		String dateOfBirth= myntraAccount.getDateOfBirth();
		
		if(dateOfBirth != null && !dateOfBirth.isEmpty()){
			isDateOfBirthValid =true;
		}
		
		String address=myntraAccount.getAddress();
		
		if(address!=null && !address.isEmpty()){
			isAddressValid=true;
		}
		
		if(isUserIdValid == true && isUserNameValid == true && isEmailValid == true && isPasswordValid == true  && isGenderValid == true && isGenderValid == true && isDateOfBirthValid== true  && isAddressValid== true){
			this.myntraAccount = myntraAccount;
			isAccountCreated = true;
		}
		return isAccountCreated;
	}
	
	public  void getAccountDetails(){
		System.out.println("Fetching Account Details...........");
		System.out.println("user Id  is : "+myntraAccount.getUserId());
		System.out.println("Surname is : "+myntraAccount.getUserName());
		System.out.println("Date of Birth is : "+myntraAccount.getEmail());
		System.out.println("Email ID is : "+myntraAccount.getPassword());
		System.out.println("Password is : "+myntraAccount.getGender());
		System.out.println("Gender is : "+myntraAccount.getDateOfBirth());
		System.out.println("Gender is : "+myntraAccount.getAddress());
	}
}
		