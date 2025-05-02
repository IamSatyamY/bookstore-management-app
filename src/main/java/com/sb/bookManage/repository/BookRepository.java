package com.sb.bookManage.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.sb.bookManage.entity.Book;

@Repository
public interface BookRepository extends JpaRepository<Book, Integer>{

}
