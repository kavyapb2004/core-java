class Brain{

String part;
String function;
String color;
String type;
String layer;
String region;
String species;
String system;
String category;
String health;
int weight;
int cells;
int neurons;
int signals;
int rating;
int code;
int batch;
int year;
int size;
int capacity;

Brain(String part,String function,String color,String type,String layer,
String region,String species,String system,String category,String health,
int weight,int cells,int neurons,int signals,int rating,
int code,int batch,int year,int size,int capacity){

this.part=part;
this.function=function;
this.color=color;
this.type=type;
this.layer=layer;
this.region=region;
this.species=species;
this.system=system;
this.category=category;
this.health=health;
this.weight=weight;
this.cells=cells;
this.neurons=neurons;
this.signals=signals;
this.rating=rating;
this.code=code;
this.batch=batch;
this.year=year;
this.size=size;
this.capacity=capacity;
}

void getBrainDetails(){

System.out.println("Part:"+part);
System.out.println("Function:"+function);
System.out.println("Color:"+color);
System.out.println("Type:"+type);
System.out.println("Layer:"+layer);
System.out.println("Region:"+region);
System.out.println("Species:"+species);
System.out.println("System:"+system);
System.out.println("Category:"+category);
System.out.println("Health:"+health);
System.out.println("Weight:"+weight);
System.out.println("Cells:"+cells);
System.out.println("Neurons:"+neurons);
System.out.println("Signals:"+signals);
System.out.println("Rating:"+rating);
System.out.println("Code:"+code);
System.out.println("Batch:"+batch);
System.out.println("Year:"+year);
System.out.println("Size:"+size);
System.out.println("Capacity:"+capacity);

}
}