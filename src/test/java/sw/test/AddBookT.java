package sw.test;


import static org.junit.Assert.assertEquals;

import java.util.*;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import sw.main.*;

public class AddBookT {

	private Library l=new Library();
	private String title;
	private String author;
	private String signature;
	private String iSBN;
	int t;
	int aT;
	Book b;
	int i;
	private String user1,pass1;
	private Admin a=new Admin(user1,pass1);
	List <Book> addedBooksT = new ArrayList<>();

	@Given("admin is logged in and want to add  book {string} , {string} , {string} , and a {string} with user {string} password {string}")
	public void admin_is_logged_in_and_want_to_add_book_and_a_with_user_password(String Title, String Author, String Signature, String ISBN, String user, String pass) {
		t=a.check(user,pass);
		if(t==1) {
			 title=Title;
			 author=Author;
			 signature=Signature;
			 iSBN=ISBN;
			 b=new Book(title,author,signature,iSBN);
		}	
		else {System.out.println("You are not logged in so you can't add a book !");}
		user1=user;
		pass1=pass;
}

	@When("added book")
	public void added_book() {
		if(t==1 ) {
			if(l.isValidISBN(b.getISBN())) {
				addedBooksT=l.addBook();
				aT=addedBooksT.size();
				System.out.println(aT +" Books Added");
				for(i=0;i<addedBooksT.size();i++) {
						System.out.println(i+1+"-"+addedBooksT.get(i).getTitle()+"  "+ addedBooksT.get(i).getAuthor()+"  "+addedBooksT.get(i).getSignature()+"  "+addedBooksT.get(i).getISBN() + " Added!");
					}
			}
			else System.out.println(b.getTitle()+" has invalid ISBN");
			
    }
}

	@Then("the book should be added to the library")
	public void the_book_should_be_added_to_the_library() {
		if(t==1) {
			assertEquals(aT,l.getAddedBooks().size());
			
		}
	}
}
