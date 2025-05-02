package com.sb.bookManage.service;

import java.util.List;

import com.sb.bookManage.entity.MyBook;

public interface MyBookService {
	MyBook saveMyBook(MyBook book);
	List<MyBook> getAllBooks();
	String deleteBookById(int id);
}
