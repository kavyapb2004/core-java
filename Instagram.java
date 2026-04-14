class Instagram{

	Account account= new Account();
	
	
	public boolean createAccount(Account account){
		boolean isAccountCreated=false;
		System.out.println("save account ");
		
		System.out.println(account);
		
		this.account= account;
		System.out.println(this.account);//address
		
		
		
		
		/*this.account.accountId=accountId;
		this.account.firstName=firstName;
		this.account.lastName=lastName;
		this.account.gender=gender;
		this.account.email=email;*/
		
		isAccountCreated=true;
		
		
		return isAccountCreated;
		
	}
	
	public void getDetails(){
		System.out.println("The acoount id is:" +this.account.accountId);
		System.out.println("The account name is :" +this.account.firstName);
		System.out.println("The account last name is :" +this.account.lastName);
		System.out.println("The account gender is :" +this.account.gender);
		System.out.println("The account email is :" +this.account.email);
		
	}
}