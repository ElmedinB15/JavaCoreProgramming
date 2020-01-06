/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Four;

import Four.Library;

public class UI {
public static void main(String[]args){
    
   Library L = new Library();
   L.addBook("Jeff Bezos","ALL in one","Mark Zuckerberg","JavaBasics");
    L.addBook("Elon Musk","Third java edition","John Kendrick","JavaAdvanced");
    L.removeBook("Third java edition");
    L.showBooks();
    L.bookDetails("ALL in one");
  }
    
    
}
