class DiabetesRunner{

public static void main(String[] args){

Diabetes d1=new Diabetes("Type1","Genetic","Thirst","Fatigue","Insulin","Metformin","LowSugar","Exercise","High","Chronic",180,25,70,170,5,101,1,2023,200,150);
Diabetes d2=new Diabetes("Type2","Lifestyle","Hunger","BlurredVision","Diet","Insulin","LowCarb","Exercise","Medium","Chronic",200,45,80,168,4,102,2,2022,300,220);
Diabetes d3=new Diabetes("Gestational","Pregnancy","Thirst","Fatigue","Diet","None","Healthy","Checkup","Medium","Temporary",170,30,65,165,4,103,3,2023,150,120);
Diabetes d4=new Diabetes("Type2","Obesity","Hunger","Weakness","Diet","Metformin","LowSugar","Exercise","High","Chronic",210,50,90,172,4,104,4,2024,350,260);
Diabetes d5=new Diabetes("Type1","Genetic","Thirst","BlurredVision","Insulin","Metformin","LowCarb","Exercise","High","Chronic",190,28,75,169,5,105,5,2023,220,170);
Diabetes d6=new Diabetes("Type2","Lifestyle","Fatigue","Hunger","Diet","Insulin","LowSugar","Exercise","Medium","Chronic",205,55,85,171,4,106,6,2022,310,240);
Diabetes d7=new Diabetes("Type1","Genetic","Thirst","Fatigue","Insulin","Metformin","LowCarb","Exercise","High","Chronic",185,26,72,168,5,107,7,2023,210,165);
Diabetes d8=new Diabetes("Type2","Lifestyle","Hunger","BlurredVision","Diet","Insulin","LowSugar","Exercise","Medium","Chronic",215,60,92,174,4,108,8,2024,370,280);
Diabetes d9=new Diabetes("Gestational","Pregnancy","Thirst","Weakness","Diet","None","Healthy","Checkup","Medium","Temporary",175,32,66,166,4,109,9,2023,160,130);
Diabetes d10=new Diabetes("Type2","Lifestyle","Fatigue","BlurredVision","Diet","Metformin","LowCarb","Exercise","High","Chronic",220,58,88,173,4,110,10,2024,390,300);

d1.getDiabetesDetails();
d2.getDiabetesDetails();
d3.getDiabetesDetails();
d4.getDiabetesDetails();
d5.getDiabetesDetails();
d6.getDiabetesDetails();
d7.getDiabetesDetails();
d8.getDiabetesDetails();
d9.getDiabetesDetails();
d10.getDiabetesDetails();

}
}