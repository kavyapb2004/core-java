class Article{

	int articleId;
	String title;
	String author;
	String category;
	int wordCount;
	String publishDate;
	String location;
	boolean featured;

	public void getArticleDetails(){

		System.out.println("Article Id: "+this.articleId);
		System.out.println("Title: "+this.title);
		System.out.println("Author: "+this.author);
		System.out.println("Category: "+this.category);
		System.out.println("Word Count: "+this.wordCount);
		System.out.println("Publish Date: "+this.publishDate);
		System.out.println("Location: "+this.location);
		System.out.println("Featured: "+this.featured);
	}
}