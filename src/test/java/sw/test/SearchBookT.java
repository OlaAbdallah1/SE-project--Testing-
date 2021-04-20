package sw.test;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import java.util.*;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import sw.main.*;

public class SearchBookT {
	private Library library=new Library();
	private String title;
	private String author;
	private String signature;
	private String iSBNn;
    int fBooks;
    private String t;
	protected List <Book> foundedBooks = new ArrayList<>();
	
	@Given("a book with the title {string}")
	public void a_book_with_the_title(String Title) {
		title=Title;
	}
	@When("the customer searches for books have a substring {string}")
	public void the_customer_searches_for_books_have_a_substring(String subtitle) {
		foundedBooks=library.searchBooksubTitle(subtitle);
		for (int j=0;j<foundedBooks.size();j++) {
			String title2 = foundedBooks.get(j).getTitle();
			assertTrue(title2.contains(subtitle));
			fBooks++;
		}
		if (foundedBooks.size()==0) {
			System.out.println("No Books found with this title");
		}
		else {
		System.out.println("Books Founded with sub string "+ "\"" + subtitle+ "\"" + " " + fBooks + " titles");
		}
		t=subtitle;
	}

	@Then("{int} books should have been found")
	public void books_should_have_been_found(Integer Booksfounded) {
			Booksfounded=fBooks;
			assertEquals((Integer)foundedBooks.size(),Booksfounded);
	}
	@Then("Book should have the title {string}")
	public void book_should_have_the_title(String title1) { 
		Boolean b=false;
		for (int j=0;j<foundedBooks.size();j++) {
			 b=title1.contains(t);
			 assertEquals(true, b);
			 System.out.println(title1);
		}	
	  }
	

	//------------Author-------------------
	@Given("a book for author {string}")
	public void a_book_for_author(String Author) {
	    author=Author;
	}

	@When("the customer searches for book's author have a substring {string}")
	public void the_customer_searches_for_book_s_author_have_a_substring(String subAuthor) {
		foundedBooks=library.searchBooksubAuthor(subAuthor);
		for (int j=0;j<foundedBooks.size();j++) {
			String author2 = foundedBooks.get(j).getAuthor();
			assertTrue(author2.contains(subAuthor));
			fBooks++;	
		}
		if (foundedBooks.size()==0) {
			System.out.println("No Books found for this author");
		}
		else {
		System.out.println("Authors Founded with sub string "+ "\"" + subAuthor+ "\"" + " " + fBooks);
		} 
		t=subAuthor;	 
	}

	@Then("{int} books for the author should have been found")
	public void books_for_the_author_should_have_been_found(Integer Booksfounded) {
		Booksfounded=fBooks;
		Integer size = (Integer)foundedBooks.size();
		assertEquals(size, Booksfounded);
	}

	@Then("Book should have for {string}")
	public void book_should_have_for(String author1) {
		Boolean b=false;
		for (int j=0;j<foundedBooks.size();j++) {
			 b=author1.contains(t);
			 assertEquals(true, b);
			 System.out.println(author1);
		}
		}

	//-----------Signature-----------
	@Given("a book  with signature {string}")
	public void a_book_with_signature(String Signature) {
	    signature=Signature;
	}

	@When("the customer searches for book with signature have a substring {string}")
	public void the_customer_searches_for_book_with_signature_have_a_substring(String subSignature) {
		foundedBooks=library.searchBooksubSignature(subSignature);
		for (int j=0;j<foundedBooks.size();j++) {
			String signature2 = foundedBooks.get(j).getSignature();
			assertTrue(signature2.contains(subSignature));
			fBooks++;	
		}
		if (foundedBooks.size()==0) {
			System.out.println("No Books found with this signature");
		}
		else  {
		System.out.println("Signatures Founded with sub string "+ "\"" + subSignature+ "\"" + "= " + fBooks);
		}
		t=subSignature;	
	}
	

	@Then("{int} books with this signature should have been found")
	public void books_with_this_signature_should_have_been_found(Integer Booksfounded) {
		Booksfounded=fBooks;
		Integer size = (Integer)foundedBooks.size();
		assertEquals(size,Booksfounded);	
	}
	@Then("Book should have with signature {string}")
	public void book_should_have_with_signature(String signature1) {
		Boolean b=false;
		int j;
		for (j=1;j<=foundedBooks.size();j++) {
			 b=signature1.contains(t);
			 assertEquals(true, b);	
			 System.out.println(signature1);
		}
	}

	//---------ISBN------------
	@Given("a book  with ISBN {string}")
	public void a_book_with_isbn(String iSBN) {
		iSBNn=iSBN;
	}

	@When("the customer searches for book with ISBN {string}")
	public void the_customer_searches_for_book_with_isbn(String isbn) {
		foundedBooks=library.searchBookISBN(isbn);
		for (int j=0;j<foundedBooks.size();j++) {
			String isbn2 = foundedBooks.get(j).getISBN();
			assertEquals(isbn2,isbn);
			fBooks++;	
		}
		if (foundedBooks.size()==0) {
			System.out.println("No Books found with this ISBN");
		}
		else {
		System.out.println("Book Founded with "+ "\"" + isbn + "\"" + "= " + fBooks);
		} 
		t=isbn;	
	}

	@Then("{int} books with this ISBN should have been found")
	public void books_with_this_isbn_should_have_been_found(Integer Booksfounded) {
		Booksfounded=fBooks;
		Integer size = (Integer)foundedBooks.size();
		assertEquals(size,Booksfounded);
	}

	@Then("Book should have with ISBN {string}")
	public void book_should_have_with_isbn(String ISBN1) {
		Boolean b=false;
		int j;
		for (j=1;j<=foundedBooks.size();j++) {
			 b=ISBN1.equals(t);
			 assertEquals(true, b);	
		}
		if(foundedBooks.size()>0) {
			for(int k=0;k<foundedBooks.size();k++) {
				String title2 = foundedBooks.get(k).getTitle();
				String author2 = foundedBooks.get(k).getAuthor();
				String signature2 = foundedBooks.get(k).getSignature();
				String isbn = foundedBooks.get(k).getISBN();
				System.out.println(title2+" "+author2+" "+signature2+" "+isbn+" " );
			}
		}
	  }
}
