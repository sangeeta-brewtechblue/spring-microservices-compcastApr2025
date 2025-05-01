/**
 * 
 */
package com.sj.rest.car_demo.dao;

import java.util.Iterator;
import java.util.Optional;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import com.sj.rest.car_demo.db.Database;
import com.sj.rest.car_demo.model.Book;


/**
 * @author HP
 *
 */
@Component(value="bookdao")
public class BookDAO {
	@Autowired
	@Qualifier("db")
	Database booksDB;	
	
	/**
	 * 
	 */
	public BookDAO() {
		super();
		
		booksDB= new Database();
		// TODO Auto-generated constructor stub
	}
	
	public Set <Book> viewAllBooks() {
		return booksDB.getBookSet();
		
	}
	
	public Optional<Book> viewByname(String name) {
		System.out.println("here"+name);
        Book   bookFound = null;
		for (Book b : booksDB.getBookSet()) {
			if (b.getTitle().equals(name)) {
				bookFound=b;
				System.out.println(b);
				break;
			}
		}
		
       return Optional.of(bookFound);
	}

	public void insert(Book b) {

		// TODO Auto-generated method stub
	     booksDB.getBookSet().add(b);
	
	}

	public void deleteBook(int id) {

		// TODO Auto-generated method stub
		boolean notFound = true;
		Iterator<Book> itr = booksDB.getBookSet().iterator();

		while (itr.hasNext()) {

			Book book = itr.next();
			if (book.getBookId() == id) {
				notFound = false;

				itr.remove();
				System.out.println("book deleted");
			}

		}
		if (notFound) {
			System.out.println("no book found");
		}

	}

	public void updatePrice(int id, double price) {
		
		 Book   bookFound = null;
			for (Book b : booksDB.getBookSet()) {
				if (b.getBookId()==id) {
					bookFound=b;
					//System.out.println(b);
					break;
				}
		}
	       
		Iterator<Book> itr = booksDB.getBookSet().iterator();
		while (itr.hasNext()) {

			if (itr.next().getBookId() == id) {
				itr.remove();
			}
			
		  }
				
		        Book b = new Book(id, price);
		        b.setTitle(bookFound.getTitle());
		        b.setAuthor(bookFound.getAuthor());
				booksDB.getBookSet().add(b);		
	}

	public Book getBookById(int id) {
		// TODO Auto-generated method stub
		 Book   bookFound = null;
			for (Book b : booksDB.getBookSet()) {
				if (b.getBookId()==id) {
					bookFound=b;
					System.out.println(b);
					break;
				}
		   
	         }
			return bookFound;

	}
}

