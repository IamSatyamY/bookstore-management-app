package com.sb.bookManage.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.sb.bookManage.service.MyBookService;

@org.springframework.stereotype.Controller
public class MyBookController {
	
	@Autowired
	private MyBookService mybkservice;
	
	@GetMapping("/deletebook/{id}")
	public String deleteBook(@PathVariable("id") int id) {
		 mybkservice.deleteBookById(id);
		 return "redirect:/my-books";
	}
}
