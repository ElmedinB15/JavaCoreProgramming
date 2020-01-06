
package Four;

public class Book{

private String title;
private String author;
private String publisher;
private String copyright;

public Book(String title,String author,String publisher,String copyright){
    
    this.title =title;
    this.author = author;
    this.publisher = publisher;
    this.copyright = copyright;

}  public String toString(){

  return this.title;

} public void bookDetails(){

  System.out.println(this.title);
  System.out.println(this.author);
  System.out.println(this.publisher);
  System.out.println(this.copyright);
}
public String getTitle(){

 return this.title;
}
}

