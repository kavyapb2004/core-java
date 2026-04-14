class Facebook{
	UserAccount userAccounts[]=new UserAccount[2];
	int index;//coustom ref
	
	public boolean createAccount(UserAccount userAccount){
		boolean isAccountCreated = false;
		
		boolean isFNameValid = false;
		boolean isSNameValid = false;
		boolean isDobValid = false;
		boolean isEmailValid = false;
		boolean isPasswordValid = false;
		boolean isGenderValid = false;
		
		
		String firstName=userAccount.getFirstName();
		
		if(firstName!=null && !firstName.isEmpty()){
			isFNameValid=true;
		}
		
		String surName = userAccount.getSurName();
		
		if(surName!=null && !surName.isEmpty()){
			isSNameValid=true;
		}
		
		String dob =userAccount.getDob();
		
		if(dob!=null && !dob.isEmpty()){
			isDobValid=true;
		}
		
		String email= userAccount.getEmail();
		
		if(email!=null && !email.isEmpty()){
			isEmailValid=true;
		}
		
		String password=userAccount.getPassword();
		
		if(password!=null && !password.isEmpty()){
			isPasswordValid=true;
		}
		
		String gender=userAccount.getgender();
		
		if(gender!=null && !gender.isEmpty()){
			isGenderValid=true;
		}
		if(isFNameValid == true && isSNameValid == true && isDobValid == true && isEmailValid == true  && isPasswordValid == true && isGenderValid == true ){
			this.userAccounts[index++] = userAccount;
			isAccountCreated = true;
		}
		return isAccountCreated;
	}
	
	public  void getAccountDetails(){
		System.out.println("Fetching Account Details...........");
			for(UserAccount userAccount:userAccounts){
				System.out.println("------");
			System.out.println("First name is : "+userAccount.getFirstName());
			System.out.println("Surname is : "+userAccount.getSurName());
			System.out.println("Date of Birth is : "+userAccount.getDob());
			System.out.println("Email ID is : "+userAccount.getEmail());
			System.out.println("Password is : "+userAccount.getPassword());
			System.out.println("Gender is : "+userAccount.getgender());
				System.out.println("-----------");
			}
	}
}