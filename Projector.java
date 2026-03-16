class Projector{

    int price;
    int weight;
    int brightness;
    int resolution;
    int modelNo;
    int year;
    int stock;
    int code;
    int warranty;
    int range;
    int width;
    int height;

    Projector(){
        System.out.println("Default Constructor Called");
    }

    Projector(int price,int weight,int brightness,int resolution,int modelNo,
              int year,int stock,int code,int warranty,int range,int width,int height){

        this.price=price;
        this.weight=weight;
        this.brightness=brightness;
        this.resolution=resolution;
        this.modelNo=modelNo;
        this.year=year;
        this.stock=stock;
        this.code=code;
        this.warranty=warranty;
        this.range=range;
        this.width=width;
        this.height=height;
    }
}