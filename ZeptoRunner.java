class ZeptoRunner{
     
	 public static void main(String[] account){
		 
		 Zepto zepto = new Zepto();
		 
		 ZeptoAccount customerOne = new ZeptoAccount();
		     customerOne.setCustomerId(501);
			 customerOne.setCustomerName("Gautam");
			 customerOne.setEmail("gautam@gmail.com");
			 customerOne.setCity("Surat");
			 customerOne.setItem("Milk");
			 customerOne.setQuantity(2);
			 customerOne.setTotalAmount(120);
			 
			 boolean ref = zepto.createZeptoAccount(customerOne);
			 System.out.println(ref);
			
			 
			 
		 ZeptoAccount customerTwo = new ZeptoAccount();
		     customerTwo.setCustomerId(502);
			 customerTwo.setCustomerName("Riya");
			 customerTwo.setEmail("riya@gmail.com");
			 customerTwo.setCity("Nagpur");
			 customerTwo.setItem("Bread");
			 customerTwo.setQuantity(3);
			 customerTwo.setTotalAmount(150);
			 
			 ref = zepto.createZeptoAccount(customerTwo);
			 System.out.println(ref);
			
			 
			 
		 ZeptoAccount customerThree = new ZeptoAccount();
		     customerThree.setCustomerId(503);
			 customerThree.setCustomerName("Manoj");
			 customerThree.setEmail("manoj@gmail.com");
			 customerThree.setCity("Indore");
			 customerThree.setItem("Eggs");
			 customerThree.setQuantity(12);
			 customerThree.setTotalAmount(180);
			 
			 ref = zepto.createZeptoAccount(customerThree);
			 System.out.println(ref);
		
			 
			 
		 ZeptoAccount customerFour = new ZeptoAccount();
		     customerFour.setCustomerId(504);
			 customerFour.setCustomerName("Preeti");
			 customerFour.setEmail("preeti@gmail.com");
			 customerFour.setCity("Bhopal");
			 customerFour.setItem("Rice");
			 customerFour.setQuantity(5);
			 customerFour.setTotalAmount(400);
			 
			 ref = zepto.createZeptoAccount(customerFour);
			 System.out.println(ref);
			
			 
			 
		 ZeptoAccount customerFive = new ZeptoAccount();
		     customerFive.setCustomerId(505);
			 customerFive.setCustomerName("Lokesh");
			 customerFive.setEmail("lokesh@gmail.com");
			 customerFive.setCity("Patna");
			 customerFive.setItem("Apples");
			 customerFive.setQuantity(2);
			 customerFive.setTotalAmount(200);
			 
			 ref = zepto.createZeptoAccount(customerFive);
			 System.out.println(ref);
			 zepto.getOrderDetails();
	 }
}