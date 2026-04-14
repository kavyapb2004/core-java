class MyntraExe{

	public static void main(String[] args){
	
		Myntra myntra = new Myntra();
		
		MyntraAccount myntraOne=new MyntraAccount();

		myntraOne.setUserId(1);
		myntraOne.setUserName("kavya");
		myntraOne.setEmail("kavyapb@24");
		myntraOne.setPassword("dhvch89");
		myntraOne.setGender("female");
		myntraOne.setDateOfBirth("26-12-2003");
		myntraOne.setAddress("benglore");
		
		boolean ref=myntra.createAccount(myntraOne);
		System.out.println(ref);
		
		

		
		MyntraAccount myntraTwo=new MyntraAccount();
		
		myntraTwo.setUserId(2);
		myntraTwo.setUserName("samarth");
		myntraTwo.setEmail("sammu@gmail.com");
		myntraTwo.setPassword("jeh876");
		myntraTwo.setGender("male");
		myntraTwo.setDateOfBirth("25-09-2014");
		myntraTwo.setAddress("ittigehalli");
		
		boolean ref2=myntra.createAccount(myntraTwo);
		System.out.println(ref2);
		
		
		
		MyntraAccount myntraThree=new MyntraAccount();
		
		myntraThree.setUserId(3);
		myntraThree.setUserName("ramya");
		myntraThree.setEmail("ramya@gmail.com");
		myntraThree.setPassword("tfd678");
		myntraThree.setGender("female");
		myntraThree.setDateOfBirth("22-08-2001");
		myntraThree.setAddress("anaveri");
		
		boolean ref3=myntra.createAccount(myntraThree);
		System.out.println(ref3);
		
		
		myntra.getAccountDetails();
		
		
		
		
		
	}
}