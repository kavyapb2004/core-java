class WallPaper{

String brand;
String color;
String design;
String material;
String texture;
String size;
String pattern;
String finish;
String type;
String style;
int price;
int width;
int height;
int weight;
int stock;
int rating;
int durability;
int warranty;
int quantity;
int code;

WallPaper(String brand,String color,String design,String material,String texture,
String size,String pattern,String finish,String type,String style,
int price,int width,int height,int weight,int stock,
int rating,int durability,int warranty,int quantity,int code){

this.brand=brand;
this.color=color;
this.design=design;
this.material=material;
this.texture=texture;
this.size=size;
this.pattern=pattern;
this.finish=finish;
this.type=type;
this.style=style;
this.price=price;
this.width=width;
this.height=height;
this.weight=weight;
this.stock=stock;
this.rating=rating;
this.durability=durability;
this.warranty=warranty;
this.quantity=quantity;
this.code=code;
}

void getWallPaperDetails(){

System.out.println("Brand:"+brand);
System.out.println("Color:"+color);
System.out.println("Design:"+design);
System.out.println("Material:"+material);
System.out.println("Texture:"+texture);
System.out.println("Size:"+size);
System.out.println("Pattern:"+pattern);
System.out.println("Finish:"+finish);
System.out.println("Type:"+type);
System.out.println("Style:"+style);
System.out.println("Price:"+price);
System.out.println("Width:"+width);
System.out.println("Height:"+height);
System.out.println("Weight:"+weight);
System.out.println("Stock:"+stock);
System.out.println("Rating:"+rating);
System.out.println("Durability:"+durability);
System.out.println("Warranty:"+warranty);
System.out.println("Quantity:"+quantity);
System.out.println("Code:"+code);

}
}