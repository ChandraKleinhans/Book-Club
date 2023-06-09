package com.codingdojo.BookClub.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.codingdojo.BookClub.models.Book;
import com.codingdojo.BookClub.repositories.BookRepository;

@Service
public class BookService {

		@Autowired
		private BookRepository bookRepo;
		
		
		// get all
		public List<Book> allBooks(){
			return bookRepo.findAll();
		}
		
		
		//find one
		public Book getOneBook(Long id) {
			Optional<Book> optionalBook = bookRepo.findById(id);
			if(optionalBook.isPresent()) {
				return optionalBook.get();
			}else {
				return null;
			}
		}
		
		//create a book
		public Book createBook(Book book) {
			return bookRepo.save(book);
		}
		
		//update a book
		public Book updateBook(Book book) {
			return bookRepo.save(book);
		}
		
		//delete book by id
		public void deleteBook(Long id) {
			bookRepo.deleteById(id);
		}
}