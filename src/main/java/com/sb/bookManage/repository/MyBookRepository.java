package com.sb.bookManage.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.sb.bookManage.entity.MyBook;

@Repository
public interface MyBookRepository extends JpaRepository<MyBook, Integer>{

}
