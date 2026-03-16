class Diabetes{

String type;
String cause;
String symptom1;
String symptom2;
String treatment;
String medicine;
String diet;
String prevention;
String risk;
String category;
int sugarLevel;
int age;
int weight;
int height;
int rating;
int code;
int batch;
int year;
int cases;
int patients;

Diabetes(String type,String cause,String symptom1,String symptom2,String treatment,
String medicine,String diet,String prevention,String risk,String category,
int sugarLevel,int age,int weight,int height,int rating,
int code,int batch,int year,int cases,int patients){

this.type=type;
this.cause=cause;
this.symptom1=symptom1;
this.symptom2=symptom2;
this.treatment=treatment;
this.medicine=medicine;
this.diet=diet;
this.prevention=prevention;
this.risk=risk;
this.category=category;
this.sugarLevel=sugarLevel;
this.age=age;
this.weight=weight;
this.height=height;
this.rating=rating;
this.code=code;
this.batch=batch;
this.year=year;
this.cases=cases;
this.patients=patients;
}

void getDiabetesDetails(){

System.out.println("Type:"+type);
System.out.println("Cause:"+cause);
System.out.println("Symptom1:"+symptom1);
System.out.println("Symptom2:"+symptom2);
System.out.println("Treatment:"+treatment);
System.out.println("Medicine:"+medicine);
System.out.println("Diet:"+diet);
System.out.println("Prevention:"+prevention);
System.out.println("Risk:"+risk);
System.out.println("Category:"+category);
System.out.println("SugarLevel:"+sugarLevel);
System.out.println("Age:"+age);
System.out.println("Weight:"+weight);
System.out.println("Height:"+height);
System.out.println("Rating:"+rating);
System.out.println("Code:"+code);
System.out.println("Batch:"+batch);
System.out.println("Year:"+year);
System.out.println("Cases:"+cases);
System.out.println("Patients:"+patients);

}
}