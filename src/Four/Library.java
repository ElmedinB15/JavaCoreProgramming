/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Four;


import Four.Book;
import java.util.ArrayList;
public class Library{

  ArrayList<Book> books = new ArrayList();

  public void addBook(String author,String title,String publisher,String copyright){

    Book b = new Book(title,author,publisher,copyright);
    books.add(b);

  } public void removeBook(String title){

   for(int i=0;i<books.size();i++){

     if(books.get(i).getTitle()==title){

       books.remove(i);
       
     }
  
   }

  } public void bookDetails(String title){

    for(int i=0;i<books.size();i++){

      if(books.get(i).getTitle()==title){

        books.get(i).bookDetails();
      }
    }
  }
  
  public void showBooks(){

    for(int i=0;i<books.size();i++){

      System.out.println(books.get(i));
    }
  }
}
