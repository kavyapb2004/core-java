class Printer{

int price,weight,pagesPerMin,modelNo,year,stock,code,warranty,paperTray,inkLevel,width,height;

Printer(){
System.out.println("Default Constructor Called");
}

Printer(int price,int weight,int pagesPerMin,int modelNo,int year,int stock,int code,int warranty,int paperTray,int inkLevel,int width,int height){

this.price=price;
this.weight=weight;
this.pagesPerMin=pagesPerMin;
this.modelNo=modelNo;
this.year=year;
this.stock=stock;
this.code=code;
this.warranty=warranty;
this.paperTray=paperTray;
this.inkLevel=inkLevel;
this.width=width;
this.height=height;
}
}
