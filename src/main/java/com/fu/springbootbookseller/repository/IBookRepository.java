package com.fu.springbootbookseller.repository;

import com.fu.springbootbookseller.model.Book;
import org.springframework.data.jpa.repository.JpaRepository;



public interface IBookRepository extends JpaRepository<Book, Long> {

}
