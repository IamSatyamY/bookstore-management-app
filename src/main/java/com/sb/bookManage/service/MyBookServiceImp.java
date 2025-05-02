package com.sb.bookManage.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sb.bookManage.entity.MyBook;
import com.sb.bookManage.repository.MyBookRepository;

@Service
public class MyBookServiceImp implements MyBookService{
	@Autowired
	private MyBookRepository mybkRepo;
	
	@Override
	public MyBook saveMyBook(MyBook book) {
		// TODO Auto-generated method stub
		return mybkRepo.save(book);
	}

	@Override
	public List<MyBook> getAllBooks() {
		// TODO Auto-generated method stub
		return mybkRepo.findAll();
	}

	@Override
	public String deleteBookById(int id) {
		// TODO Auto-generated method stub
		try {
			 mybkRepo.deleteById(id);
			 return "deleted";
			
		} catch (Exception e) {
			// TODO: handle exception
			return "not deleted";
		}
	}

}
