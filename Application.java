class Application{

	int appId;
	String appName;
	String category;
	String developer;
	double size;
	int downloads;
	double rating;
	boolean free;

	public void getApplicationDetails(){

		System.out.println("App Id: "+this.appId);
		System.out.println("App Name: "+this.appName);
		System.out.println("Category: "+this.category);
		System.out.println("Developer: "+this.developer);
		System.out.println("Size: "+this.size+" MB");
		System.out.println("Downloads: "+this.downloads);
		System.out.println("Rating: "+this.rating);
		System.out.println("Free: "+this.free);
	}
}