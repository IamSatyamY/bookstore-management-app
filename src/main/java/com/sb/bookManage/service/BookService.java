package com.sb.bookManage.service;

import java.util.List;
import java.util.Optional;

import com.sb.bookManage.entity.Book;

public interface BookService {
	String insertBook(Book book);
	List<Book> getAllBooks();
	
	Book getBookById(int id);
	Book updateBookById(int id);
	boolean deleteBookById(int id);
}
