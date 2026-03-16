class Table{

    int height;
    int width;
    int length;
    int weight;
    int price;
    int legs;
    int warranty;
    int modelNo;
    int year;
    int stock;
    int code;
    int capacity;

    Table(){
        System.out.println("Default Constructor Called");
    }

    Table(int height,int width,int length,int weight,int price,int legs,
          int warranty,int modelNo,int year,int stock,int code,int capacity){

        this.height=height;
        this.width=width;
        this.length=length;
        this.weight=weight;
        this.price=price;
        this.legs=legs;
        this.warranty=warranty;
        this.modelNo=modelNo;
        this.year=year;
        this.stock=stock;
        this.code=code;
        this.capacity=capacity;
    }
}
