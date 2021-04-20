package sw.main;
import java.util.*;

public class Library {
	
	protected List <Book> array=new ArrayList <> ();
	protected List <Book> addedBooks = new ArrayList<>();
	static String[] titles= {"Test-Drivenest Driven Development","Web Development","OOP - Object Oriented Programming","Test Book","Done Book"};
	static String[] authors= {"Kent Beck","Jon Bloch","Jon Brown","Ola Abdallah","Dana Shami"};
	static String[] signatures= {"Beck2002","Bloch2007","Brown2002","Abdallah2010","Shami2021"};
	static String[] iSBNs= {"1499311095","1066199591","007462542X","10658714","007462542a"};
	Book o;
	
	public List <Book> getAddedBooks() {
		return addedBooks;
	}
	
	public void booktestadding() {
		for(int i = 0; i < 5; i++) {
				o=new Book(titles[i],authors[i],signatures[i],iSBNs[i]);
					array.add(o);
		}
	}
	public List <Book> addBook() {
		booktestadding();
			Book b2;	 
			for(int k=0;k<array.size();k++) {
			   b2=array.get(k);
			   if (isValidISBN(b2.getISBN())) {
				   getAddedBooks().add(b2);
			   }
			}
			return getAddedBooks();
	}
	
	 public boolean isValidISBN(String isbn) { 
	        int n = isbn.length(); 
	        if (n != 10) //10-ISBN
	            return false; 
	        int sum = 0; 
	        for (int i = 0; i < 9; i++){ 
	            int digit = isbn.charAt(i) - '0'; 
	            sum += (digit * (10 - i)); 
	        }  
	        char last = isbn.charAt(9); 
	        sum += ((last == 'X') ? 10 : (last - '0')); 
	        return (sum % 11 == 0); 
	    } 
	 
	public List <Book> searchBooksubTitle(String subtitle) { 
		addBook();
		boolean t=false;				 	
	    Book b;
	    List <Book> result = new ArrayList<>();
		for(int i=0;i<getAddedBooks().size();i++) {
				b=getAddedBooks().get(i);
				t=b.getTitle().contains(subtitle);
				if(t) {
					result.add(b);
			   }	
			}
		return result;
	}

	public List<Book> searchBooksubAuthor(String subAuthor) {
		addBook();
     boolean t=false;				 	
		Book b;
		List <Book> result = new ArrayList<>();
		for(int i=0;i<getAddedBooks().size();i++) {
				b=getAddedBooks().get(i);
				t=b.getAuthor().contains(subAuthor);
				if(t) {
					result.add(b);
			    }				
	}
	return result;	
	}

	public List<Book> searchBooksubSignature(String subSignature) {
		addBook();
		boolean t=false;				 	
		Book b;
		List <Book> result = new ArrayList<>();
		for(int i=0;i<getAddedBooks().size();i++) {
				b=getAddedBooks().get(i);
				t=b.getSignature().contains(subSignature);
				if(t) {
					result.add(b);
			    }	
		}
	return result;
	}
	public List<Book> searchBookISBN(String iSBN) {
		addBook();
		boolean t=false;				 	
		Book b;
		List <Book> result = new ArrayList<>();
		for(int i=0;i<getAddedBooks().size();i++) {
				b=getAddedBooks().get(i);
				t=b.getISBN().equals(iSBN);
				if(t) {
					result.add(b);
			    }	
		}
	return result;
	}

	
}
