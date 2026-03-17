class FactoryExecutor{

	public static void main(String[] args){

	Factory factory1=new Factory();
	factory1.factoryId=1;
	factory1.factoryName="Tata Motors Plant";
	factory1.location="Pune";
	factory1.workers=500;
	factory1.owner="Tata Group";
	factory1.productType="Automobiles";
	factory1.revenue=8000000;
	factory1.rating=5;

	Machine machine1=new Machine();
	machine1.machineId=101;
	machine1.machineName="Assembly Robot";
	machine1.machineType="Automation";
	machine1.manufacturer="ABB";
	machine1.powerSource="Electric";
	machine1.cost=500000;
	machine1.capacity="High";
	machine1.status="Active";

	factory1.machine=machine1;


	Factory factory2=new Factory();
	factory2.factoryId=2;
	factory2.factoryName="Toyota Plant";
	factory2.location="Bangalore";
	factory2.workers=450;
	factory2.owner="Toyota";
	factory2.productType="Cars";
	factory2.revenue=7500000;
	factory2.rating=5;

	Machine machine2=new Machine();
	machine2.machineId=102;
	machine2.machineName="Paint Robot";
	machine2.machineType="Automation";
	machine2.manufacturer="KUKA";
	machine2.powerSource="Electric";
	machine2.cost=400000;
	machine2.capacity="Medium";
	machine2.status="Active";

	factory2.machine=machine2;


	Factory factory3=new Factory();
	factory3.factoryId=3;
	factory3.factoryName="Samsung Electronics";
	factory3.location="Noida";
	factory3.workers=600;
	factory3.owner="Samsung";
	factory3.productType="Electronics";
	factory3.revenue=9000000;
	factory3.rating=5;

	Machine machine3=new Machine();
	machine3.machineId=103;
	machine3.machineName="Chip Machine";
	machine3.machineType="Semiconductor";
	machine3.manufacturer="ASML";
	machine3.powerSource="Electric";
	machine3.cost=800000;
	machine3.capacity="High";
	machine3.status="Active";

	factory3.machine=machine3;


	Factory factory4=new Factory();
	factory4.factoryId=4;
	factory4.factoryName="Nestle Factory";
	factory4.location="Goa";
	factory4.workers=300;
	factory4.owner="Nestle";
	factory4.productType="Food";
	factory4.revenue=4000000;
	factory4.rating=4;

	Machine machine4=new Machine();
	machine4.machineId=104;
	machine4.machineName="Packaging Machine";
	machine4.machineType="Automatic";
	machine4.manufacturer="Bosch";
	machine4.powerSource="Electric";
	machine4.cost=250000;
	machine4.capacity="Medium";
	machine4.status="Active";

	factory4.machine=machine4;


	Factory factory5=new Factory();
	factory5.factoryId=5;
	factory5.factoryName="Amul Dairy";
	factory5.location="Gujarat";
	factory5.workers=350;
	factory5.owner="Amul";
	factory5.productType="Dairy";
	factory5.revenue=5000000;
	factory5.rating=5;

	Machine machine5=new Machine();
	machine5.machineId=105;
	machine5.machineName="Milk Processing Machine";
	machine5.machineType="Food Processing";
	machine5.manufacturer="Tetra Pak";
	machine5.powerSource="Electric";
	machine5.cost=300000;
	machine5.capacity="High";
	machine5.status="Active";

	factory5.machine=machine5;
	
		Factory factory6=new Factory();
	factory6.factoryId=6;
	factory6.factoryName="Hyundai Plant";
	factory6.location="Chennai";
	factory6.workers=480;
	factory6.owner="Hyundai";
	factory6.productType="Automobiles";
	factory6.revenue=7200000;
	factory6.rating=5;

	Machine machine6=new Machine();
	machine6.machineId=106;
	machine6.machineName="Welding Robot";
	machine6.machineType="Automation";
	machine6.manufacturer="ABB";
	machine6.powerSource="Electric";
	machine6.cost=450000;
	machine6.capacity="High";
	machine6.status="Active";

	factory6.machine=machine6;


	Factory factory7=new Factory();
	factory7.factoryId=7;
	factory7.factoryName="Mahindra Plant";
	factory7.location="Nashik";
	factory7.workers=420;
	factory7.owner="Mahindra";
	factory7.productType="Automobiles";
	factory7.revenue=6500000;
	factory7.rating=4;

	Machine machine7=new Machine();
	machine7.machineId=107;
	machine7.machineName="Drilling Machine";
	machine7.machineType="Mechanical";
	machine7.manufacturer="Bosch";
	machine7.powerSource="Electric";
	machine7.cost=180000;
	machine7.capacity="Medium";
	machine7.status="Active";

	factory7.machine=machine7;


	Factory factory8=new Factory();
	factory8.factoryId=8;
	factory8.factoryName="LG Electronics";
	factory8.location="Pune";
	factory8.workers=390;
	factory8.owner="LG";
	factory8.productType="Electronics";
	factory8.revenue=5800000;
	factory8.rating=4;

	Machine machine8=new Machine();
	machine8.machineId=108;
	machine8.machineName="Circuit Machine";
	machine8.machineType="Electronics";
	machine8.manufacturer="Siemens";
	machine8.powerSource="Electric";
	machine8.cost=320000;
	machine8.capacity="High";
	machine8.status="Active";

	factory8.machine=machine8;


	Factory factory9=new Factory();
	factory9.factoryId=9;
	factory9.factoryName="ITC Factory";
	factory9.location="Kolkata";
	factory9.workers=300;
	factory9.owner="ITC";
	factory9.productType="FMCG";
	factory9.revenue=4100000;
	factory9.rating=4;

	Machine machine9=new Machine();
	machine9.machineId=109;
	machine9.machineName="Packing Unit";
	machine9.machineType="Automatic";
	machine9.manufacturer="Bosch";
	machine9.powerSource="Electric";
	machine9.cost=220000;
	machine9.capacity="Medium";
	machine9.status="Active";

	factory9.machine=machine9;


	Factory factory10=new Factory();
	factory10.factoryId=10;
	factory10.factoryName="CocaCola Plant";
	factory10.location="Delhi";
	factory10.workers=360;
	factory10.owner="CocaCola";
	factory10.productType="Beverages";
	factory10.revenue=4600000;
	factory10.rating=5;

	Machine machine10=new Machine();
	machine10.machineId=110;
	machine10.machineName="Bottle Filling Machine";
	machine10.machineType="Food Processing";
	machine10.manufacturer="Tetra Pak";
	machine10.powerSource="Electric";
	machine10.cost=310000;
	machine10.capacity="High";
	machine10.status="Active";

	factory10.machine=machine10;


/* continuing same pattern */

	Factory factory11=new Factory();
	factory11.factoryId=11;
	factory11.factoryName="Pepsi Factory";
	factory11.location="Mumbai";
	factory11.workers=340;
	factory11.owner="PepsiCo";
	factory11.productType="Beverages";
	factory11.revenue=4300000;
	factory11.rating=4;

	Machine machine11=new Machine();
	machine11.machineId=111;
	machine11.machineName="Can Sealing Machine";
	machine11.machineType="Automatic";
	machine11.manufacturer="Siemens";
	machine11.powerSource="Electric";
	machine11.cost=280000;
	machine11.capacity="Medium";
	machine11.status="Active";

	factory11.machine=machine11;


	Factory factory12=new Factory();
	factory12.factoryId=12;
	factory12.factoryName="Britannia Factory";
	factory12.location="Bangalore";
	factory12.workers=310;
	factory12.owner="Britannia";
	factory12.productType="Food";
	factory12.revenue=3900000;
	factory12.rating=4;

	Machine machine12=new Machine();
	machine12.machineId=112;
	machine12.machineName="Biscuit Machine";
	machine12.machineType="Food Processing";
	machine12.manufacturer="Bosch";
	machine12.powerSource="Electric";
	machine12.cost=260000;
	machine12.capacity="Medium";
	machine12.status="Active";

	factory12.machine=machine12;


	Factory factory13=new Factory();
	factory13.factoryId=13;
	factory13.factoryName="Parle Factory";
	factory13.location="Mumbai";
	factory13.workers=295;
	factory13.owner="Parle";
	factory13.productType="Food";
	factory13.revenue=3700000;
	factory13.rating=4;

	Machine machine13=new Machine();
	machine13.machineId=113;
	machine13.machineName="Biscuit Cutter";
	machine13.machineType="Mechanical";
	machine13.manufacturer="Bosch";
	machine13.powerSource="Electric";
	machine13.cost=210000;
	machine13.capacity="Medium";
	machine13.status="Active";

	factory13.machine=machine13;


	Factory factory14=new Factory();
	factory14.factoryId=14;
	factory14.factoryName="Hindustan Unilever";
	factory14.location="Kolkata";
	factory14.workers=330;
	factory14.owner="HUL";
	factory14.productType="FMCG";
	factory14.revenue=4200000;
	factory14.rating=5;

	Machine machine14=new Machine();
	machine14.machineId=114;
	machine14.machineName="Soap Machine";
	machine14.machineType="Automatic";
	machine14.manufacturer="Siemens";
	machine14.powerSource="Electric";
	machine14.cost=290000;
	machine14.capacity="High";
	machine14.status="Active";

	factory14.machine=machine14;


	Factory factory15=new Factory();
	factory15.factoryId=15;
	factory15.factoryName="Asian Paints";
	factory15.location="Mumbai";
	factory15.workers=350;
	factory15.owner="Asian Paints";
	factory15.productType="Paint";
	factory15.revenue=4500000;
	factory15.rating=5;

	Machine machine15=new Machine();
	machine15.machineId=115;
	machine15.machineName="Paint Mixer";
	machine15.machineType="Chemical";
	machine15.manufacturer="ABB";
	machine15.powerSource="Electric";
	machine15.cost=300000;
	machine15.capacity="High";
	machine15.status="Active";

	factory15.machine=machine15;


	Factory factory16=new Factory();
	factory16.factoryId=16;
	factory16.factoryName="Reliance Industries";
	factory16.location="Jamnagar";
	factory16.workers=370;
	factory16.owner="Reliance";
	factory16.productType="Petrochemicals";
	factory16.revenue=5000000;
	factory16.rating=5;

	Machine machine16=new Machine();
	machine16.machineId=116;
	machine16.machineName="Refinery Machine";
	machine16.machineType="Chemical";
	machine16.manufacturer="Siemens";
	machine16.powerSource="Electric";
	machine16.cost=420000;
	machine16.capacity="High";
	machine16.status="Active";

	factory16.machine=machine16;


	Factory factory17=new Factory();
	factory17.factoryId=17;
	factory17.factoryName="Hero Motors";
	factory17.location="Gurgaon";
	factory17.workers=340;
	factory17.owner="Hero";
	factory17.productType="Bikes";
	factory17.revenue=4100000;
	factory17.rating=4;

	Machine machine17=new Machine();
	machine17.machineId=117;
	machine17.machineName="Engine Assembly Machine";
	machine17.machineType="Mechanical";
	machine17.manufacturer="Bosch";
	machine17.powerSource="Electric";
	machine17.cost=310000;
	machine17.capacity="Medium";
	machine17.status="Active";

	factory17.machine=machine17;


	Factory factory18=new Factory();
	factory18.factoryId=18;
	factory18.factoryName="Honda Factory";
	factory18.location="Manesar";
	factory18.workers=360;
	factory18.owner="Honda";
	factory18.productType="Cars";
	factory18.revenue=4700000;
	factory18.rating=5;

	Machine machine18=new Machine();
	machine18.machineId=118;
	machine18.machineName="Robot Arm";
	machine18.machineType="Automation";
	machine18.manufacturer="ABB";
	machine18.powerSource="Electric";
	machine18.cost=390000;
	machine18.capacity="High";
	machine18.status="Active";

	factory18.machine=machine18;


	Factory factory19=new Factory();
	factory19.factoryId=19;
	factory19.factoryName="Bajaj Auto";
	factory19.location="Pune";
	factory19.workers=330;
	factory19.owner="Bajaj";
	factory19.productType="Motorcycles";
	factory19.revenue=4300000;
	factory19.rating=4;

	Machine machine19=new Machine();
	machine19.machineId=119;
	machine19.machineName="CNC Machine";
	machine19.machineType="Mechanical";
	machine19.manufacturer="Fanuc";
	machine19.powerSource="Electric";
	machine19.cost=280000;
	machine19.capacity="Medium";
	machine19.status="Active";

	factory19.machine=machine19;


	Factory factory20=new Factory();
	factory20.factoryId=20;
	factory20.factoryName="JSW Steel";
	factory20.location="Bellary";
	factory20.workers=420;
	factory20.owner="JSW";
	factory20.productType="Steel";
	factory20.revenue=5200000;
	factory20.rating=5;

	Machine machine20=new Machine();
	machine20.machineId=120;
	machine20.machineName="Rolling Mill Machine";
	machine20.machineType="Industrial";
	machine20.manufacturer="Siemens";
	machine20.powerSource="Electric";
	machine20.cost=450000;
	machine20.capacity="High";
	machine20.status="Active";

	factory20.machine=machine20;
	
	factory1.getMachineDetails();
factory2.getMachineDetails();
factory3.getMachineDetails();
factory4.getMachineDetails();
factory5.getMachineDetails();
factory6.getMachineDetails();
factory7.getMachineDetails();
factory8.getMachineDetails();
factory9.getMachineDetails();
factory10.getMachineDetails();
factory11.getMachineDetails();
factory12.getMachineDetails();
factory13.getMachineDetails();
factory14.getMachineDetails();
factory15.getMachineDetails();
factory16.getMachineDetails();
factory17.getMachineDetails();
factory18.getMachineDetails();
factory19.getMachineDetails();
factory20.getMachineDetails();
	}
}