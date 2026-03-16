class Cell{

String type;
String shape;
String color;
String function;
String organism;
String structure;
String membrane;
String nucleus;
String cytoplasm;
String category;
int size;
int count;
int energy;
int rating;
int code;
int batch;
int year;
int division;
int age;
int capacity;

Cell(String type,String shape,String color,String function,String organism,
String structure,String membrane,String nucleus,String cytoplasm,String category,
int size,int count,int energy,int rating,int code,
int batch,int year,int division,int age,int capacity){

this.type=type;
this.shape=shape;
this.color=color;
this.function=function;
this.organism=organism;
this.structure=structure;
this.membrane=membrane;
this.nucleus=nucleus;
this.cytoplasm=cytoplasm;
this.category=category;
this.size=size;
this.count=count;
this.energy=energy;
this.rating=rating;
this.code=code;
this.batch=batch;
this.year=year;
this.division=division;
this.age=age;
this.capacity=capacity;

}

void getCellDetails(){

System.out.println("Type:"+type);
System.out.println("Shape:"+shape);
System.out.println("Color:"+color);
System.out.println("Function:"+function);
System.out.println("Organism:"+organism);
System.out.println("Structure:"+structure);
System.out.println("Membrane:"+membrane);
System.out.println("Nucleus:"+nucleus);
System.out.println("Cytoplasm:"+cytoplasm);
System.out.println("Category:"+category);
System.out.println("Size:"+size);
System.out.println("Count:"+count);
System.out.println("Energy:"+energy);
System.out.println("Rating:"+rating);
System.out.println("Code:"+code);
System.out.println("Batch:"+batch);
System.out.println("Year:"+year);
System.out.println("Division:"+division);
System.out.println("Age:"+age);
System.out.println("Capacity:"+capacity);

}
}