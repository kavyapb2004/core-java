class Trophy{

String type;
String material;
String color;
String shape;
String brand;
String event;
String category;
String design;
String country;
String style;
int price;
int height;
int weight;
int quantity;
int stock;
int rating;
int year;
int warranty;
int code;
int batch;

Trophy(String type,String material,String color,String shape,String brand,
String event,String category,String design,String country,String style,
int price,int height,int weight,int quantity,int stock,
int rating,int year,int warranty,int code,int batch){

this.type=type;
this.material=material;
this.color=color;
this.shape=shape;
this.brand=brand;
this.event=event;
this.category=category;
this.design=design;
this.country=country;
this.style=style;
this.price=price;
this.height=height;
this.weight=weight;
this.quantity=quantity;
this.stock=stock;
this.rating=rating;
this.year=year;
this.warranty=warranty;
this.code=code;
this.batch=batch;

}

void getTrophyDetails(){

System.out.println("Type:"+type);
System.out.println("Material:"+material);
System.out.println("Color:"+color);
System.out.println("Shape:"+shape);
System.out.println("Brand:"+brand);
System.out.println("Event:"+event);
System.out.println("Category:"+category);
System.out.println("Design:"+design);
System.out.println("Country:"+country);
System.out.println("Style:"+style);
System.out.println("Price:"+price);
System.out.println("Height:"+height);
System.out.println("Weight:"+weight);
System.out.println("Quantity:"+quantity);
System.out.println("Stock:"+stock);
System.out.println("Rating:"+rating);
System.out.println("Year:"+year);
System.out.println("Warranty:"+warranty);
System.out.println("Code:"+code);
System.out.println("Batch:"+batch);

}
}