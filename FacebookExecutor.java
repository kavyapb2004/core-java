class FacebookExecutor{
    public static void main(String[] args){
		System.out.println("main started------------>");
		
		Facebook facebook = new Facebook();
		
		
		UserAccount userAccountOne = new UserAccount();
		
		userAccountOne.setFirstName("kavya ");
		userAccountOne.setSurName("pb");
		userAccountOne.setDob("26-12-2003");
		userAccountOne.setEmail("kavya@gmail.com");
		userAccountOne.setPassword("Kavya1234");
		userAccountOne.setGender("female");
		
		boolean ref = facebook.createAccount(userAccountOne);
		System.out.println(ref);
		
	
		
		UserAccount userAccountTwo = new UserAccount();
		
		userAccountTwo.setFirstName("ramya ");
		userAccountTwo.setSurName("pb");
		userAccountTwo.setDob("24-06-2001");
		userAccountTwo.setEmail("ramya@gmail.com");
		userAccountTwo.setPassword("ramya456");
		userAccountTwo.setGender("female");
		
		boolean ref1 = facebook.createAccount(userAccountTwo);
		System.out.println(ref1);
		
		facebook.getAccountDetails();
		
		System.out.println("main ended ------>");
	}
}
		
		
		
		
		
		
		
	 