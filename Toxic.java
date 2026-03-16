class Toxic{

String name;
String type;
String color;
String odor;
String state;
String source;
String effect;
String category;
String usage;
String warning;
int toxicityLevel;
int quantity;
int code;
int batch;
int year;
int rating;
int weight;
int volume;
int stock;
int price;

Toxic(String name,String type,String color,String odor,String state,
String source,String effect,String category,String usage,String warning,
int toxicityLevel,int quantity,int code,int batch,int year,
int rating,int weight,int volume,int stock,int price){

this.name=name;
this.type=type;
this.color=color;
this.odor=odor;
this.state=state;
this.source=source;
this.effect=effect;
this.category=category;
this.usage=usage;
this.warning=warning;
this.toxicityLevel=toxicityLevel;
this.quantity=quantity;
this.code=code;
this.batch=batch;
this.year=year;
this.rating=rating;
this.weight=weight;
this.volume=volume;
this.stock=stock;
this.price=price;
}

void getToxicDetails(){
System.out.println("Name:"+name);
System.out.println("Type:"+type);
System.out.println("Color:"+color);
System.out.println("Odor:"+odor);
System.out.println("State:"+state);
System.out.println("Source:"+source);
System.out.println("Effect:"+effect);
System.out.println("Category:"+category);
System.out.println("Usage:"+usage);
System.out.println("Warning:"+warning);
System.out.println("ToxicityLevel:"+toxicityLevel);
System.out.println("Quantity:"+quantity);
System.out.println("Code:"+code);
System.out.println("Batch:"+batch);
System.out.println("Year:"+year);
System.out.println("Rating:"+rating);
System.out.println("Weight:"+weight);
System.out.println("Volume:"+volume);
System.out.println("Stock:"+stock);
System.out.println("Price:"+price);
}
}