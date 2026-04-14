class Zepto{
   ZeptoAccount zeptoAccounts[]=new ZeptoAccount[7] ;
   int index;
   
   public boolean createZeptoAccount(ZeptoAccount zeptoAccount){
   boolean isAccountCreated = false;
		
		boolean isCustomerIdValid = false;
		boolean isCustomerNameValid = false;
		boolean isEmailValid = false;
		boolean isCityValid = false;
		boolean isItemValid = false;
		boolean isQuantityValid = false;
		boolean isTotalAmountValid = false;
		
		int cId = zeptoAccount.getCustomerId();
		if(cId > 0){
		    isCustomerIdValid = true ;
		}else{
			System.out.println("Customer Id not valid");
		}
		
		String cName = zeptoAccount.getCustomerName();
		if(cName != null && !cName.isEmpty()){
			isCustomerNameValid = true;
		}else{
			System.out.println("Customer Name not valid");
		}
		
		String emailId = zeptoAccount.getEmail();
		if(emailId != null && !emailId.isEmpty()){
			isEmailValid = true;
		}else{
			System.out.println("Email not valid");
		}
		
		String city = zeptoAccount.getCity();
		if(city != null && !city.isEmpty()){
			isCityValid = true;
		}else{
			System.out.println("City not valid");
		}
		
		String item = zeptoAccount.getItem();
		if(item != null && !item.isEmpty()){
			isItemValid = true;
		}else{
			System.out.println("Item not valid");
		}
		
		int quantity = zeptoAccount.getQuantity();
		if(quantity > 0){
			isQuantityValid = true;
		}else{
			System.out.println("Quantity not valid");
		}
		
		double total = zeptoAccount.getTotalAmount();
		if(total > 0){
			isTotalAmountValid = true;
		}else{
			System.out.println("Total Amount not valid");
		}
		
		if(isCustomerIdValid == true && isCustomerNameValid == true && isEmailValid == true &&
		   isCityValid == true && isItemValid == true &&
		   isQuantityValid == true && isTotalAmountValid == true){
			this.zeptoAccounts[index++] = zeptoAccount;
			isAccountCreated = true;
		}
		return isAccountCreated;
	
   }
	
	public  void getOrderDetails(){
		System.out.println("Fetching Zepto Order Details");
		for(ZeptoAccount zeptoAccount:zeptoAccounts){
			System.out.println("--------------->");
		System.out.println("Customer Id is : "+zeptoAccount.getCustomerId());
		System.out.println("Customer Name is : "+zeptoAccount.getCustomerName());
		System.out.println("Email Id is : "+zeptoAccount.getEmail());
		System.out.println("City : "+zeptoAccount.getCity());
		System.out.println("Item : "+zeptoAccount.getItem());
		System.out.println("Quantity : "+zeptoAccount.getQuantity());
		System.out.println("Total Amount : "+zeptoAccount.getTotalAmount());
		System.out.println("------------------>");
		}
	}
}