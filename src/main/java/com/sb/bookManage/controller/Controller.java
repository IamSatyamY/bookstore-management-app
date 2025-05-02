package com.sb.bookManage.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import com.sb.bookManage.entity.Book;
import com.sb.bookManage.entity.MyBook;
import com.sb.bookManage.service.BookService;
import com.sb.bookManage.service.MyBookService;

@org.springframework.stereotype.Controller
public class Controller {
	
	@Autowired
	private BookService bkservice;
	
	@Autowired		
	private MyBookService mybkservice;
	
	@GetMapping("/")
	public String homePage() {
		return "home";
	}
	@GetMapping("/all-books")
	public ModelAndView allBooks() {
		List<Book> bklist =  bkservice.getAllBooks();
		return new ModelAndView("allbooks","books",bklist);
	}
	@GetMapping("/my-books")
	public String myBooks(Model model) {
		List<MyBook> mybooks =  mybkservice.getAllBooks();
		model.addAttribute("mb",mybooks);
		return "mybooks";
	}
	
	
	@GetMapping("/my-books/{id}")
	public String getMyBooks(@PathVariable("id") int id) {
		Book book = bkservice.getBookById(id);
		MyBook mb = new MyBook(book.getId(),book.getBookName(),book.getAuthorName(),book.getPrice());
		mybkservice.saveMyBook(mb);
		return "redirect:/my-books";
	}

	
	
	@GetMapping("/add-book")
	public String addBookForm(Model model, Book book) {
		
		return "addbook";
	}
	
	@PostMapping("/save")
	public String addBookFormSubmit(@ModelAttribute Book b) {
		bkservice.insertBook(b);
		return "redirect:/all-books";
	}
	
	@GetMapping("/editbook/{id}")
	public String editbook(@PathVariable("id") int id,Model model) {
		Book b = bkservice.getBookById(id);
		model.addAttribute("book", b);
		return "editbook";
	}
}
