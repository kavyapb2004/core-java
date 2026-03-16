class Office{

String name;
String location;
String type;
String department;
String company;
String building;
String city;
String country;
String service;
String category;
int employees;
int rooms;
int floors;
int rating;
int code;
int batch;
int year;
int seats;
int parking;
int revenue;

Office(String name,String location,String type,String department,String company,
String building,String city,String country,String service,String category,
int employees,int rooms,int floors,int rating,int code,
int batch,int year,int seats,int parking,int revenue){

this.name=name;
this.location=location;
this.type=type;
this.department=department;
this.company=company;
this.building=building;
this.city=city;
this.country=country;
this.service=service;
this.category=category;
this.employees=employees;
this.rooms=rooms;
this.floors=floors;
this.rating=rating;
this.code=code;
this.batch=batch;
this.year=year;
this.seats=seats;
this.parking=parking;
this.revenue=revenue;

}

void getOfficeDetails(){

System.out.println("Name:"+name);
System.out.println("Location:"+location);
System.out.println("Type:"+type);
System.out.println("Department:"+department);
System.out.println("Company:"+company);
System.out.println("Building:"+building);
System.out.println("City:"+city);
System.out.println("Country:"+country);
System.out.println("Service:"+service);
System.out.println("Category:"+category);
System.out.println("Employees:"+employees);
System.out.println("Rooms:"+rooms);
System.out.println("Floors:"+floors);
System.out.println("Rating:"+rating);
System.out.println("Code:"+code);
System.out.println("Batch:"+batch);
System.out.println("Year:"+year);
System.out.println("Seats:"+seats);
System.out.println("Parking:"+parking);
System.out.println("Revenue:"+revenue);

}
}