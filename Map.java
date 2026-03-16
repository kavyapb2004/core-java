class Map{

String type;
String region;
String language;
String publisher;
String scale;
String material;
String color;
String style;
String country;
String design;
int price;
int width;
int height;
int weight;
int stock;
int rating;
int year;
int pages;
int quantity;
int code;

Map(String type,String region,String language,String publisher,String scale,
String material,String color,String style,String country,String design,
int price,int width,int height,int weight,int stock,
int rating,int year,int pages,int quantity,int code){

this.type=type;
this.region=region;
this.language=language;
this.publisher=publisher;
this.scale=scale;
this.material=material;
this.color=color;
this.style=style;
this.country=country;
this.design=design;
this.price=price;
this.width=width;
this.height=height;
this.weight=weight;
this.stock=stock;
this.rating=rating;
this.year=year;
this.pages=pages;
this.quantity=quantity;
this.code=code;
}

void getMapDetails(){
System.out.println("Type:"+type);
System.out.println("Region:"+region);
System.out.println("Language:"+language);
System.out.println("Publisher:"+publisher);
System.out.println("Scale:"+scale);
System.out.println("Material:"+material);
System.out.println("Color:"+color);
System.out.println("Style:"+style);
System.out.println("Country:"+country);
System.out.println("Design:"+design);
System.out.println("Price:"+price);
System.out.println("Width:"+width);
System.out.println("Height:"+height);
System.out.println("Weight:"+weight);
System.out.println("Stock:"+stock);
System.out.println("Rating:"+rating);
System.out.println("Year:"+year);
System.out.println("Pages:"+pages);
System.out.println("Quantity:"+quantity);
System.out.println("Code:"+code);
}
}