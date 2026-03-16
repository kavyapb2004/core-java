class Stand{

String type;
String material;
String color;
String brand;
String shape;
String style;
String finish;
String use;
String origin;
String design;
int price;
int height;
int width;
int weight;
int stock;
int rating;
int durability;
int warranty;
int quantity;
int code;

Stand(String type,String material,String color,String brand,String shape,
String style,String finish,String use,String origin,String design,
int price,int height,int width,int weight,int stock,
int rating,int durability,int warranty,int quantity,int code){

this.type=type;
this.material=material;
this.color=color;
this.brand=brand;
this.shape=shape;
this.style=style;
this.finish=finish;
this.use=use;
this.origin=origin;
this.design=design;
this.price=price;
this.height=height;
this.width=width;
this.weight=weight;
this.stock=stock;
this.rating=rating;
this.durability=durability;
this.warranty=warranty;
this.quantity=quantity;
this.code=code;

}

void getStandDetails(){

System.out.println("Type:"+type);
System.out.println("Material:"+material);
System.out.println("Color:"+color);
System.out.println("Brand:"+brand);
System.out.println("Shape:"+shape);
System.out.println("Style:"+style);
System.out.println("Finish:"+finish);
System.out.println("Use:"+use);
System.out.println("Origin:"+origin);
System.out.println("Design:"+design);
System.out.println("Price:"+price);
System.out.println("Height:"+height);
System.out.println("Width:"+width);
System.out.println("Weight:"+weight);
System.out.println("Stock:"+stock);
System.out.println("Rating:"+rating);
System.out.println("Durability:"+durability);
System.out.println("Warranty:"+warranty);
System.out.println("Quantity:"+quantity);
System.out.println("Code:"+code);

}
}