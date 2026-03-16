class Google{

String founder;
String ceo;
int employees;
int foundedYear;
String headquarters;
String product1;
String product2;
String product3;
String service1;
String service2;
String service3;
String country;
int offices;
int revenue;
int users;
String website;
String parentCompany;
String stockSymbol;
String type;
String industry;

Google(String founder,String ceo,int employees,int foundedYear,String headquarters,
String product1,String product2,String product3,
String service1,String service2,String service3,
String country,int offices,int revenue,int users,
String website,String parentCompany,String stockSymbol,
String type,String industry){

this.founder=founder;
this.ceo=ceo;
this.employees=employees;
this.foundedYear=foundedYear;
this.headquarters=headquarters;
this.product1=product1;
this.product2=product2;
this.product3=product3;
this.service1=service1;
this.service2=service2;
this.service3=service3;
this.country=country;
this.offices=offices;
this.revenue=revenue;
this.users=users;
this.website=website;
this.parentCompany=parentCompany;
this.stockSymbol=stockSymbol;
this.type=type;
this.industry=industry;
}

void getGoogleDetails(){

System.out.println("Founder : "+founder);
System.out.println("CEO : "+ceo);
System.out.println("Employees : "+employees);
System.out.println("Founded Year : "+foundedYear);
System.out.println("Headquarters : "+headquarters);
System.out.println("Product1 : "+product1);
System.out.println("Product2 : "+product2);
System.out.println("Product3 : "+product3);
System.out.println("Service1 : "+service1);
System.out.println("Service2 : "+service2);
System.out.println("Service3 : "+service3);
System.out.println("Country : "+country);
System.out.println("Offices : "+offices);
System.out.println("Revenue : "+revenue);
System.out.println("Users : "+users);
System.out.println("Website : "+website);
System.out.println("Parent Company : "+parentCompany);
System.out.println("Stock Symbol : "+stockSymbol);
System.out.println("Type : "+type);
System.out.println("Industry : "+industry);

}

}