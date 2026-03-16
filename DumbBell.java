class DumbBell{

String brand;
String material;
String color;
String type;
String shape;
String grip;
String coating;
String usage;
String origin;
String design;
int weight;
int price;
int quantity;
int stock;
int rating;
int durability;
int warranty;
int code;
int batch;
int year;

DumbBell(String brand,String material,String color,String type,String shape,
String grip,String coating,String usage,String origin,String design,
int weight,int price,int quantity,int stock,int rating,
int durability,int warranty,int code,int batch,int year){

this.brand=brand;
this.material=material;
this.color=color;
this.type=type;
this.shape=shape;
this.grip=grip;
this.coating=coating;
this.usage=usage;
this.origin=origin;
this.design=design;
this.weight=weight;
this.price=price;
this.quantity=quantity;
this.stock=stock;
this.rating=rating;
this.durability=durability;
this.warranty=warranty;
this.code=code;
this.batch=batch;
this.year=year;
}

void getDumbBellDetails(){

System.out.println("Brand:"+brand);
System.out.println("Material:"+material);
System.out.println("Color:"+color);
System.out.println("Type:"+type);
System.out.println("Shape:"+shape);
System.out.println("Grip:"+grip);
System.out.println("Coating:"+coating);
System.out.println("Usage:"+usage);
System.out.println("Origin:"+origin);
System.out.println("Design:"+design);
System.out.println("Weight:"+weight);
System.out.println("Price:"+price);
System.out.println("Quantity:"+quantity);
System.out.println("Stock:"+stock);
System.out.println("Rating:"+rating);
System.out.println("Durability:"+durability);
System.out.println("Warranty:"+warranty);
System.out.println("Code:"+code);
System.out.println("Batch:"+batch);
System.out.println("Year:"+year);

}
}