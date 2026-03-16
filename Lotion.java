class Lotion{

String brand;
String fragrance;
String color;
String ingredient;
String skinType;
String packaging;
String origin;
String type;
String usage;
String category;
int price;
int volume;
int quantity;
int stock;
int rating;
int code;
int batch;
int year;
int warranty;
int sales;

Lotion(String brand,String fragrance,String color,String ingredient,String skinType,
String packaging,String origin,String type,String usage,String category,
int price,int volume,int quantity,int stock,int rating,
int code,int batch,int year,int warranty,int sales){

this.brand=brand;
this.fragrance=fragrance;
this.color=color;
this.ingredient=ingredient;
this.skinType=skinType;
this.packaging=packaging;
this.origin=origin;
this.type=type;
this.usage=usage;
this.category=category;
this.price=price;
this.volume=volume;
this.quantity=quantity;
this.stock=stock;
this.rating=rating;
this.code=code;
this.batch=batch;
this.year=year;
this.warranty=warranty;
this.sales=sales;

}

void getLotionDetails(){

System.out.println("Brand:"+brand);
System.out.println("Fragrance:"+fragrance);
System.out.println("Color:"+color);
System.out.println("Ingredient:"+ingredient);
System.out.println("SkinType:"+skinType);
System.out.println("Packaging:"+packaging);
System.out.println("Origin:"+origin);
System.out.println("Type:"+type);
System.out.println("Usage:"+usage);
System.out.println("Category:"+category);
System.out.println("Price:"+price);
System.out.println("Volume:"+volume);
System.out.println("Quantity:"+quantity);
System.out.println("Stock:"+stock);
System.out.println("Rating:"+rating);
System.out.println("Code:"+code);
System.out.println("Batch:"+batch);
System.out.println("Year:"+year);
System.out.println("Warranty:"+warranty);
System.out.println("Sales:"+sales);

}
}