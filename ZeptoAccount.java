public class ZeptoAccount{ 
 
	private int cId ;
	private String cName ;
	private String emailId ;
	private String city ;
	private String item ;
	private int quantity ;
	private double totalAmount ;
	
	
	public void setCustomerId(int cId){
		this.cId = cId;
	}
	public int getCustomerId(){
		return this.cId;
	}
	
	public void setCustomerName(String cName){
		this.cName = cName;
	}
	public String getCustomerName(){
		return this.cName;
	}
	
	public void setEmail(String emailId){
		this.emailId = emailId;
	}
	public String getEmail(){
		return this.emailId;
	}
	
	public void setCity(String city){
		this.city = city;
	}
	public String getCity(){
		return this.city;
	}
	
	public void setItem(String item){
		this.item = item;
	}
	public String getItem(){
		return this.item;
	}
	
	public void setQuantity(int quantity){
		this.quantity = quantity;
	}
	public int getQuantity(){
		return this.quantity;
	}
	
	public void setTotalAmount(double totalAmount){
		this.totalAmount = totalAmount;
	}
	public double getTotalAmount(){
		return this.totalAmount;
	}
}