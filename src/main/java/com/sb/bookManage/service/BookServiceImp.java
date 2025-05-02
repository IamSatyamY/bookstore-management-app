package com.sb.bookManage.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sb.bookManage.entity.Book;
import com.sb.bookManage.repository.BookRepository;

@Service
public class BookServiceImp implements BookService{

	@Autowired
	private BookRepository bookRepo;
	
	@Override
	public String insertBook(Book book) {

		try {
			
			bookRepo.save(book);
			return "book added";
			
		} catch (Exception e) {

			e.printStackTrace();
			return "Book not added";
		}
	}

	@Override
	public List<Book> getAllBooks() {
		// TODO Auto-generated method stub
		return bookRepo.findAll();
	}

	@Override
	public Book updateBookById(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean deleteBookById(int id) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Book getBookById(int id) {
		// TODO Auto-generated method stub
		return bookRepo.findById(id).get();
	}

}
