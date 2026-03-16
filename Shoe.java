class Shoe{

    int price;
    int weight;
    int size;
    int modelNo;
    int year;
    int stock;
    int code;
    int warranty;
    int length;
    int width;
    int height;
    int soleThickness;

    Shoe(){
        System.out.println("Default Constructor Called");
    }

    Shoe(int price,int weight,int size,int modelNo,int year,int stock,
         int code,int warranty,int length,int width,int height,int soleThickness){

        this.price=price;
        this.weight=weight;
        this.size=size;
        this.modelNo=modelNo;
        this.year=year;
        this.stock=stock;
        this.code=code;
        this.warranty=warranty;
        this.length=length;
        this.width=width;
        this.height=height;
        this.soleThickness=soleThickness;
    }
}