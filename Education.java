class Education{

String course;
String subject;
String institution;
String city;
String country;
String degree;
String department;
String language;
String mode;
String category;
int students;
int teachers;
int duration;
int rating;
int code;
int batch;
int year;
int classrooms;
int labs;
int fees;

Education(String course,String subject,String institution,String city,String country,
String degree,String department,String language,String mode,String category,
int students,int teachers,int duration,int rating,int code,
int batch,int year,int classrooms,int labs,int fees){

this.course=course;
this.subject=subject;
this.institution=institution;
this.city=city;
this.country=country;
this.degree=degree;
this.department=department;
this.language=language;
this.mode=mode;
this.category=category;
this.students=students;
this.teachers=teachers;
this.duration=duration;
this.rating=rating;
this.code=code;
this.batch=batch;
this.year=year;
this.classrooms=classrooms;
this.labs=labs;
this.fees=fees;

}

void getEducationDetails(){

System.out.println("Course:"+course);
System.out.println("Subject:"+subject);
System.out.println("Institution:"+institution);
System.out.println("City:"+city);
System.out.println("Country:"+country);
System.out.println("Degree:"+degree);
System.out.println("Department:"+department);
System.out.println("Language:"+language);
System.out.println("Mode:"+mode);
System.out.println("Category:"+category);
System.out.println("Students:"+students);
System.out.println("Teachers:"+teachers);
System.out.println("Duration:"+duration);
System.out.println("Rating:"+rating);
System.out.println("Code:"+code);
System.out.println("Batch:"+batch);
System.out.println("Year:"+year);
System.out.println("Classrooms:"+classrooms);
System.out.println("Labs:"+labs);
System.out.println("Fees:"+fees);

}
}