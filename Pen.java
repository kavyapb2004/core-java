class Pen {

    int length;
    int weight;
    int price;
    int inkLevel;
    int modelNo;
    int batchNo;
    int warranty;
    int year;
    int quantity;
    int capSize;
    int gripSize;
    int serialNo;

    Pen(){
        System.out.println("Default Constructor Called");
    }

    Pen(int length,int weight,int price,int inkLevel,int modelNo,int batchNo,
        int warranty,int year,int quantity,int capSize,int gripSize,int serialNo){

        this.length=length;
        this.weight=weight;
        this.price=price;
        this.inkLevel=inkLevel;
        this.modelNo=modelNo;
        this.batchNo=batchNo;
        this.warranty=warranty;
        this.year=year;
        this.quantity=quantity;
        this.capSize=capSize;
        this.gripSize=gripSize;
        this.serialNo=serialNo;
    }
}
